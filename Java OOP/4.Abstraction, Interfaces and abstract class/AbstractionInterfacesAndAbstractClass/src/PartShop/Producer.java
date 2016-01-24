package PartShop;

public class Producer {
	private String producerName;
	private Country country;
	private String adres;
	private String phoneNumber;
	private String faxNumber;
	
	public Producer(String producerName, Country country, String phoneNumber) {
		setProducerName(producerName);
		setCountry(country);
		setPhoneNumber(phoneNumber);
	}
	
	
	
	public String getProducerName() {
		return this.producerName;
	}
	public void setProducerName(String producerName) {
		if(producerName != null && !producerName.equals("")){
			this.producerName = producerName;
		}
	}
	public Country getCountry() {
		return this.country;
	}
	public void setCountry(Country country) {
		if(country != null){
			this.country = country;
		}
	}
	public String getAdres() {
		return this.adres;
	}
	public void setAdres(String adres) {
		if(adres != null && !adres.equals("")){
			this.adres = adres;
		}	
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber != null && !phoneNumber.equals(""))
		this.phoneNumber = phoneNumber;
	}
	public String getFaxNumber() {
		return this.faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		if(faxNumber != null && !faxNumber.equals(""))
		this.faxNumber = faxNumber;
	}
}
