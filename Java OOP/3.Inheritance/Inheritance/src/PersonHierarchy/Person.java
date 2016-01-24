package PersonHierarchy;

public class Person {
	private String name;
	private int age;
	private boolean isMale;
	boolean isStudent;
	boolean isEmployee;
	
	//getter for name
	 String getName(){
		return this.name;
	}
	//setter for name 
	 void setName(String name){
		 if(name != null && !name.equals("")){
			 this.name = name;
		 }
	 }
	 //getter for age
	 int getAge(){
		 return this.age;
	 }
	 //setter for age
	 void setAge(int age){
		 if(age>0 && age<120){
			 this.age = age;
		 }
	 }
	 //getter for isMale
	 boolean getIsMale(){
		 return this.isMale;
	 }
	 //setter for isMale
	 void setIsMale(boolean isMale){
		 this.isMale = isMale;
	 }
	 
	 Person(String name, int age, boolean isMale){
		 setName(name);
		 setAge(age);
		 setIsMale(isMale);
	 }
	 
//	 @Override
//	 public String toString(){
//		 return "Name " + this.getName() + ", age:" + this.getAge() + ", is male:" + this.getIsMale();
//	 }
	 
	 void showPersonInfo(){
		 System.out.println("Person name is:" + this.getName());
		 System.out.println("Person age is:" + this.getAge());
		 System.out.println("Person is male:" + this.getIsMale());
//		 System.out.println(this.toString());
		 System.out.println();
	 }
	
	
}
