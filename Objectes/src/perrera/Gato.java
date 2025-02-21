package perrera;

public class Gato extends Animal {
    
	public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " dice: ¡Miau!");
    }
}

