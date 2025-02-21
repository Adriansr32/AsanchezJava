package objectes_AdrianSanchez;

public class TestCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria banco1 = new CuentaBancaria("Adrian", 1000);
		
		banco1.depositar(500);
		banco1.retirar(300);
		banco1.consultarSaldo();
	}

}
