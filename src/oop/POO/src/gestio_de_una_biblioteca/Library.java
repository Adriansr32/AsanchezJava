package gestio_de_una_biblioteca;
import java.util.*;

public class Library {
	private List<Book> catalog = new ArrayList<>();
	private Map<String, Users> usuaris = new HashMap<>();
	private Map<String, Set<String>> prestecs = new HashMap<>();
	
	public Library() {
	}
	
	public void addBook(Book book) {
		catalog.add(book);
	}
	public void registerUser(Users user) {
		usuaris.put(user.getId(), user);
		prestecs.put(user.getId(), new HashSet<>());
	}
	public Book searchBookPerIsbn(String isbn) {
		for (Book l : catalog) {
			 if (l.getIsbn().equals(isbn)) return l;
			 }
		return null;
	}
	
	public boolean prestarLlibre(String idUsuari, String isbn) {
		if(!usuaris.containsKey(idUsuari)) {
			System.out.println("Usuari no registrat: " + idUsuari);
			return false;
		}
		Book book = searchBookPerIsbn(isbn);
		if(book != null && book.theresDisponibility()) {
			Set<String> llibresUsuari = prestecs.get(idUsuari);
			if(!llibresUsuari.contains(isbn)) {
				book.prestar();
				llibresUsuari.add(isbn);
				return true;
			}
		}
		return false;
	}
	
	public void mostrarPrestecs() {
		for (String id : prestecs.keySet()) {
			System.out.println(usuaris.get(id) + " Té en préstec: ");
			for (String isbn : prestecs.get(id)) {
				Book llibre = searchBookPerIsbn(isbn);
				System.out.println(" - " + llibre);
			}
		}
	}
 }
