package examples.strings.M;

public class Book {
	
	int id; 
	String name, author, publisher; 
	int quantity;
	
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}


	int getId() {
		return id;
	}


	void setId(int id) {
		this.id = id;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	String getAuthor() {
		return author;
	}


	void setAuthor(String author) {
		this.author = author;
	}


	String getPublisher() {
		return publisher;
	}


	void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	int getQuantity() {
		return quantity;
	}


	void setQuantity(int quantity) {
		this.quantity = quantity;
	} 
	
	
	
}
