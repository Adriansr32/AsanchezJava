package herencia_AdriánSánchez;

public class TestBook {

	public static void main(String[] args) {

		Book book1 = new Book("Gabriel García Márquez", 15.99f, 25.50f, "Cien años de soledad", 471);
		Book book2 = new Book("George Orwell", 10.50f, 20.00f, "1984", 328);
		Book book3 = new Book("J.K. Rowling", 12.75f, 22.99f, "Harry Potter y la piedra filosofal", 309);
		Book book4 = new Book("Miguel de Cervantes", 18.00f, 30.00f, "Don Quijote de la Mancha", 863);
		DigitalBook DB1 = new DigitalBook("Gabriel García Márquez", 15.99f, 25.50f, "Cien años de soledad", 471, "https://ejemplo.com/cien_anos", 5);
		DigitalBook DB2 = new DigitalBook("George Orwell", 10.50f, 20.00f, "1984", 328, "https://ejemplo.com/1984", 3);
		DigitalBook DB3 = new DigitalBook("J.K. Rowling", 12.75f, 22.99f, "Harry Potter y la piedra filosofal", 309, "https://ejemplo.com/harry_potter1", 4);
		
		book1.titleToString();
		DB1.titleToString();

	}

}
