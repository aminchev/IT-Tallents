package Test;

public class Book extends Chetivo {

	private String autor;
	private int yearOfPublishig;
	private int monthOfPublishing;
	
	public Book(String name, String izdatelstvo, String autor) {
		super(name, izdatelstvo);
		this.setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	private void setAutor(String autor) {
		if(autor!= null && autor.length()>0){
			this.autor = autor;
		}
	}

	public int getYearOfPublishig() {
		return yearOfPublishig;
	}

	public void setYearOfPublishig(int yearOfPublishig) {
		if(yearOfPublishig>1900){
			this.yearOfPublishig = yearOfPublishig;
		}
	}

	public int getMonthOfPublishing() {
		return monthOfPublishing;
	}

	public void setMonthOfPublishing(int monthOfPublishing) {
		if(monthOfPublishing>=1  && monthOfPublishing<=12){
			this.monthOfPublishing = monthOfPublishing;
		}
	}

	@Override
	public String toString() {
		return "Book [autor=" + autor + ", yearOfPublishig=" + yearOfPublishig + ", monthOfPublishing="
				+ monthOfPublishing + "]";
	}

}