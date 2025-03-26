package CompositionOrAggregation;

public class Book {
	private String title;
	private Author author;
	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
	}
	public Book() {}
	public void displayBookInfo() {
		System.out.println("Book Title : " + title);
		author.displayAuthorInfo();
	}

}
