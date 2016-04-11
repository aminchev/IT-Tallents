package Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import MusicShop.Instrument;

public class Biblioteka {
	//String-���� 
	private Map<String, Set<Book>> books;
	//String - ����
	private Map<String, Set<Uchebnik>> ucebnici;
	//String - ���������
	private Map<String, Set<Spisanie>> spisania;
	
	
	Map<String, Set<Chetivo>> chetiva;
	
	public Biblioteka() {
		this.books = new TreeMap<String, Set<Book>>();
		this.ucebnici = new TreeMap<String, Set<Uchebnik>>();
		this.spisania = new TreeMap<String, Set<Spisanie>>();
		this.chetiva = new TreeMap<String, Set<Chetivo>>();
	}
	
	
	
//	public SortedSet<Chetivo> daiVsichkiChetivaSporedTyrseniqTip(String type){
//		TreeSet<Chetivo> sortedChetiva = new TreeSet<Chetivo>();
//		if(type.equals("Book")){
//		sortedChetiva = new TreeSet<Book>(new BookComparator());
//		for(String ReadingMaterial:chetiva.keySet()){
//			if(chetiva.get(ReadingMaterial) instanceof Book){
//				//chetiva.add(chetiva.get(ReadingMaterial));
//				sortedChetiva.add(chetiva.get(ReadingMaterial));
//			}
//		}
//	}
//	}
	
//	public void addReadingMaterial(ReadingMaterial material) {
//		if (material != null) {
//			if (material instanceof Book)
//				this.readingMaterials.get("books").add(material);
//			if (material instanceof Magazine)
//				this.readingMaterials.get("magazines").add(material);
//			if (material instanceof Textbook)
//				this.readingMaterials.get("textbooks").add(material);
//		}
//	}
//	
//	public void browseCatalog(String materials) {
//
//		switch (materials) {
//
//		case "magazines":
//			this.readingMaterials.get("magazines").sort(new MagazineComparator());
//			System.out.println("Magazines : ");
//			this.readingMaterials.get("magazines").forEach(magazine -> System.out.println(magazine));
//			break;
//
//		case "textbooks":
//			this.readingMaterials.get("textbooks").sort(new TextbookComparator());
//			System.out.println("Textbooks : ");
//			this.readingMaterials.get("textbooks").forEach(textbook -> System.out.println(textbook));
//			break;
//
//		default:
//			this.readingMaterials.get("books").sort(new BookComparator());
//			System.out.println("Books : ");
//			this.readingMaterials.get("books").forEach(book -> System.out.println(book));
//			break;
//		}
//	}
	
