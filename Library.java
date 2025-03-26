package CompositionOrAggregation;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String libraryName;
	private List<Book> books;
	
	public Library(String libraryName) {
		this.libraryName = libraryName;
		this.books = new ArrayList<>();
	}
	
	
	public Library() {
		
	}

	public void addBook(Book book) {
		books.add(book);
		
	}
	public void displayLibraryInfo() {
		System.out.println("Library : " + libraryName);
		System.out.println("Book available : ");
		for(Book book:books ) {
			book.displayBookInfo();
			System.out.println();
			
			
		}
	}
	
	

}
