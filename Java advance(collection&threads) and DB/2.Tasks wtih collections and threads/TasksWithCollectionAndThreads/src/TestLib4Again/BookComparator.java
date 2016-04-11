package TestLib4Again;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		return book2.getDate().compareTo(book1.getDate());
	}

}
