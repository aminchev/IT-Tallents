package TestLib4Again;

import java.time.LocalDateTime;

public class Book extends ReadingMaterial {

	private String author;
	private LocalDateTime date;
	
	public Book(String author, LocalDateTime date,String name, String izdatelstvo) {
		super(name, izdatelstvo);
		this.setAuthor(author);
		this.setDate(date);
	}

	public String getAuthor() {
		return author;
	}

	private void setAuthor(String author) {
		if(author != null && author.length()>0){
			this.author = author;
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
		return "Book [author=" + author + ", date=" + date + ", getName()=" + getName() + "]";
	}

	@Override
	public boolean canBeTaken() {
		return true;
	}

	@Override
	public Double getPrice() {
		return 2.0;
	}

	@Override
	public int getSecondForTake() {
		return 3000;
	}
	
}