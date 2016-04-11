package TestLib4Again;

import java.time.LocalDateTime;

public class Magazine extends ReadingMaterial {

	private int numberOfMagazine;
	private LocalDateTime date;
	
	public Magazine(String name, String izdatelstvo, int numberOfMagazine, LocalDateTime date) {
		super(name, izdatelstvo);
		this.setNumberOfMagazine(numberOfMagazine);
		this.setDate(date);
	}

	public int getNumberOfMagazine() {
		return numberOfMagazine;
	}

	private void setNumberOfMagazine(int numberOfMagazine) {
		if(numberOfMagazine>0){
			this.numberOfMagazine = numberOfMagazine;
		}
	}

	public LocalDateTime getDate() {
		return date;
	}

	private void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Magazine [numberOfMagazine=" + numberOfMagazine + ", date=" + date + ", getName()=" + getName()
				+ ", getIzdatelstvo()=" + getIzdatelstvo() + "]";
	}

	@Override
	public boolean canBeTaken() {
		return false;
	}

	@Override
	public Double getPrice() throws LibraryException {
		throw new LibraryException("This reading material (Magazine) can not be taken, so - no price!");
	}

	@Override
	public int getSecondForTake() throws LibraryException {
		throw new LibraryException("Magazines can not be taken so - no time for getting!");
	}

}
