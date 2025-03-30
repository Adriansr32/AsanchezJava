package basic_objects;

public class Car {
	private String brand;
	private String model;
	private int currentSpeed;
	
	public Car() {
		this.brand = "default";
		this.model = "default";
		this.currentSpeed = 0;
	}
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.currentSpeed = 0;
	}
	
	public void accelerate(int amount) {
		this.currentSpeed += amount;
	}
	
	public void brake(int amount) {
		if (this.currentSpeed - amount < 0) {
			this.currentSpeed = 0;
		} else {
			this.currentSpeed -= amount;
		}
	}
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Current Speed: " + this.currentSpeed);
    }
}
