package Zoo;

public class Dog extends Animal {
	boolean isDangerous;
	void bringStick(){
		System.out.println("Hei, bring the stick!");
	}
	@Override
	public void makeSomeNoise() {
		System.out.println("Dog make bau bau..");
		
	}
	
}
