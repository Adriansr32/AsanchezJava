package gestio_de_comandas_d_una_cafeteria;

public class Main {

	public static void main(String[] args) {
		Cafeteria cafeteria = new Cafeteria();
		
		
		 // Registre de clients (amb DNI)
		 cafeteria.registrarClient(new Client("12345678A", "Anna", false));
		 cafeteria.registrarClient(new Client("87654321B", "Laura", true));
		 cafeteria.registrarClient(new Client("11223344C", "Jordi", false));
		
		//fer comandes utilitzant el DNI
		 cafeteria.ferComanda("12345678A", "Cafè amb llet");
		 cafeteria.ferComanda("87654321B", "Cafè sol");
		 cafeteria.ferComanda("11223344C", "Té verd");
		 cafeteria.ferComanda("00000000Z", "Capuccino"); // Client no registrat
		 // Mostrar cua
		 cafeteria.mostrarCua();
		 // Processar comandes
		 System.out.println("--- Processant comandes ---");
		 cafeteria.processarComanda();
		 cafeteria.processarComanda();
		 cafeteria.processarComanda();
		 cafeteria.processarComanda();
		 // Mostrar dades clients
		 cafeteria.mostrarInformacioClient("12345678A");
		 cafeteria.mostrarInformacioClient("00000000Z");
	}

}
