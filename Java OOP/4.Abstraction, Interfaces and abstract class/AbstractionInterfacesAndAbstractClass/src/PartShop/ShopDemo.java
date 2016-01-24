package PartShop;

public class ShopDemo {

	public static void main(String[] args) {
		Shop megaParts = new Shop(10);
		megaParts.setMoneyInCash(10000);
		
		
		PartCategory hodovaChast = new PartCategory(1, "Hodova chast");
		PartCategory gumi = new PartCategory(2, "Gumi i Djanti");
		PartCategory engine = new PartCategory(3, "Engine");
		PartCategory accessories = new PartCategory(4, "Accessories");
		
		Part nosach =  new Part(11, "Nosach", hodovaChast, 200, 250);
		Part resor = new Part(12, "Resor", hodovaChast, 300, 400);
		Part guma = new Part(21, "Guma 18cola", gumi, 250, 310);
		Part djanta = new Part(22, "Djanta 18cola", gumi, 400, 470);
		Part bolt = new Part(23, "Bolt", gumi, 5.5, 7.5);
		Part delko = new Part(31, "Delko", engine, 80, 120);
		Part cjistachka = new Part(41, "Chistachka", accessories, 10, 15);
		Part stelka = new Part(42, "Stelka", accessories, 20, 30);
		
		
		megaParts.orderOfPart(nosach);
		megaParts.orderOfPart(resor);
		megaParts.orderOfPart(guma);
		megaParts.orderOfPart(djanta);
		megaParts.orderOfPart(bolt);
		megaParts.orderOfPart(delko);
		megaParts.orderOfPart(cjistachka);
		megaParts.orderOfPart(stelka);
		
		System.out.println("Money in shop cash desk after ordering: "+megaParts.getMoneyInCash());
		
		megaParts.saleOfPart(guma);
		megaParts.saleOfPart(djanta);
		megaParts.saleOfPart(bolt);
		
		System.out.println("Money in shop after sales: "+megaParts.getMoneyInCash());
		
		System.out.println(megaParts.partIndex);
		megaParts.revision();
		System.out.println(megaParts.partIndex);
		
		megaParts.orderOfPart(guma);
		
		
		
	}

}
