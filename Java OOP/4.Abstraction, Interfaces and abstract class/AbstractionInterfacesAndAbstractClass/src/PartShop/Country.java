package PartShop;

public class Country {
 	private String countryName;

 	
 	public Country(String countryName){
 		setCountryName(countryName);
 	}
 	
 	
	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		if(countryName != null && !countryName.equals("") )
		this.countryName = countryName;
	}
}
