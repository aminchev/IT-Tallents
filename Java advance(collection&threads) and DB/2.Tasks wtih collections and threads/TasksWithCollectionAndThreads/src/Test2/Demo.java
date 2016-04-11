package Test2;

import Test.Uchebnik;

public class Demo {

	public static void main(String[] args) {
		Biblioteka biblioteka = new Biblioteka();
		
		Book book1 = new Book("Pod igoto", "Ivan Vazov", "Istoricheska");
		book1.setYearOfMade(1999);
		Book book2 = new Book("Malkiq princ", "Ekziuperi", "Detska");
		book2.setYearOfMade(2008);
		Book book3 = new Book("Qn Bibiqn", "Elin Pelin", "Detska");
		book3.setYearOfMade(2004);
		ReadingMaterial magazine1 = new Magazine("Az graciqta", 6, "Moda");
		ReadingMaterial magazine2 = new Magazine("Az graciqta", 4, "Moda");
		ReadingMaterial magazine3 = new Magazine("Az graciqta", 5, "Moda");
		ReadingMaterial magazine4 = new Magazine("Krasiva", 7, "Moda");
		ReadingMaterial magazine5 = new Magazine("Krasiva", 5, "Moda");

		ReadingMaterial uchebnik1 = new Textbook("Matematika 3-i klas", "Ivan Ivanov", "Matematika");
		ReadingMaterial uchebnik2 = new Textbook("Matematika 8-i klas", "Petur Petrov", "Matematika");
		
		biblioteka.addReadingMaterial(book1);
		biblioteka.addReadingMaterial(book2);
		biblioteka.addReadingMaterial(book3);
		biblioteka.addReadingMaterial(magazine1);
		biblioteka.addReadingMaterial(magazine2);
		biblioteka.addReadingMaterial(magazine3);
		biblioteka.addReadingMaterial(magazine4);
		biblioteka.addReadingMaterial(magazine5);
		biblioteka.addReadingMaterial(uchebnik1);
		biblioteka.addReadingMaterial(uchebnik2);
		
		biblioteka.showReadingMaterialsAccordingType("Magazines");
		
	}

}