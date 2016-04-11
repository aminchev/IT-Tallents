package Exam;

public class Address {
	private String town;
	private String street;
	
	
	public Address(String town, String street) {
		this.setTown(town);
		this.setStreet(street);
	}


	public String getTown() {
		return town;
	}


	private void setTown(String town) {
		if(town!= null && town.length()>0){
			this.town = town;
		}
	}


	public String getStreet() {
		return street;
	}


	private void setStreet(String street) {
		if(street!=null && street.length()>0){
			this.street = street;
		}
	}
}
