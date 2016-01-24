package Zoo;

public class Bird extends Animal {
	
	void flying(){
		System.out.println("Fly like a bird!");
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("Churulik, churulik");
		
	}
	
}
