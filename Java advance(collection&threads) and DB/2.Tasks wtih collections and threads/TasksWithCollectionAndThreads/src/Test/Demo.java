package Test;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Biblioteka biblioteka = new Biblioteka();
		Book book1  = new Book("Pod igoto", "Abv", "Ivan Vazov");
		book1.setYearOfPublishig(1988);
		book1.setMonthOfPublishing(12);
		
		Book book2 = new Book("Razkazi", "Bva", "Jordan Jovkov");
		book2.setYearOfPublishig(1999);
		book2.setMonthOfPublishing(8);
		Book book3 = new Book("Malkiq princ", "Abagar", "Ekziuperi");
		book3.setYearOfPublishig(2008);
		book3.setMonthOfPublishing(12);
		
		Spisanie spisanie1 = new Spisanie("Az graciqta", "Ne znam", 12);
		Spisanie spisanie2 = new Spisanie("Az graciqta", "Ne znam", 4);
		Spisanie spisanie3 = new Spisanie("Krasiva", "Ne znam", 13);
		Spisanie spisanie4 = new Spisanie("Krasiva", "Ne znam", 5);
		Spisanie spisanie5 = new Spisanie("Krasiva", "Ne znam", 6);
		
		Uchebnik uchebnik1 = new Uchebnik("Matematika", "Prosveta");
		uchebnik1.setAutor("Ivan Ivanov");
		Uchebnik uchebnik2 = new Uchebnik("Matematika", "Abagar");
		uchebnik2.setAutor("Petur Petrov");
		Uchebnik uchebnik3 = new Uchebnik("Literatura", "Prosveta");
		uchebnik3.setAutor("Vasil Vasilev");
				
//		biblioteka.addBook(book1, "History");
//		biblioteka.addBook(book2, "Hudojestven");
//		biblioteka.addBook(book3, "Obsh");
		
		biblioteka.addChetivo(book1);
		biblioteka.addChetivo(book2);
		biblioteka.addChetivo(book3);
		
		SortedSet<Chetivo> allBooks =  biblioteka.daiVsichkiChetivaSporedTyrseniqTip("Books");
		for(Chetivo book:allBooks){
			System.out.println(book.toString());
		}
		
		biblioteka.addSpisanie(spisanie1, "Moda");
		biblioteka.addSpisanie(spisanie2, "Moda");
		biblioteka.addSpisanie(spisanie3, "Moda");
		biblioteka.addSpisanie(spisanie4, "Moda");
		biblioteka.addSpisanie(spisanie5, "Moda");
		
		SortedSet<Chetivo> allSpisania = biblioteka.daiVsichkiChetivaSporedTyrseniqTip("ehf");
		for(Chetivo spisanie:allSpisania){
			System.out.println(spisanie.toString());
		}
			
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		arrayList.remove(1);
		System.out.println(arrayList.get(1));
		
		
		
	}

}
 