package domain.Encja;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private String name;
	private String ISBN;
	
	public Book(String name, String ISBN) {
		super();
		this.name = name;
		this.ISBN = ISBN;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		this.ISBN = ISBN;
	}
	
	

}
