package objectes_AdrianSanchez;

public class Rectangulo {
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea() {
		System.out.println("El area es: " +  this.base * this.altura);
	}
	
	public void CalcularPerimetro() {
		int p = 2 * (this.base + this.altura );
		System.out.println("El perimetro es " + p);
	}
}
