package may2017prob2;

public class Book extends LendingItem{
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	public Book(String isbn, String title, String authorFirstName, String authorLastName) {
	
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}
}
