package TestLib4Again;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.soap.Text;



public class Library {
	private Map<String, List<Book>> books;
	private Map<String, List<Magazine>> magazines;
	private Map<String, List<Textbook>> textbooks;
	private LibraryMan librarist;
 	
	public Library() {
		books = new TreeMap<String, List<Book>>();
		books.put("Istoricheski", new ArrayList<Book>());
		books.get("Istoricheski").add(new Book("Ivan Vazov", LocalDateTime.of(1988, 1, 2, 2, 7), "Pod igoto", "Bulvast"));
		books.get("Istoricheski").add(new Book("Stafan Dichev", LocalDateTime.of(1992, 5,7, 5, 9), "Putqt kum Sofiq", "Prosveta"));
				
		magazines = new TreeMap<String, List<Magazine>>();
		magazines.put("Modni", new ArrayList<Magazine>());
		magazines.get("Modni").add(new Magazine("Blqsuk", "NovSvqt", 5, LocalDateTime.now()));
		magazines.get("Modni").add(new Magazine("Blqsuk", "NovSvqt", 4, LocalDateTime.now()));
		magazines.get("Modni").add(new Magazine("Blqsuk", "NovSvqt", 2, LocalDateTime.now()));
		magazines.put("Estetika", new ArrayList<>());
		magazines.get("Estetika").add(new Magazine("Krasota", "NNekvoDrugo", 2, LocalDateTime.now()));
		
		textbooks = new TreeMap<String, List<Textbook>>();
		textbooks.put("Matematika", new ArrayList<Textbook>());
		textbooks.get("Matematika").add(new Textbook("Mitko Mitkov", "Mat za 5-i klas", "Prosveta"));
		textbooks.get("Matematika").add(new Textbook("Iliq Iliev", "Mat za 10-i klas", "Abagar"));
		
	}
	
	void showCatalog(String material){
		switch (material){
		case "Book":
			for(String genre:books.keySet()){
				System.out.println(genre + ":");
				List<Book> sortedBooks = books.get(genre);
			 sortedBooks.sort(new BookComparator());
			 
			 for(Book book: sortedBooks){
				 System.out.println(book);
			 }
			}
			break;
		case "Magazine":
			for(String category:magazines.keySet()){
				System.out.println(category + ":");
				List<Magazine> sortedMagaz = magazines.get(category);
				sortedMagaz.sort(new MagazineComparator());
				for(Magazine magaz: sortedMagaz){
					System.out.println(magaz);
				}
			}
			break;
		default:
			for(String tema:textbooks.keySet()){
				System.out.println(tema + ":");
				List<Textbook> sortedTextbooks = textbooks.get(tema);
				sortedTextbooks.sort(new TextbookComparator());
				for(Textbook textbook: sortedTextbooks){
					System.out.println(textbook);
				}
			}
			break;
				
		}
			
	}
	
	void getReadingMaterial(ReadingMaterial material) throws LibraryException{
		if(material!= null && material.canBeTaken() && material.isTaken()==false){
			material.setTaken(true);
			material.addDateOfTakingInMaterialHistory();
			this.librarist.addTakenMaterialToWatch(material);
		}
		else{
			throw new LibraryException("This materil can not be taken!");
		}
	}
	
	void returnReadingMaterial(ReadingMaterial material){
		if(material!=null && material.isTaken() == true){
			material.setTaken(false);
			material.addDateOFReturningInMaterialHistory();
			System.out.println("You must pay " + this.librarist.howMuchMustBePaid(material));
			this.librarist.removeMaterialToWatch(material);
			
		}
	}
	
	int countOfAllReadingMaterialsInLibrary(){
		return 6-this.librarist.countOfAllTakenMaterials();
	}
}
