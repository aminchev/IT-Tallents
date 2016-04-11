package TestLib4Again;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class LibraryMan implements Runnable {
	
	private Map<ReadingMaterial, Double> takenMaterials;
	
	public LibraryMan() {
		takenMaterials = new HashMap<ReadingMaterial, Double>();
	}
	
	void addTakenMaterialToWatch(ReadingMaterial material) throws LibraryException{
		if(material != null){
			synchronized (material) {
				takenMaterials.put(material, material.getPrice());
			}
			
		}
	}
	
	void removeMaterialToWatch(ReadingMaterial material){
		if(material!=null && takenMaterials.containsKey(material)){
			synchronized (material) {
				takenMaterials.remove(material);
			}
		}
	}
	
	Double howMuchMustBePaid(ReadingMaterial material){
		return takenMaterials.get(material);
	}
	
	SortedSet<ReadingMaterial> getAllReadingMaterialOrdered(){
		TreeSet<ReadingMaterial> sortedRedaingMaterials = new TreeSet<ReadingMaterial>(new ReadingMaterialComparator());
		for(ReadingMaterial material:takenMaterials.keySet()){
			sortedRedaingMaterials.add(material);
		}
		return sortedRedaingMaterials;
	}
	
	int countOfAllTakenMaterials(){
		return takenMaterials.size();
	}

	@Override
	public void run() {
		while(true){
			for(ReadingMaterial material:takenMaterials.keySet()){
				try {
					int timeThatThisMaterialCanBeTaken = material.getSecondForTake();
					LocalDateTime whenMaterialWasTakenFromLibrary = material.whenMaterialIsTaken();
					Duration duration  = Duration.between(whenMaterialWasTakenFromLibrary, LocalDateTime.now());
					int periodOfTaking = (int) duration.getSeconds();
					if(periodOfTaking>timeThatThisMaterialCanBeTaken){
						int delayInSeconds = periodOfTaking-timeThatThisMaterialCanBeTaken;
						Double money = material.getPrice() + delayInSeconds*(0.01*material.getPrice());
						
						synchronized (money) {
							takenMaterials.put(material, money);
						}
						
					}
					
					
				} catch (LibraryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
