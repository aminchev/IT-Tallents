package TestLib4Again;

import java.util.Comparator;

public class TextbookComparator implements Comparator<Textbook> {

	@Override
	public int compare(Textbook text1, Textbook text2) {
		return text1.getName().compareTo(text2.getName());
	}

}
