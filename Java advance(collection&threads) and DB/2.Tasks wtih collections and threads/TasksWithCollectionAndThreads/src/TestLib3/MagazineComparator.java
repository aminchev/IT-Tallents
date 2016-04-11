package TestLib3;

import java.util.Comparator;

public class MagazineComparator implements Comparator<ReadingMaterial> {

	@Override
	public int compare(ReadingMaterial o1, ReadingMaterial o2) {
		Magazine m1 = (Magazine)o1;
		Magazine m2 = (Magazine)o2;
		
		if(m1.getName().compareTo(m2.getName())==0){
			return m1.getNumber() - m2.getNumber();
		}
		return m1.getName().compareTo(m2.getName());
	}

}
