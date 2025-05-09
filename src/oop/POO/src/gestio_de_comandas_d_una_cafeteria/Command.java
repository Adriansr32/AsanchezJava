package gestio_de_comandas_d_una_cafeteria;

public class Command {
	private Client client;
	private String product;
	
	public Command(Client client, String product) {
		this.client = client;
		this.product = product;
	}
	
	public Client getClient() {
		return client;
	}
	
	public String getProduct() {
		return product;
	}
	@Override
	public String toString(){
		return product;
	}
}
