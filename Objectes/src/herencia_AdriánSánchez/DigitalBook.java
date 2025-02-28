package herencia_AdriánSánchez;

public class DigitalBook extends Book {
	private String URLDownload;
	private int MBSize;

	public DigitalBook(String author, float pCost, float pSale, String title, int numPag, String URLDownload, int MBSize) {
		super(author, pCost, pSale, title, numPag);
		this.URLDownload = URLDownload;
		this.MBSize = MBSize;
	}

	public String GetURLDownload() {
		return URLDownload;
	}
	
	public void setURLDownload(String newValue) {
		this.URLDownload = newValue;
	}
	
	public int getMBSize() {
		return MBSize;
	}
	public float SizePag() {
		return MBSize/getNumPag();
	}
}
