package ExamTaskHome;

public class Address {
	private String city;
	private String street;
	
	public Address(String city, String street) {
		this.city = city;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	private void setCity(String city) {
		if(city != null && city.length()>0){
			this.city = city;
		}
	}

	public String getStreet() {
		return street;
	}

	private void setStreet(String street) {
		if(street != null && street.length()>0){
			this.street = street;
		}
	}
}
