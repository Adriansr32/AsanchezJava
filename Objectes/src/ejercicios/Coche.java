package ejercicios;

public class Coche {
	private String marca;
	private String modelo; 
	private int año;
	private String color;
	
	public Coche(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	
	public void setMarca(String newValue) {
		this.marca = newValue;
	}
	
	public void setModelo(String newValue) {
		this.modelo = newValue;
	}
	
	public void setAño(int newValue) {
		this.año = newValue;
	}
	public void setColor(String newValue) {
		this.color = newValue;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAño() {
		return año;
	}
	
	public String getColor() {
		return color;
	}
	
	public void detalles() {
		System.out.println("Marca: " + marca + " Modelo: " + modelo + " Año: " + año);
	}
}
