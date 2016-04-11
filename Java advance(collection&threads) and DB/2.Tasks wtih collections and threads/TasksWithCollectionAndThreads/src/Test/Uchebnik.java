package Test;

public class Uchebnik extends Chetivo {

	private String autor;
	
	public Uchebnik(String name, String izdatelstvo) {
		super(name, izdatelstvo);
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if(autor!= null && autor.length()>0){
			this.autor = autor;
		}
	}

	@Override
	public String toString() {
		return "Uchebnik [autor=" + autor + "]";
	}
}
