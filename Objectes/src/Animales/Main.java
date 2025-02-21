package Animales;

public class Main {

	public static void main(String[] args) {
        Perro perro = new Perro("Max", 3);
        Gato gato = new Gato("Luna", 2);

        perro.mostrarInfo();
        perro.emitirSonido();

        gato.mostrarInfo();
        gato.emitirSonido();

	}

}
