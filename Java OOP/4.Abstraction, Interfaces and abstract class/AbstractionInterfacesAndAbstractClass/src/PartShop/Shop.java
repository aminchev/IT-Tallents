package PartShop;

import javax.print.attribute.standard.NumberOfDocuments;

public class Shop implements IShop {
	private Part[] parts;
	private double moneyInCash;
	int partIndex = 0;
	int countOfSales=0;

	Shop(int capacity){
		if(capacity>0){
			this.parts = new Part[capacity];
		}
	}
	
	
	
	@Override
	public void orderOfPart(Part part) {
		if(part != null && part.getBuyPrice()<=this.getMoneyInCash() && partIndex<parts.length){
			this.parts[getPartIndex()] = part;
			this.moneyInCash = this.moneyInCash - part.getBuyPrice();
			setMoneyInCash(this.moneyInCash);
			setPartIndex(getPartIndex()+1);
		}
	}


	@Override
	public void saleOfPart(Part part) {
		for (int i = 0; i < getPartIndex(); i++) {
			if(part != null && this.parts[i] != null && this.parts[i].getCodeNumber() == part.getCodeNumber()){
				moneyInCash = moneyInCash + this.parts[i].getSellPrice();
				this.parts[i] = null;
				setCountOfSales(getCountOfSales()+1);
				break;
				
			}
		}
		
	}
	
	@Override
	public void revision(){
		boolean isEnd = true;
		for (int i = 0; i < partIndex; i++) {
			if(parts[i] == null){
				int j = i;
				while(parts[j]==null){
					j++;
					if(j==partIndex){
						isEnd = false;
						break;
					}
				}
				if(isEnd == false){
					break;
				}
				parts[i] = parts[j];
				parts[j] = null;
			}
		}
		//partIndex = partIndex-countOfSales;
		setPartIndex(getPartIndex() - getCountOfSales());
		//countOfSales=0;
		setCountOfSales(0);
	}
	
	
	public Part[] getParts() {
		return this.parts;
	}

	public void setParts(Part[] parts) {
		if(parts != null){
			this.parts = parts;
		}
	}
	
	double getMoneyInCash(){
		return this.moneyInCash;
	}
	
	void setMoneyInCash(double moneyInCash){
		if(moneyInCash>0){
			this.moneyInCash = moneyInCash;
		}
	}

	public int getPartIndex() {
		return this.partIndex;
	}

	public void setPartIndex(int partIndex) {
		if(partIndex>=0){
			this.partIndex = partIndex;
		}
	}

	public int getCountOfSales() {
		return this.countOfSales;
	}

	public void setCountOfSales(int countOfSales) {
		if(countOfSales>=0){
			this.countOfSales = countOfSales;
		}
	}
	
	
	
}
