package exercises.warehouse.drinks;

public class Drink {
	private static int counter = 0;
	private int id; 
	private float capacity;
	protected double cost;
	private String tradeMark;
	
	public Drink(float capacity, double cost, String tradeMark) {
		this.id = ++counter;
		this.capacity = capacity;
		this.cost = cost;
		this.tradeMark = tradeMark;
	}

	public int getId() { return id; }

	public double getCost() { return cost; }

	public String getTradeMark() { return tradeMark; }

	public void setId(int id) { this.id = id; }

	public void setCost(float cost) { this.cost = cost; }

	public void setTradeMark(String tradeMark) { this.tradeMark = tradeMark; }
	

}
