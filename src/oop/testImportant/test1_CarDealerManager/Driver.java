package examen3_1;

import java.util.Scanner;
/*
 * Clase Driver de la gestio d'un concessinari
 * 
 */

public class Driver {
	/*
	 * Metode main que el que fa es instanciar el objectes de les clases ElectricCar
	 * i CombustionCar
	 * 
	 */
	public static void main(String[] args) {
		CarShowcase carShowcase = new CarShowcase();

		carShowcase.addCar(new ElectricCar("Tesla", "1", 45000, 5000, 5000, 1000));
		carShowcase.addCar(new ElectricCar("Mercedes", "2", 24000, 5000, 5000, 1000));
		carShowcase.addCar(new ElectricCar("BMW", "3", 53000, 5000, 5000, 1000));
		carShowcase.addCar(new ElectricCar("Toyota", "4", 10000, 5000, 5000, 1000));
		carShowcase.addCar(new ElectricCar("Ferrari", "5", 100000, 5000, 5000, 1000));
		carShowcase.addCar(new CombustionCar("Lamborguini", "6", 200000, "Gasolina", 5000f, 1000f));
		carShowcase.addCar(new CombustionCar("Huinday", "7", 11000, "Dièsel", 5000f, 1000f));
		carShowcase.addCar(new CombustionCar("Toyota", "8", 5000, "Gasolina", 5000f, 1000f));
		carShowcase.addCar(new CombustionCar("Mitshubitchi", "9", 14000, "Gasolina", 5000f, 1000f));
		carShowcase.addCar(new CombustionCar("Porsche", "10", 21000, "Dièsel", 5000f, 1000f));

		menu();

		int opcio = InputHelper.readInt("Introdueix la teva opcio: ");
		switch (opcio) {
		case 0:
			int positionCar = InputHelper.readInt("Introdueix el cotxe que vols ");
			if (!carShowcase.buyCar(positionCar)) {
				System.out.println("La posicio es incorrecta o no esta buida!");
			} else {
				carShowcase.displayCar(positionCar);
				carShowcase.carStock();
			}
			break;
		case 1:
			double newPrice = InputHelper.readDouble("Introdueix el preu que vols canviar: ");
			int newPositionCar = InputHelper.readInt("Introdueix la posició que vols introdüir: ");
			if (!carShowcase.updateCarPrice(newPositionCar, newPrice)) {
				System.out.println("La posició es incorrecta o esta buida, el preu no pot ser inferior a 5000");
			}
			break;
		case 2:
			int carType = InputHelper
					.readInt("Introdueix si vols afegir un cotxe de tipus electric (1) o de tipus combustió (2)");
			if (carType == 1) {
				String brand = InputHelper.readString("Introdueix la marca: ");
				String model = InputHelper.readString("Introdueix el model: ");
				double price = InputHelper.readDouble("Introdueix el preu: ");
				int chargeTime = InputHelper.readInt("Introdueix el temps de carrega: ");
				int batteryCapacity = InputHelper.readInt("Introdueix la capacitat de la bateria: ");
				int consumption = InputHelper.readInt("Introdueix el consum per 100 km");
				carShowcase.addCar(new ElectricCar(brand, model, price, chargeTime, batteryCapacity, consumption));
			} else if (carType == 2) {
				String brand = InputHelper.readString("Introdueix la marca: ");
				String model = InputHelper.readString("Introdueix el model: ");
				double price = InputHelper.readDouble("Introdueix el preu: ");
				String fuelType = InputHelper.readString("Introdueix el tipus de combustible ( Gasolina o Dièsel ): ");
				float tankCapacity = InputHelper.readFloat("Introdueix la capacitat del deposit: ");
				float consumption = InputHelper.readFloat("Introduexi el consum per 100km");
				carShowcase.addCar(new CombustionCar(brand, model, price, fuelType, tankCapacity, consumption));
			} else {
				System.out.println("Aquesta opció no esta disponible");
			}
			break;
		}
	}

	/*
	 * Metodo menu que el que fa es mostrar el menu del concessionari
	 */
	public static void menu() {
		System.out.println("0. Comprar cotxe");
		System.out.println("1. Modificar el preu del cotxe");
		System.out.println("2. Afegir el cotxe");
	}

}
