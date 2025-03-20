package herencia_AdriánSánchez;

/**
 * Classe de prova per crear i gestionar objectes de les classes `Book` i `DigitalBook`.
 * Aquesta classe inicialitza llibres físics i digitals i imprimeix la seva informació,
 * com el títol, autor, preu, IVA, benefici, i més.
 */
public class TestBook {

    public static void main(String[] args) {

        // Creació d'objectes `Book` (llibres físics)
        Book book1 = new Book("Gabriel García Márquez", 15.99f, 25.50f, "Cien años de soledad", 471);
        Book book2 = new Book("George Orwell", 10.50f, 20.00f, "1984", 328);
        Book book3 = new Book("J.K. Rowling", 12.75f, 22.99f, "Harry Potter y la piedra filosofal", 309);
        Book book4 = new Book("Miguel de Cervantes", 18.00f, 30.00f, "Don Quijote de la Mancha", 863);

        // Creació d'objectes `DigitalBook` (llibres digitals)
        DigitalBook DB1 = new DigitalBook("Gabriel García Márquez", 15.99f, 25.50f, "Cien años de soledad", 471, "https://ejemplo.com/cien_anos", 5);
        DigitalBook DB2 = new DigitalBook("George Orwell", 10.50f, 20.00f, "1984", 328, "https://ejemplo.com/1984", 3);
        DigitalBook DB3 = new DigitalBook("J.K. Rowling", 12.75f, 22.99f, "Harry Potter y la piedra filosofal", 309, "https://ejemplo.com/harry_potter1", 4);

        // Mostrar el títol del llibre físic 1
        book1.titleToString();
        book1.setPSale(12.22f);
        System.out.println("Autor:  " + book1.getAuthor() + "\nPreuCost: " + book1.getPCost() + "\nPreuVenta: " + book1.getPSale() + "\nNumero de pagines: " + book1.getNumPag() + "\nIva: " + book1.getIVA() + "\nBenefici: " + book1.getProfit());

        // Mostrar el títol del llibre físic 2
        book2.titleToString();
        System.out.println("Autor:  " + book2.getAuthor() + "\nPreuCost: " + book2.getPCost() + "\nPreuVenta: " + book2.getPSale() + "\nNumero de pagines: " + book2.getNumPag() + "\nIva: " + book2.getIVA() + "\nBenefici: " + book2.getProfit());

        // Mostrar el títol del llibre físic 3
        book3.titleToString();
        System.out.println("Autor:  " + book3.getAuthor() + "\nPreuCost: " + book3.getPCost() + "\nPreuVenta: " + book3.getPSale() + "\nNumero de pagines: " + book3.getNumPag() + "\nIva: " + book3.getIVA() + "\nBenefici: " + book3.getProfit());

        // Mostrar el títol del llibre físic 4
        book4.titleToString();
        System.out.println("Autor:  " + book4.getAuthor() + "\nPreuCost: " + book4.getPCost() + "\nPreuVenta: " + book4.getPSale() + "\nNumero de pagines: " + book4.getNumPag() + "\nIva: " + book4.getIVA() + "\nBenefici: " + book4.getProfit());

        // Mostrar el títol del llibre digital 1
        DB1.titleToString();
        DB1.setURLDownload("https://libros.com/cienanos");
        System.out.println("URL per descarregar: " + DB1.GetURLDownload() + "\nTamany de descàrga: " + DB1.getMBSize() + "\nTamany de les pagines: " + DB1.SizePag());

        // Mostrar el títol del llibre digital 2
        DB2.titleToString();
        DB2.setURLDownload("https://libros.com/1984");
        System.out.println("URL per descarregar: " + DB2.GetURLDownload() + "\nTamany de descàrga: " + DB2.getMBSize() + "\nTamany de les pagines: " + DB2.SizePag());

        // Mostrar el títol del llibre digital 3
        DB3.titleToString();
        DB3.setURLDownload("https://libros.com/harry_potter1");
        System.out.println("URL per descarregar: " + DB3.GetURLDownload() + "\nTamany de descàrga: " + DB3.getMBSize() + "\nTamany de les pagines: " + DB3.SizePag());
    }
}
