package gestio_de_comandas_d_una_cafeteria;

import java.util.*;

public class Cafeteria {
	private Map<String, Client> clients;
	private Deque<Command> comandes;

	public Cafeteria() {
		this.clients = new HashMap<>();
		this.comandes = new LinkedList<>();
	}

	public void registrarClient(Client client) {
		clients.put(client.getDni(), client);
	}

	public void ferComanda(String dniClient, String product) {
		Client client = clients.get(dniClient);

		if (client == null) {
			System.out.println("Client no registrat amb DNI: " + dniClient);
			return;
		}
		Command comanda = new Command(client, product);
		if (client.isVIP()) {
			comandes.addFirst(comanda);
			System.out.println("Comanda VIP afegida al principi.");
		} else {
			comandes.addLast(comanda);
			System.out.println("Comanda normal afegida al final.");
		}

	}

	public void processarComanda() {
		if (!comandes.isEmpty()) {
			Command comanda = comandes.pollFirst();
			System.out.println("Proccesant: - " + (comanda.getClient().isVIP() ? "( VIP ) " : "( Normal ) ") + comanda);
		} else {
			System.out.println("No hi ha comandes pendents.");
		}
	}

	public void mostrarCua() {
		System.out.println("Cua de comandes");
		for (Command command : comandes) {
			System.out.println(" - " + command.getClient() + " ha demanat " + command);
		}
	}

	public void mostrarInformacioClient(String dniClient) {
		Client client = clients.get(dniClient);
		if (client != null) {
			System.out.println("Informació del client:");
			System.out.println(" - Nom: " + client.getName());
			System.out.println(" - DNI: " + client.getDni());
			System.out.println(" - Tipus: " + (client.isVIP() ? "VIP" : "Normal"));
		} else {
			System.out.println("No s'ha trobat informació amb el dni: " + dniClient);
		}
	}
}
