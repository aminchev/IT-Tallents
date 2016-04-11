package TestLib3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class LibraryMan extends Thread {

	private Map<ReadingMaterial, Double> materialsToFollow;
	
	public LibraryMan(){
		this.setDaemon(true);
		materialsToFollow = new HashMap<ReadingMaterial, Double>();
	}
	
	int counter = 0;
	public int getNumberOfTakenMaterials(){
		return materialsToFollow.size();
	}
	
	public SortedSet<ReadingMaterial> getMaterialsByDatesTaken(){
		TreeSet<ReadingMaterial> set =  new TreeSet<ReadingMaterial>((r1,r2) ->  r1.getTimeTaken().compareTo(r2.getTimeTaken())); 
		set.addAll(materialsToFollow.keySet());
		return set;
	}
	
	@Override
	public void run() {
		while(true){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(ReadingMaterial r:materialsToFollow.keySet()){
				try {
					int secForThisMaterial = r.getSecondsForTake();
					LocalDateTime time = r.getTimeTaken();
					
					Duration d = Duration.between(time, LocalDateTime.now());
					
					if(d.getSeconds()>secForThisMaterial){
						int sec = (int) (d.getSeconds() - secForThisMaterial);
						
						
						Double money = ((100+sec)/100) * r.getPrice();
						synchronized (materialsToFollow) {
							materialsToFollow.put(r, money);
						}
						
					}
					
				} catch (LibraryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public Double howMuchIHaveToPayForThisRm(ReadingMaterial rm){
		return materialsToFollow.get(rm);
		
	}

	public void addMaterialToWatch(ReadingMaterial readingMaterial) {
		try {
			synchronized (readingMaterial) {
				materialsToFollow.put(readingMaterial, readingMaterial.getPrice());
			}
			
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void removeMaterialToWatch(ReadingMaterial readingMaterial){
		if(readingMaterial!= null && materialsToFollow.containsKey(readingMaterial))
			synchronized (readingMaterial) {
				materialsToFollow.remove(readingMaterial);
			}
		
	}
}