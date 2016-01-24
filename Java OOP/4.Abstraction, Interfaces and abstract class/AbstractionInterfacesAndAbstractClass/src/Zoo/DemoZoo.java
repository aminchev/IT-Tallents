package Zoo;

public class DemoZoo {
	public static void main(String[] args) {
		Dog balkan = new Dog();
		Cat maca = new Cat();
		Animal sova = new Bird();
		
		Zoo park = new Zoo(2);
		
		balkan.bringStick();
		balkan.makeSomeNoise();
		balkan.setWeight(20);
		
		maca.climb();
		maca.makeSomeNoise();
		maca.setWeight(5.0);
		
		sova.setWeight(1);
		
		park.addAnimal(balkan);
		park.addAnimal(sova);
		park.addAnimal(maca);
		
		Cat a = new Cat();
		a.age = 2;
		a.name = "Ala";
		
		Cat b = new Cat();
		b.age = 2;
		b.name = "Ala";
		System.out.println(a.equals(b));
		
	}
}
