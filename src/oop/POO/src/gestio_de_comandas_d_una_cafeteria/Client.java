package gestio_de_comandas_d_una_cafeteria;

public class Client {
	private String dni;
	private String name;
	private boolean isVIP;
	
	public Client(String dni, String name, boolean isVIP) {
		this.dni = dni;
		this.name = name;
		this.isVIP = isVIP;
	}
	public String getDni() {
		return dni;
	}
	public String getName() {
		return name;
	}
	
	public boolean isVIP() {
		return isVIP;
	}
	 @Override
	 public String toString() {
		 return name + "[" + dni + "]" + (isVIP ? " (VIP)" : "");
	 }
}
