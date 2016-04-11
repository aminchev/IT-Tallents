package KristiqnExam;

public abstract class Person {
	
	private final String name;
	private String city;
	private String telNum;
	
	
	
	public Person(String name, String city, String telNum) {
		//VALIDACII MAINA
		this.name = name;
		this.city = city;
		this.telNum = telNum;
	}


	public String getName() {
		return name;
	}
	
	
	//VALIDACII
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", telNum=" + telNum + "]";
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		if(city!=null)
		this.city = city;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		if(telNum!=null)
		this.telNum = telNum;
	}
	
	
	
	
	
	
}
