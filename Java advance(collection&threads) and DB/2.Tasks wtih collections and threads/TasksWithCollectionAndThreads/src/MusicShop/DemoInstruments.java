package MusicShop;

import java.util.TreeSet;

public class DemoInstruments {

	public static void main(String[] args) {
	
		InstrumntDistributor spasDistrib = new InstrumntDistributor();
		Shop shop = new Shop(0);
		
		shop.addNewInstrumentsInTheShop("Strunen", "Kitara", 200, 14);
		shop.addNewInstrumentsInTheShop("Klavishen", "Piano", 1200, 15);
		shop.addNewInstrumentsInTheShop("Strunen", "Cigulka", 1000, 13);
		shop.addNewInstrumentsInTheShop("Duhov", "Fleita", 300, 10);
		shop.addNewInstrumentsInTheShop("Udaren", "Baraban", 100, 25);
		shop.addNewInstrumentsInTheShop("Duhov", "Trompet", 250, 18);
		
		shop.sellInstrument("Kitara", 3);
		shop.sellInstrument("Piano", 5);
		shop.sellInstrument("Piano", 2);
		shop.sellInstrument("gdf", 4);
		shop.sellInstrument("Baraban", 9);
		
		
		
		TreeSet<Instrument> sortedInstrumentByType = shop.catalogOfSortedInstrumentsByCriteria("type");
		for(Instrument instr:sortedInstrumentByType){
			System.out.println(instr);
		}

		System.out.println();
		TreeSet<Instrument> sortedInstumentsByPriceAsc = shop.catalogOfSortedInstrumentsByCriteria("priceAsc");
		for(Instrument instr:sortedInstumentsByPriceAsc){
			System.out.println(instr);
		}
		
		System.out.println();
		shop.spravkaForShopWork();
		
		
		shop.setDistributor(spasDistrib);
		spasDistrib.setShop(shop);
		Client ivan = new Client(shop);
		Client georgi = new Client(shop);
		Client mara = new Client(shop);
		
		spasDistrib.addInstrumentsForSale("Piano", 30);
		spasDistrib.addInstrumentsForSale("Cigulga", 50);
		spasDistrib.addInstrumentsForSale("Fleita", 10);
		spasDistrib.addInstrumentsForSale("Akordeon", 20);
		spasDistrib.addInstrumentsForSale("Tupan", 30);
		spasDistrib.addInstrumentsForSale("Tuba", 8);
		spasDistrib.addInstrumentsForSale("Daire", 2);
		spasDistrib.addInstrumentsForSale("Trompet", 11);
		spasDistrib.addInstrumentsForSale("Arfa", 40);
		spasDistrib.addInstrumentsForSale("Trombon", 25);
		
		ivan.orderInstrument("Fagon");
		ivan.orderInstrument("Akordeon");
		
		Thread distrThread = new Thread(spasDistrib, "Spas dostavchika");
		distrThread.start();
		
		Thread clientThread1 = new Thread(ivan, "Ivan clienta");
		clientThread1.start();
		Thread clientThread2 = new Thread(georgi, "Georgi clienta");
		clientThread2.start();
		Thread clientThread3 = new Thread(mara, "Mara clienta");
		clientThread3.start();
		
		
	}

}
