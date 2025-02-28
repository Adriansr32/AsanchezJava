package herencia_AdriánSánchez;

public class Book {
	private String author;
	private float pCost;
	private float pSale;
	private String title;
	private int numPag;
	public Book(String author, float pCost, float pSale, String title, int numPag) {
		this.author = author;
		this.pCost = pCost;
		this.pSale = pSale;
		this.title = title;
		this.numPag = numPag;
	}
	public String getAuthor() {
		return author;
	}
	
	public float getPCost() {
		return pCost;
	}
	
	public float getPSale() {
		return pSale;
	}
	
	public int getNumPag() {
		return numPag;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPCost(float newValue) {
		this.pCost = newValue;
	}
	public float getProfit() {
		return pSale - pCost - 0.04f;
	}
	public float getIVA() {
		return pSale * 0.04f;
	}
	
	public void titleToString() {
		System.out.println("El titol del llibre és: " + title);
	}
}
