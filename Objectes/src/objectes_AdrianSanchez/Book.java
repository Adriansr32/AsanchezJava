package objectes_AdrianSanchez;

class Book {
private String isbn;
private String title;
private String author;
private int pageCount;

public Book(String isbn, String title, String author, int pageCount) {
	  this.isbn = isbn;
      this.title = title;
      this.author = author;
      this.pageCount = pageCount;
}

public String getIsbn() {
    return isbn;
}

public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}

public int getPageCount() {
    return pageCount;
}
public void setIsbn(String isbn) {
    this.isbn = isbn;
}

public void setTitle(String title) {
    this.title = title;
}

public void setAuthor(String author) {
    this.author = author;
}

public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
}

@Override
public String toString() {
    return "El llibre " + title + " amb ISBN " + isbn + 
           " creat per l'autor " + author + " té " + pageCount + " pàgines";
}

}

