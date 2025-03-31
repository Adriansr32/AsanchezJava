package examen3_1;

import java.util.ArrayList;

/*
 * Clase CarShowCase que el que fa es controlar un concessionari amb una capacitat de 10 cotxes
 * @pram Car[] carDealership
 * @pram CARDEALERSHIP_CAPACITY 
 */
public class CarShowcase {
	private Car[] carDealership;
	private final int CARDEALERSHIP_CAPACITY = 10;

	/*
	 * Constructor de la clase
	 */
	public CarShowcase() {
		this.carDealership = new Car[CARDEALERSHIP_CAPACITY];
	}

	/*
	 * Metodo buyCar que el que fa es comprar un cotxe, primer el que fa es mirar si
	 * la posicio que s'ha intrüduit es diferente de menor o igual a 10
	 * 
	 * @return flase despres fem que si la posició es diferent a nula entonces
	 * 
	 * @return true
	 * 
	 * @pram position
	 */
	public boolean buyCar(int position) {
		if (!(position <= 10)) {
			return false;
		}
		if (carDealership[position] != null) {
			carDealership[position] = null;
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Metodo updateCarPrice el que fa aquest metode es modificar el preu de un
	 * cotxe
	 * 
	 * @pram position
	 * 
	 * @pram price
	 */
	public boolean updateCarPrice(int position, double price) {
		if (!(price >= 5000)) {
			return false;
		}
		if (carDealership[position] != null) {
			carDealership[position].setPrice(price);
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Metode displayCar el que fa es mostrar el cotxe que hem comprat
	 * 
	 * @pram position
	 */
	public void displayCar(int position) {
		if (carDealership[position] instanceof ElectricCar) {
			ElectricCar car = (ElectricCar) carDealership[position];
			System.out.println("Acabes de comprar un cotxe electric" + car.getBrand() + " model " + car.getModel()
					+ " amb una autonomia de " + car.getAutonomy() + ", capacitat de " + car.getBatteryCapacity()
					+ ", consum de " + car.getConsumption() + "." + "\nPreu: " + car.getPrice());
		} else if (carDealership[position] instanceof CombustionCar) {
			CombustionCar car = (CombustionCar) carDealership[position];
			System.out.println("Acabes de comprar un cotxe de combustió " + car.getBrand() + " model " + car.getModel()
					+ " amb una autonomia de " + car.getAutonomy() + ", capacitat de " + car.getTankCapacity()
					+ ", consum de " + car.getConsumption() + "." + "\nPreu: " + car.getPrice());
		}
	}

	/*
	 * Metode carStock el que fa es mostrar el stock que tenim encara
	 * 
	 */
	public void carStock() {
		ArrayList<ElectricCar> electricCar = new ArrayList<>();
		ArrayList<CombustionCar> combustionCar = new ArrayList<>();
		for (int i = 0; i < carDealership.length; i++) {
			if (carDealership[i] instanceof ElectricCar) {
				electricCar.add((ElectricCar) carDealership[i]);
			} else if (carDealership[i] instanceof CombustionCar) {
				combustionCar.add((CombustionCar) carDealership[i]);
			}

			int combustionCarCounter = 0;
			int electricCarCounter = 0;
			for (CombustionCar combustionCar2 : combustionCar) {
				combustionCarCounter++;
			}
			for (ElectricCar electricCar2 : electricCar) {
				electricCarCounter++;
			}
			System.out.println("En aquests moments quedan encara: ");
			System.out.println(combustionCarCounter + " Cotxes de combustió");
			System.out.println(electricCarCounter + " Cotxes electrics");
		}
	}

	/*
	 * Metode addCar que el que fa es afegir un cotxe
	 */
	public void addCar(Car car) {
		for (int i = 0; i < carDealership.length; i++) {
			if (carDealership[i] == null) {
				carDealership[i] = car;
			}
		}
	}
}
