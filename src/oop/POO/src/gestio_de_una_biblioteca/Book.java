package gestio_de_una_biblioteca;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private int quantity;
	
	public Book(String isbn, String title, String author, int quantity) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public boolean theresDisponibility() {
		return quantity > 0;
	}
	public void prestar() {
		if(quantity > 0) quantity--;
	}
	public void retornar() {
		quantity++;
	}
	@Override
	public String toString() {
		return title + " ("+ author + ") - ISBN: " + isbn;
	}
}
