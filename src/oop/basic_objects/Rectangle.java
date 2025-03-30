package basic_objects;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void calculateArea() {
		System.out.println("Area is: " + this.width * this.height);
	}
	
	public void calculatePerimeter() {
		int perimeter = 2 * (this.width + this.height);
		System.out.println("Perimeter is: " + perimeter);
	}
}
