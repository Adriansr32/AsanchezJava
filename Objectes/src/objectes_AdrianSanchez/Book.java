package objectes_AdrianSanchez;

/**
 * Representa un llibre amb el seu ISBN, títol, autor i nombre de pàgines.
 * Proporciona mètodes per obtenir i modificar aquests atributs.
 * També inclou un mètode per obtenir una representació en cadena del llibre.
 */
class Book {

    /**
     * L'ISBN del llibre.
     */
    private String isbn;

    /**
     * El títol del llibre.
     */
    private String title;

    /**
     * L'autor del llibre.
     */
    private String author;

    /**
     * El nombre de pàgines del llibre.
     */
    private int pageCount;

    /**
     * Crea un llibre amb l'ISBN, títol, autor i nombre de pàgines especificats.
     * 
     * @param isbn L'ISBN del llibre.
     * @param title El títol del llibre.
     * @param author L'autor del llibre.
     * @param pageCount El nombre de pàgines del llibre.
     */
    public Book(String isbn, String title, String author, int pageCount) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    /**
     * Obté l'ISBN del llibre.
     * 
     * @return L'ISBN del llibre.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Obté el títol del llibre.
     * 
     * @return El títol del llibre.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Obté l'autor del llibre.
     * 
     * @return L'autor del llibre.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Obté el nombre de pàgines del llibre.
     * 
     * @return El nombre de pàgines del llibre.
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Estableix l'ISBN del llibre.
     * 
     * @param isbn El nou ISBN del llibre.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Estableix el títol del llibre.
     * 
     * @param title El nou títol del llibre.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Estableix l'autor del llibre.
     * 
     * @param author El nou autor del llibre.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Estableix el nombre de pàgines del llibre.
     * 
     * @param pageCount El nou nombre de pàgines del llibre.
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * Retorna una representació en cadena del llibre.
     * 
     * @return Una cadena amb la informació del llibre.
     */
    @Override
    public String toString() {
        return "El llibre " + title + " amb ISBN " + isbn + 
               " creat per l'autor " + author + " té " + pageCount + " pàgines";
    }

}
