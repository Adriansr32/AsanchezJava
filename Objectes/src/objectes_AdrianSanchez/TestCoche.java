package objectes_AdrianSanchez;

public class TestCoche {

	public static void main(String[] args) {
		Coche coche1 = new Coche("tete", "pete");
		
		coche1.acelerar(50);
		coche1.frenar(20);
		coche1.mostrarInformacion();
	}

}
