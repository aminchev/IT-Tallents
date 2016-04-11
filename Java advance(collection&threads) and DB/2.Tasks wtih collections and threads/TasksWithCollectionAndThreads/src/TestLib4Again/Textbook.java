package TestLib4Again;

public class Textbook extends ReadingMaterial {

	private String author;
	
	public Textbook(String author,String name, String izdatelstvo) {
		super(name, izdatelstvo);
		this.setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	private void setAuthor(String author) {
		if(author!=null && author.length()>0){
			this.author = author;
		}
	}

	@Override
	public String toString() {
		return "Textbook [author=" + author + ", getName()=" + getName() + "]";
	}

	@Override
	public boolean canBeTaken() {
		return true;
	}

	@Override
	public Double getPrice() {
		return 3.0;
	}

	@Override
	public int getSecondForTake() {
		return 1500;
	}

	
}