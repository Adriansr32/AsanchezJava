package gestio_de_una_biblioteca;

public class Users {
	private String id;
	private String name;
	
	public Users(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String toString() {
		return name +  "[ID: " + id + "]";
	}
}
