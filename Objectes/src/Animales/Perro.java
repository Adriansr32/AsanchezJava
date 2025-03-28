package Animales;

class Perro extends Animal implements Sonido {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau Guau!");
    }

}
