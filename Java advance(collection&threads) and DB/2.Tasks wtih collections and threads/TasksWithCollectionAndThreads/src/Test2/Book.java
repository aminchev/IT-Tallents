package Test2;

public class Book extends ReadingMaterial {
	
	private String author;
	private int yearOfMade;
	private int monthOfMade;
	private String genre;
	
	
	public Book(String name, String author, String genre) {
		super(name);
		this.setAuthor(author);
		this.setGenre(genre);
	}


	public int getYearOfMade() {
		return yearOfMade;
	}


	public void setYearOfMade(int yearOfMade) {
		if(yearOfMade>0){
			this.yearOfMade = yearOfMade;
		}
	}


	public int getMonthOfMade() {
		return monthOfMade;
	}


	public void setMonthOfMade(int monthOfMade) {
		if(monthOfMade>0){
			this.monthOfMade = monthOfMade;
		}
	}


	private void setAuthor(String author) {
		if(author!=null && author.length()>0){
			this.author = author;
		}
	}

	public String getGenre(){
		return this.genre;
	}

	private void setGenre(String genre) {
		if(genre!=null && genre.length()>0){
			this.genre = genre;
		}
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", yearOfMade=" + yearOfMade + ", monthOfMade=" + monthOfMade + ", genre="
				+ genre + "]";
	}

}
