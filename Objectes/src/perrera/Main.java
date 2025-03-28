package perrera;

public class Main {

	public static void main(String[] args) {
		// No se puede instanciar directamente un Animal
        // Animal a = new Animal("Animal");
		
		Perro perro = new Perro("Rex");
        Gato gato = new Gato("Mittens");

        perro.hacerSonido();
        gato.hacerSonido();
        perro.dormir();
        gato.dormir();
    }
	
}

