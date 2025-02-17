package objectes_AdrianSanchez;

public class BookTest {
    public static void main(String[] args) {
    	Book Book1 = new Book("978-84-376-0494-7", "Hola test", "Adios test", 69);
    	Book Book2 = new Book("978-84-376-0494-8", "Hola test1", "Adios test1", 26);
    	Book Book3 = new Book("978-84-376-0494-9", "Hola test2", "Adios test2", 106);
        System.out.println(Book1);
        System.out.println(Book2);
        System.out.println(Book3);
       
        Book BigBook = Book1;

        if (Book2.getPageCount() > BigBook.getPageCount()) {
        	BigBook = Book2;
        }
        if (Book3.getPageCount() > BigBook.getPageCount()) {
        	BigBook = Book3;
        }

        System.out.println("El llibre amb més pàgines és: " + BigBook.getTitle() + 
                           " amb " + BigBook.getPageCount() + " pàgines.");
    }      
    }

