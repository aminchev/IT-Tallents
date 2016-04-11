package Test2;

import java.util.Comparator;

public class TextbookComparator implements Comparator<ReadingMaterial> {

	@Override
	public int compare(ReadingMaterial textbo1, ReadingMaterial textbo2) {
		Textbook textbook1 = (Textbook)textbo1;
		Textbook textbook2 = (Textbook)textbo2;
		if(textbook1.getName().compareTo(textbook2.getName())==0){
			return textbook1.getAuthor().compareTo(textbook2.getAuthor());
		}
		return textbook1.getName().compareTo(textbook2.getName());
	}

}
