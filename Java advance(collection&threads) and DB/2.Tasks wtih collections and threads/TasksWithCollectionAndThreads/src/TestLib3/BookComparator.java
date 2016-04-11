package TestLib3;

import java.util.Comparator;

public class BookComparator implements Comparator<ReadingMaterial> {

	@Override
	
	
	public int compare(ReadingMaterial book1, ReadingMaterial book2) {
		Book b1 = (Book)book1;
		Book b2 = (Book)book2;
		
		return b2.getDate().compareTo(b1.getDate());
	}

}
