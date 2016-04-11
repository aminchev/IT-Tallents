package Exam;

public abstract class Person  {
	private String name;
	private String phoneNumber;
	private String privateNumber;
	private Address address;
	
	public Person(String name, String phoneNumber,String privateNumber, Address address) {
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
		this.setPrivateNumber(privateNumber);
		this.setAddress(address);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if(name!= null && name.length()>0){
			this.name = name;
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	private void setPhoneNumber(String phoneNumber) {
		if(phoneNumber!=null && phoneNumber.length()==10){
			this.phoneNumber = phoneNumber;
		}
	}

	public Address getAddress() {
		return address;
	}

	private void setAddress(Address address) {
		if(address!= null){
			this.address = address;
		}
	}

	public String getPrivateNumber() {
		return privateNumber;
	}

	private void setPrivateNumber(String privateNumber) {
		if(privateNumber.length() == 10){
			this.privateNumber = privateNumber;
		}
	}
	
}
