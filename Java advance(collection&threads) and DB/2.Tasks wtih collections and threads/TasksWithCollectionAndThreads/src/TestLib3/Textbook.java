package TestLib3;

import java.util.Comparator;

public class Textbook extends ReadingMaterial{

	private String author;
	
	public Textbook(String author, String name, String publisher) {
		super(name, publisher);
		this.author = author;
		
	}

	@Override
	public String toString() {
		return "Textbook [author=" + author + ", getName()=" + getName() + ", getPublisher()=" + getPublisher() + "]";
	}

	@Override
	public Comparator getComparator() {
		return new TextbookComparator();
	}
	
	public  int getSecondsForTake(){
		return 1500;
	}
	
	public  Double getPrice(){
		return 3.0;
	}

}
