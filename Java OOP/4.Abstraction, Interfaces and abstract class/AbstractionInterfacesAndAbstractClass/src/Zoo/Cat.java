package Zoo;

public class Cat extends Animal {
	
	int age;
	String name;
	
	void climb(){
		System.out.println("Cat climbing");
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("Cat make miau miau..");
	}

	
}
