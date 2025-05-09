package gestio_de_una_biblioteca;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		
		library.addBook(new Book("001", "El Quixot", "Cervantes", 2));
		library.addBook(new Book("002", "1984", "Orwell", 1));
		library.addBook(new Book("003", "El Petit Príncep", "Saint-Exupéry", 3));
		library.registerUser(new Users("u1", "Anna"));
		library.registerUser(new Users("u2", "Jordi"));
		library.prestarLlibre("u1", "001");
		library.prestarLlibre("u1", "003");
		library.prestarLlibre("u2", "002");
		library.mostrarPrestecs();
	}

}
