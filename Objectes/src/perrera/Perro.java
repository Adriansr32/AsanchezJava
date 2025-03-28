package perrera;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " dice: ¡Guau!");
    }
}
