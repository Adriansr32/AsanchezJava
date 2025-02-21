package perrera;

public class Main {

	public static void main(String[] args) {
       
		Perro perro = new Perro("Rex");
        Gato gato = new Gato("Mittens");

        perro.hacerSonido();
        gato.hacerSonido();
        perro.dormir();
        gato.dormir();
    }
	
}

