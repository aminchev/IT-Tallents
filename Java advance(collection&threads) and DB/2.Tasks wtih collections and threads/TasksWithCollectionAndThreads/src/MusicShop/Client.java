package MusicShop;

public class Client implements Runnable {
	
	private static final int MIN_VALUE_FOR_QUONTITY = 1;
	private static final int MAX_VALUE_FOR_QUONTITY = 3;

	private IShop shop;

	public Client(IShop shop) {
		this.setShop(shop);
	}
	
	@Override
	public void run() {
		while(true){
			int quantity = (int)(Math.random()*MAX_VALUE_FOR_QUONTITY)+MIN_VALUE_FOR_QUONTITY;
			String[] possibleInstumentForBuy = {"Kitara", "Piano", "Cigulka", "Baraban", "Trompet"};
			int indexOfInstrument = (int)(Math.random()*possibleInstumentForBuy.length);
			String nameOfInstrument = possibleInstumentForBuy[indexOfInstrument];
			while(this.getShop().canIBuyInstrument(nameOfInstrument, quantity) == false){
				synchronized (shop) {
					System.out.println(Thread.currentThread().getName() + " searched instrument is not "
							+ "exising. He will wait for it! He/she searched for " + quantity + " " + nameOfInstrument);
					try {
						shop.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return;
					}
				}
			}
			
			System.out.println(Thread.currentThread().getName() + " will buy instument!");
			synchronized (shop) {
				this.getShop().buyInstrumentFromShop(nameOfInstrument, quantity);
				System.out.println(Thread.currentThread().getName()+ " bought " + quantity + " " + nameOfInstrument);
				shop.notifyAll();
			}
		}
	
	}
	
	void orderInstrument(String instrumentName){
		if(instrumentName!= null && !instrumentName.equals("")){
			this.shop.makeRequestForInstrument(instrumentName);
		}
	}

	public IShop getShop() {
		return shop;
	}
	
	private void setShop(IShop shop) {
		if(shop!= null){
			this.shop = shop;
		}
	}
	
}
