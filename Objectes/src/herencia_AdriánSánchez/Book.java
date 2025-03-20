package herencia_AdriánSánchez;

/**
 * Classe que representa un llibre, amb informació sobre l'autor, el preu de cost, el preu de venda, el títol i el nombre de pàgines.
 * Aquesta classe permet obtenir el benefici del llibre i calcular l'IVA aplicat.
 */
public class Book {

    private String author;
    private float pCost;
    private float pSale;
    private String title;
    private int numPag;

    /**
     * Constructor per crear un objecte `Book` amb els atributs d'autor, preu de cost, preu de venda, títol i nombre de pàgines.
     * 
     * @param author l'autor del llibre
     * @param pCost el preu de cost del llibre
     * @param pSale el preu de venda del llibre
     * @param title el títol del llibre
     * @param numPag el nombre de pàgines del llibre
     */
    public Book(String author, float pCost, float pSale, String title, int numPag) {
        this.author = author;
        this.pCost = pCost;
        this.pSale = pSale;
        this.title = title;
        this.numPag = numPag;
    }

    /**
     * Obté l'autor del llibre.
     * 
     * @return l'autor del llibre
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Obté el preu de cost del llibre.
     * 
     * @return el preu de cost del llibre
     */
    public float getPCost() {
        return pCost;
    }

    /**
     * Obté el preu de venda del llibre.
     * 
     * @return el preu de venda del llibre
     */
    public float getPSale() {
        return pSale;
    }

    /**
     * Obté el nombre de pàgines del llibre.
     * 
     * @return el nombre de pàgines del llibre
     */
    public int getNumPag() {
        return numPag;
    }

    /**
     * Obté el títol del llibre.
     * 
     * @return el títol del llibre
     */
    public String getTitle() {
        return title;
    }

    /**
     * Estableix un nou valor per al preu de venda del llibre.
     * 
     * @param newValue el nou preu de venda
     */
    public void setPSale(float newValue) {
        this.pSale = newValue;
    }

    /**
     * Calcula el benefici net del llibre, restant el preu de cost i l'IVA aplicat al preu de venda.
     * 
     * @return el benefici net del llibre
     */
    public float getProfit() {
        return pSale - pCost - getIVA();
    }

    /**
     * Calcula l'IVA aplicat al llibre, que és el 4% del preu de venda.
     * 
     * @return l'import de l'IVA
     */
    public float getIVA() {
        return pSale * 0.04f;
    }

    /**
     * Imprimeix el títol del llibre.
     */
    public void titleToString() {
        System.out.println("El titol del llibre és: " + title);
    }
}
