package Zoo;

public abstract class Animal {
	private int age;
	private double weight;
	
	
	//getter for age
	int getAge(){
		return this.age;
	}
	//setter for age
	void setAge(int age){
		if(age>0){
			this.age = age;
		}
	}
	//getter for weight
	double getWeight(){
		return this.weight;
	}
	//setter for weight
	void setWeight(double weight){
		if(weight>0){
			this.weight = weight;
		}
	}
	
	public void breathe(){
		System.out.println("Breathig...");
	}
	public void walk(){
		System.out.println("Walking...");
	}
	
	public abstract void makeSomeNoise();
}
