package objectes_AdrianSanchez;

class Coche {
	private String marca;
	private String modelo;
	private int velocidadActual;
	
	
	public Coche() {
		this.marca = "adios";
		this.modelo = "hola";
		this.velocidadActual = 0;
	}
	
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadActual = 0;
	}
	
	public void acelerar(int cantidad) {
		this.velocidadActual += cantidad;
	}
	
	public void frenar(int cantidad) {
	     if (this.velocidadActual - cantidad < 0) {
	           this.velocidadActual = 0;
	       } else {
	            this.velocidadActual -= cantidad;
	        }
	}
    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad actual: " + this.velocidadActual + " km/h");
    }
}
