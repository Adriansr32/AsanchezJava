package provaTest2;

public class MineralWater extends Drink {
	private String source;

	public MineralWater(float capacity, float cost, String tradeMark, String source) {
		super(capacity, cost, tradeMark);
		this.source = source;
	}

	public String getSource() { return source; }

	public void setSource(String source) { this.source = source; }
	
	

}
