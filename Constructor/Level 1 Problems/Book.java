package constructor;

public class Book {
	String title;
	String author;
	double price;
	
	
	public Book() {
		title="wings of fire";
		author="APJ Abdul kalam";
		price=189.56;
	}
	
	public Book(String title,String author,double price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	

}
