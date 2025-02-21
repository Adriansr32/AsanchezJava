package objectes_AdrianSanchez;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double cantidad) {
		this.saldo =+ cantidad;
	}
	public void retirar(double cantidad) {
		if (this.saldo >= cantidad) {
			this.saldo -= cantidad;
		} else {
			System.out.println("No hay suficiente dinero, fokin pobre!!");
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Tu fokin saldo es: " + this.saldo);
	}
}
