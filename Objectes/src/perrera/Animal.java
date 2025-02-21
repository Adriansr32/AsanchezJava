package perrera;

abstract class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo.");
    }
}
