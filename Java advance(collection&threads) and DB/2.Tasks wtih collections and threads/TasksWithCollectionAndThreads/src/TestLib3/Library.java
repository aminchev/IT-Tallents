package TestLib3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Library {

	private Map<TypeOfReadingMaterial, Map<String, List<ReadingMaterial>>> materials;
	private LibraryMan libraryMan;
	private final int numberOfAllMaterials = 6;

	public Library() {
		libraryMan = new LibraryMan();
		libraryMan.start();
		materials = new HashMap();
		materials.put(TypeOfReadingMaterial.BOOK, new TreeMap<>());
		materials.put(TypeOfReadingMaterial.MAGAZINE, new TreeMap<>());
		materials.put(TypeOfReadingMaterial.TEXTBOOK, new TreeMap<>());

		materials.get(TypeOfReadingMaterial.BOOK).put("Istoricheski",
				Arrays.asList(new Book(LocalDateTime.of(1963, 11, 10, 3, 34), "Ivan Vazov", "Pod igoto", "Prosveta"),
						new Book(LocalDateTime.now(), "Ekziuperi", "Malkiq princ", "Nov Svqt")));

		materials.get(TypeOfReadingMaterial.MAGAZINE).put("Modni",
				Arrays.asList(new Magazine(LocalDateTime.now(), 3, "Cosmos", "Anubis"),
						new Magazine(LocalDateTime.now(), 5, "Blqsyk", "Bulvest 2000")));

		materials.get(TypeOfReadingMaterial.TEXTBOOK).put("Matematika",
				Arrays.asList(new Textbook("Ganio Hristev", "Algebra za 5 klas", "Anubis"),
						new Textbook("Stamat Stoynov", "Integrali za 2-ri klas", "Prosveta")));
	}


	
	
	
	public void getReadingMaterial(ReadingMaterial readingMaterial) throws LibraryException {
		if (readingMaterial != null && readingMaterial.canBeTaken() && !readingMaterial.isTaken()) {
			readingMaterial.takeIt(true);
			libraryMan.addMaterialToWatch(readingMaterial);
		}
		else{
			throw new LibraryException("This material can not be taken");
		}
	}
	
	public void returnReadingMaterial(ReadingMaterial readingMaterial){
		
		readingMaterial.takeIt(false);
		System.out.println("Duljish " + libraryMan.howMuchIHaveToPayForThisRm(readingMaterial));
		libraryMan.removeMaterialToWatch(readingMaterial);
	}
	
	public void showCatalog(TypeOfReadingMaterial type){
		Map<String, List<ReadingMaterial>> catalog = materials.get(type);
		
		for(String category: catalog.keySet()){
			System.out.println(category + ":");
			List<ReadingMaterial> list = catalog.get(category);
			if(type.equals(TypeOfReadingMaterial.BOOK)){
				//Collections.sort(books, new BookComparator());
				list.sort(new BookComparator());
				//��� �� �� �������� ���, ��� �� ��������� �������������???
				//list.sort();....
				//��� ����� ����(B���,�agazine,Textbook) ��������� Camparable ����� ������� ����??)
				
				//list.sort(list.get(0).getComparator());//���� ��� ������
			}
			if(type.equals(TypeOfReadingMaterial.MAGAZINE)){
				list.sort(new MagazineComparator());
			}
			if (type.equals(TypeOfReadingMaterial.TEXTBOOK)) {
				list.sort(new TextbookComparator());
			}
			for(ReadingMaterial material: list){
				System.out.println(material);
			}
		}
	}
	
	public List<ReadingMaterial> catalogOfBooks(){
		List<ReadingMaterial> list = new ArrayList<ReadingMaterial>(); 
		for(String subject: materials.get(TypeOfReadingMaterial.BOOK).keySet()){
			list.addAll(materials.get(TypeOfReadingMaterial.BOOK).get(subject));
		}
		
		return list;
	}
	
	public List<ReadingMaterial> catalogOfTextbooks(){
		List<ReadingMaterial> list = new ArrayList<ReadingMaterial>(); 
		for(String subject: materials.get(TypeOfReadingMaterial.TEXTBOOK).keySet()){
			list.addAll(materials.get(TypeOfReadingMaterial.TEXTBOOK).get(subject));
		}
		
		return list;
	}
	
	public int numberOfAvailableReadingMaterials(){
		 return numberOfAllMaterials - this.libraryMan.getNumberOfTakenMaterials();
	}
}