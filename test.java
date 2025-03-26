package CompositionOrAggregation;

public class test {
	public static void main(String[] args) {
		Author author1 = new Author("ghhvbv" , "bnfbnd");
		Author author2 = new Author("jbefevb" , "cbhukf");
		Book book1 = new Book("1958" ,author1 );
		Book book2 = new Book("xgfjgjk" , author2);
		Library library = new Library();
		library.addBook(book1);
		library.addBook(book2);
		library.displayLibraryInfo();
	}

}
