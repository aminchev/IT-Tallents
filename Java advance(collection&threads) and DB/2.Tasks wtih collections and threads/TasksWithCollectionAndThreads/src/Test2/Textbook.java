package Test2;

public class Textbook extends ReadingMaterial {

	private String author;
	private String tema;
	
	public Textbook(String name, String author, String tema) {
		super(name);
		this.setAuthor(author);
		this.setTema(tema);
		
	}

	public String getAuthor(){
		return author;
	}
	
	private void setAuthor(String author) {
		if(author!=null && author.length()>0){
			this.author = author;
		}
	}

	private void setTema(String tema) {
		if(tema!=null && tema.length()>0){
			this.tema = tema;
		}
	}

}
