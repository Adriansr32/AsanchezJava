package inheritance.books;

/**
 * Classe que representa un llibre digital, que extén la classe `Book` afegint propietats específiques com l'URL de descàrrega i la mida en MB.
 * Aquesta classe també permet calcular la mida per pàgina del llibre digital.
 */
public class DigitalBook extends Book {

    private String URLDownload;
    private int MBSize;

    /**
     * Constructor per crear un objecte `DigitalBook` amb els atributs d'autor, preu de cost, preu de venda, títol, nombre de pàgines,
     * URL de descàrrega i mida en MB.
     * 
     * @param author l'autor del llibre digital
     * @param pCost el preu de cost del llibre digital
     * @param pSale el preu de venda del llibre digital
     * @param title el títol del llibre digital
     * @param numPag el nombre de pàgines del llibre digital
     * @param URLDownload l'URL de descàrrega del llibre digital
     * @param MBSize la mida en MB del llibre digital
     */
    public DigitalBook(String author, float pCost, float pSale, String title, int numPag, String URLDownload, int MBSize) {
        super(author, pCost, pSale, title, numPag);
        this.URLDownload = URLDownload;
        this.MBSize = MBSize;
    }

    /**
     * Obté l'URL de descàrrega del llibre digital.
     * 
     * @return l'URL de descàrrega
     */
    public String GetURLDownload() {
        return URLDownload;
    }

    /**
     * Estableix una nova URL de descàrrega per al llibre digital.
     * 
     * @param newValue la nova URL de descàrrega
     */
    public void setURLDownload(String newValue) {
        this.URLDownload = newValue;
    }

    /**
     * Obté la mida en MB del llibre digital.
     * 
     * @return la mida en MB del llibre digital
     */
    public int getMBSize() {
        return MBSize;
    }

    /**
     * Calcula la mida per pàgina del llibre digital, dividint la mida total (en MB) pel nombre de pàgines.
     * 
     * @return la mida per pàgina del llibre digital en MB
     */
    public float SizePag() {
        return (float) MBSize / getNumPag();
    }
}
