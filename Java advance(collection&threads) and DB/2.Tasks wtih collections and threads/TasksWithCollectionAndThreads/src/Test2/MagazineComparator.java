package Test2;

import java.util.Comparator;

public class MagazineComparator implements Comparator<ReadingMaterial> {

	@Override
	public int compare(ReadingMaterial magaz1, ReadingMaterial magaz2) {
		Magazine magazine1 = (Magazine)magaz1;
		Magazine magazine2 = (Magazine)magaz2;
		if(magazine1.getName().compareTo(magazine2.getName())==0){
			return magazine1.getBroiNumber() - magazine2.getBroiNumber();
		}
		return magazine1.getName().compareTo(magazine2.getName());
	}

}
