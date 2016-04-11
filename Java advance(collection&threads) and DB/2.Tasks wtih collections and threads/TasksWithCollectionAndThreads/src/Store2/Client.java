package Store2;

public class Client implements Runnable{

	private static final int COUNT_OF_PRODUCTS_IN_ARRAY = 9;
	private static final int MIN_VALUE_FOR_QUONTITY = 1;
	private static final int MAX_VALUE_FOR_QUONTITY = 4;
	private static final int TIME_TO_SLEEP = 1000;
	private Shop shop;
	public Client(Shop shop) {
		this.shop = shop;
	}
	
	@Override
	public void run() {
		while(true){
			int quantity = (int)(Math.random()*MAX_VALUE_FOR_QUONTITY)+MIN_VALUE_FOR_QUONTITY;
			String[] productsInArray = {  "Banana", "Orange", "Apple", "Potato", "Tomato", "Cucumber", "Pork", "Beef",
					"Chicken" };
			int product = (int)(Math.random()*COUNT_OF_PRODUCTS_IN_ARRAY);
			String name = productsInArray[product];
			
			
			while(this.shop.isSearchedProductExist(name, quantity) == false){
				synchronized (shop.getStore()) {
					System.out.println(Thread.currentThread().getName()+" Taq stoka deto q tursq q nqma kolkoto iskam - she chakam!");
					try {
						this.shop.getStore().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			System.out.println(Thread.currentThread().getName() + " Trqbva da sa zaredili.Sega she pazaruvam!");
//			try {
//				Thread.sleep(TIME_TO_SLEEP);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			synchronized (shop.getStore()) {
				System.out.println(Thread.currentThread().getName() + " Kupih si " + quantity + " " + name);
				this.shop.buyProductFromShop(name, quantity);
				shop.getStore().notifyAll();
			}
		}
		
	}

}
