package TestLib3;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Magazine extends ReadingMaterial {

	private int number;
	private LocalDateTime date;
	
	public Magazine(LocalDateTime date, int number, String name, String publisher) {
		super(name, publisher);
		this.number = number;
		this.date = date;
		
	}

	@Override
	public boolean canBeTaken() {
		return false;
	}

	@Override
	public String toString() {
		return "Magazine [number=" + number + ", date=" + date + ", getName()=" + getName() + ", getPublisher()="
				+ getPublisher() + "]";
	}

	public int getNumber() {
		return number;
	}

	@Override
	public Comparator getComparator() {
		return new MagazineComparator();
	}

	public  int getSecondsForTake() throws LibraryException{
		throw new LibraryException("Magazines can not be taken!");
	}
	
	public  Double getPrice() throws LibraryException{
		throw new LibraryException("Ne se vzima tova!");
	}
	
}
