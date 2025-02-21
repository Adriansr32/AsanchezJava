package Animales;

public class Gato extends Animal implements Sonido {

	public Gato(String nombre, int edad) {
		super(nombre, edad);
		
	}

	@Override
	public void emitirSonido() {
		System.out.println("Miau Miau!");

	}

}
