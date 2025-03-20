package ejercicios;

public class Main {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("marca", "modelo", 2008);
		
		c1.detalles();
		c1.setAño(2004);
		c1.detalles();

	}

}
