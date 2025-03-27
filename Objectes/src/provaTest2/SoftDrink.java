package provaTest2;

public class SoftDrink extends Drink {
	private float sugar;
	private boolean hasDiscount;
	private static final double PROMOTION = 0.10;
	
	public SoftDrink(float capacity, float cost, String tradeMark, float sugar, boolean hasDiscount) {
		super(capacity, cost, tradeMark);
		this.sugar = sugar;
		this.hasDiscount = hasDiscount;
		this.cost = calcTotal();
	}
	
    public float getSugar() { return sugar; }

	public boolean isHasDiscount() { return hasDiscount; }

	public void setSugar(float sugar) { this.sugar = sugar; }

	public void setHasDiscount(boolean hasDiscount) { this.hasDiscount = hasDiscount; }

	public double calcTotal() {
        return hasDiscount ? cost * PROMOTION : cost;
    }
}
