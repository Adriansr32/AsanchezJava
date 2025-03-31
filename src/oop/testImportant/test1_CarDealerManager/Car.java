package examen3_1;

/*
 * Clase abstracta de car aixo es l'estructura del cotxe
 * @author Adrian Sanchez
 */
abstract class Car {
	private static int NUMBER_PLATENUMBER = 0000;
	private int plateNumber;
	private String brand;
	private String model;
	private double price;
	protected int autonomy;

	/*
	 * @pram brand es la marca del cotxe.
	 * 
	 * @pram model es el model del cotxe.
	 * 
	 * @pram price es el preu del cotxe.
	 */
	public Car(String brand, String model, double price) {
		this.plateNumber = NUMBER_PLATENUMBER++;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	/*
	 * Aixo el que fa es retornar el plateNumber(matricula)
	 * @return plateNumber
	 */
	public int getPlateNumber() {
		return plateNumber;
	}

	/*
	 * Aixo el el que fa es afeigir/modificar el plateNumber
	 * 
	 * @pram plateNumber matricula
	 */

	public void setPlateNumber(int plateNumber) {
		this.plateNumber = plateNumber;
	}

	/*
	 * Aixo el que fa es retornar el brand ( marca )
	 * @return brand
	 */

	public String getBrand() {
		return brand;
	}

	/*
	 * Aixo el que fa es afegir/modificar el brand
	 * 
	 * @pram brand ( marca )
	 */

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/*
	 * Aixo el que fa es retornar el model ( model )
	 * @return model
	 */

	public String getModel() {
		return model;
	}

	/*
	 * Aixo el que fa es afegir/modificar el model
	 * 
	 * @parm model ( model )
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/*
	 * Aixo el que fa es retornar el preu
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/*
	 * Aixo el que fa es afegir/modificar el preu
	 * 
	 * @pram price ( preu )
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * Aixo el que fa es retornar la autonomia
	 * @return autonomy
	 */
	public int getAutonomy() {
		return autonomy;
	}

	/*
	 * Aixo el que fa es afegir/modificar la autonomia
	 * 
	 * @pram autonomy ( autonomia )
	 */
	public void setAutonomy(int autonomy) {
		this.autonomy = autonomy;
	}

	/*
	 * Metode abstracte que el que fa es calcular la autonomia
	 */
	abstract int calcAutonomy();

}
