package DistrictCourt;

public abstract class Grajdanin {
	private String fullName;
	private String addresGrajdanin;
	private int age;
	
	
	
	public Grajdanin(String fullname, String addresGrajdanin, int age) {
		setFullName(fullname);
		setAddresGrajdanin(addresGrajdanin);
		setAge(age);
	}
	
	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		if(fullName != null && !fullName.equals("")){
			this.fullName = fullName;
		}
	}
	
	public String getAddresGrajdanin() {
		return this.addresGrajdanin;
	}
	public void setAddresGrajdanin(String addresGrajdanin) {
		if(addresGrajdanin != null && !addresGrajdanin.equals("")){
			this.addresGrajdanin = addresGrajdanin;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age>0 && age<100){
			this.age = age;
		}
	}
	
	
	
}
