package TestLib3;

import java.util.Comparator;

public class TextbookComparator implements Comparator<ReadingMaterial> {

	@Override
	public int compare(ReadingMaterial o1, ReadingMaterial o2) {
		Textbook t1 = (Textbook)o1;
		Textbook t2 = (Textbook)o2;
		
		
		return t1.getName().compareTo(t2.getName());
	}

}
