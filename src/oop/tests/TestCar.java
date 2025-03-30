package tests;

import basic_objects.Car;

public class TestCar {

	public static void main(String[] args) {
		Car coche1 = new Car("tete", "pete");
		
		coche1.accelerate(50);
		coche1.brake(20);
		coche1.displayInfo();
	}

}
