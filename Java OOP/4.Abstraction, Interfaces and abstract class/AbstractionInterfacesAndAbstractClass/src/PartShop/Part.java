package PartShop;

public class Part {
    private	int codeNumber;
	private String partName;
	private PartCategory category;
	private double buyPrice;
	private double sellPrice;
	private Automobil[] cars;
	private Producer company;
	
	public Part(int codeNumber, String partName, PartCategory category, double buyPrice, double sellPrice ) {
		setCodeNumber(codeNumber);
		setPartdName(partName);
		setCategory(category);
		setBuyPrice(buyPrice);
		setSellPrice(sellPrice);
	}
	
	
	

	public PartCategory getCategory() {
		return this.category;
	}
	public void setCategory(PartCategory category) {
		if(category != null){
			this.category = category;
		}
	} 
	
	public double getBuyPrice() {
		return this.buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		if(buyPrice>0){
			this.buyPrice = buyPrice;
		}	
	}
	
	public double getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		if(sellPrice>0){
			this.sellPrice = sellPrice;
		}	
	}
	
	public Automobil[] getCars() {
		return this.cars;
	}
	public void setCars(Automobil[] cars) {
		if(cars != null){
			this.cars = cars;
		}
	}
	
	public Producer getCompany() {
		return this.company;
	}
	public void setCompany(Producer company) {
		if(company != null){
			this.company = company;
		}
	}

	int getCodeNumber(){
		return this.codeNumber;
	}
	void setCodeNumber(int codeNumber){
		if(codeNumber>0 && codeNumber<=Integer.MAX_VALUE){
			this.codeNumber = codeNumber;
		}
	}
	
	String getPartName(){
		return this.partName;
	}
	void setPartdName(String partName){
		if(partName != null && !partName.equals("")){
			this.partName = partName;
		}
	}
}
	








		