package Zoo;

public class Zoo {
	private Animal[] animals;
	
	Zoo(int freePlaces){
		if(freePlaces>0){
			animals = new Animal[freePlaces];
		}
	}
	
	void addAnimal(Animal newAnimal){
		boolean areFreePlases = false;
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] == null){
				animals[i] = newAnimal;
				areFreePlases = true;
				break;
			}
		}
		if(areFreePlases == false){
			System.out.println("No free plases in the zoo for animal with weight " + newAnimal.getWeight());
		}
	}
	
}
