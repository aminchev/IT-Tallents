package MusicShop;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class InstrumntDistributor implements Runnable {
	private IShop shop;
	//String-instrument name, Integer - time for delivery
	private TreeMap<String, Integer> offeredInstruments;
	
	
	public InstrumntDistributor() {
		this.setShop(shop);
		this.offeredInstruments = new TreeMap<String, Integer>();
	}
	
	@Override
	public void run() {
	    while(true){
			while (this.getShop().isNeedFromDeliveries() == false){
	    		synchronized (shop) {
					System.out.println(Thread.currentThread().getName() + " no need from delivery!"
							+ "I will wait some product to be exhauted!");
					 try {
						shop.wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return;
					}
				}
	    	}
	    	
    		System.out.println(Thread.currentThread().getName() + " some instrument are exhauted!"
    				+ "I will see all and add where is needed");
    		synchronized (shop) {
    			this.getShop().addMissingInstruments();
    			System.out.println("All missing products are loaded with +10 counts for each");
    			shop.notifyAll();
			}
	    		
	    	
	    }
		
	}
	
	
	void addInstrumentsForSale(String name, int periodForDelivery){
		if(name!= null && !name.equals("") && periodForDelivery>0){
			if(!offeredInstruments.containsKey(name)){
				offeredInstruments.put(name, periodForDelivery);
			}
			
		}
	}
	
	void timeForDeliveryOfInstrument(String instrumenName){
		if(instrumenName!=null && instrumenName.length()>0){
			for(String instrument:offeredInstruments.keySet()){
				if(instrument.equals(instrumenName)){
					System.out.println("This instrument can be delivered for " + 
							offeredInstruments.get(instrument)+ " days!");
					return;
				}
			}
			System.out.println("We do not offer such instument!");
		}
	}
	
	
	public IShop getShop() {
		return shop;
		
	}

	public void setShop(IShop shop) {
		if(shop!= null){
			this.shop = shop;
		}
	}

}
