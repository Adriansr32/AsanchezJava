package Objectes1;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int velocidadMaxima;
    
	public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = 0;
    }
	
	public String toString() {
		return "Marca: " + this.marca + " | " + " Modelo: " + this.modelo + " | " + " Velocidad maxima: " + this.velocidadMaxima;
	}
	
}
