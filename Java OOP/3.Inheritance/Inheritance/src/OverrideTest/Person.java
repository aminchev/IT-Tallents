package OverrideTest;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	 
	@Override
	 public boolean equals(Object obj){
		return ((Person)obj).name.equals(this.name);
	}
	@Override
	public String toString(){
		return this.name;
		
	}
	

	
}