	public SortedSet<Chetivo> daiVsichkiChetivaSporedTyrseniqTip(String type){
		switch (type) {
		case "Books":
			TreeSet<Chetivo> sortedBook = new TreeSet<Chetivo>((chetivo1, chetivo2) ->{
				Book book1 = (Book) chetivo1;
				Book book2 = (Book) chetivo2;
				if(book1.getYearOfPublishig() == book2.getYearOfPublishig()){
					return book2.getMonthOfPublishing() - book1.getMonthOfPublishing();
				}
				return book2.getYearOfPublishig() - book1.getYearOfPublishig();
			});
			for(String janr: books.keySet()){
				Set<Book> booksWithThisJanr = books.get(janr);
				sortedBook.addAll(booksWithThisJanr);
			}
			return sortedBook;
		case "Uchebnici" :
			TreeSet<Chetivo> sortedUchebnici = new TreeSet<Chetivo>((chetivo1,chetivo2) ->{
				Uchebnik uch1 = (Uchebnik) chetivo1;
				Uchebnik uch2 = (Uchebnik) chetivo2;
				if(uch1.getName().compareTo(uch2.getName()) == 0){
	
					return uch1.getAutor().compareTo(uch2.getAutor());
				}
				return uch1.getName().compareTo(uch2.getName());
			});
			
			for(String tema: ucebnici.keySet()){
				Set<Uchebnik> uchebniciFromThisTema = ucebnici.get(tema);
				sortedUchebnici.addAll(uchebniciFromThisTema);
			}
			return sortedUchebnici;
		default:
			TreeSet<Chetivo> sortedSpisania = new TreeSet<Chetivo>((chetivo1, chetivo2) ->{
				Spisanie spis1 = (Spisanie) chetivo1;
				Spisanie spis2 = (Spisanie) chetivo2;
				if(spis1.getName().compareTo(spis2.getName())==0){
					return spis1.getNumber() - spis2.getNumber();
				}
				return spis1.getName().compareTo(spis2.getName());
			});
			
			for(String kategoria:spisania.keySet()){
				Set<Spisanie> spisaniaFromThisTema = spisania.get(kategoria);
				sortedSpisania.addAll(spisaniaFromThisTema);
			}
			return sortedSpisania;
		}
	}
	
//	public SortedSet<Book> getAllBookFromBiblioteka(){
//		TreeSet<Book> sortedBook = new TreeSet<Book>((book1, book2) ->{
//			if(book1.getYearOfPublishig() == book2.getYearOfPublishig()){
//				return book2.getMonthOfPublishing() - book1.getMonthOfPublishing();
//			}
//			return book2.getYearOfPublishig() - book1.getYearOfPublishig();
//		});
//		for(String janr: books.keySet()){
//			Set<Book> booksWithThisJanr = books.get(janr);
//			sortedBook.addAll(booksWithThisJanr);
//		}
//		return sortedBook;
//	}
//	
//	public SortedSet<Uchebnik> getAllUchebniciFromBibliote(){
//		TreeSet<Uchebnik> sortedUchebnici = new TreeSet<Uchebnik>((uch1,uch2) ->{
//			if(uch1.getName().compareTo(uch2.getName()) == 0){
//				return uch1.getAutor().compareTo(uch2.getAutor());
//			}
//			return uch1.getName().compareTo(uch2.getName());
//		});
//		
//		for(String tema: ucebnici.keySet()){
//			Set<Uchebnik> uchebniciFromThisTema = ucebnici.get(tema);
//			sortedUchebnici.addAll(uchebniciFromThisTema);
//		}
//		return sortedUchebnici;
//	}
//	
//	public SortedSet<Spisanie> getAllSpisania(){
//		TreeSet<Spisanie> sortedSpisania = new TreeSet<Spisanie>((spis1, spis2) ->{
//			if(spis1.getName().compareTo(spis2.getName())==0){
//				return spis1.getNumber() - spis2.getNumber();
//			}
//			return spis1.getName().compareTo(spis2.getName());
//		});
//		
//		for(String kategoria:spisania.keySet()){
//			Set<Spisanie> spisaniaFromThisTema = spisania.get(kategoria);
//			sortedSpisania.addAll(spisaniaFromThisTema);
//		}
//		return sortedSpisania;
//	}
	
	void addChetivo(Chetivo chetivo){
		if(chetivo!= null){
			if(chetivo instanceof Book){
				if(!chetiva.containsKey("Books")){
					chetiva.put("Books", new HashSet<Chetivo>());
				}
				chetiva.get("Books").add(chetivo);
				return;
			}
			if(chetivo instanceof Spisanie){
				if(!chetiva.containsKey("Spisania")){
					chetiva.put("Spisania", new HashSet<Chetivo>());
				}
				chetiva.get("Spisania").add(chetivo);
			}
			
			if(chetivo instanceof Uchebnik){
				chetiva.get("Uchebnici").add(chetivo);
			}
		}
	}
	
	void addBook(Book book,String janr){
		if(book != null && janr!= null && janr.length()>0){
			if(!books.containsKey(janr)){
				books.put(janr, new HashSet<Book>());
			}
			books.get(janr).add(book);
		}
	}
	
	void addSpisanie(Spisanie spisanie, String category){
		if(spisanie != null && category!=null && category.length()>0){
			if(!spisania.containsKey(category)){
				spisania.put(category, new HashSet<Spisanie>());
			}
			spisania.get(category).add(spisanie);
		}
	}
	
	void addUchebnik(Uchebnik uchebnik, String tema){
		if(uchebnik !=null && tema!=null && tema.length()>0){
			if(!ucebnici.containsKey(tema)){
				ucebnici.put(tema, new HashSet<Uchebnik>());
			}
			ucebnici.get(tema).add(uchebnik);
		}
	}
}