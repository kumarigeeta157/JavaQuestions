package CompositionOrAggregation;

public class Author {
	private String name;
	private String country;
	public Author(String name, String country) {
		
		this.name = name;
		this.country = country;
	}
	public Author() {}
	public void displayAuthorInfo() {
		System.out.println("Author : " + name + " Country : " + country );
	}
	
	

}
