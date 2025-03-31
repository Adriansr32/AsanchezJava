package examen3_1;

/*
 * Clase ElectricCar per instanciar el cotxes electrics
 * @Author Adrian Sanchez
 * @pram AUTONOMY es una constante que guarda el número 100
 * @pram fuelType es un atribut que guarda el tipus de combustble ( Gasolina o Dièsel ) 
 * @pram tankCapacity es un atribut que guarda la capacitat del deposit
 * @pram consumption es un atribut que guarda el consum per cada 100km
 */
public class CombustionCar extends Car implements ICombustionCar {
	private final int AUTONOMY = 100;
	private String fuelType;
	private float tankCapacity;
	private float consumption;

	/*
	 * @pram brand es la marca del cotxe.
	 * 
	 * @pram model es el model del cotxe.
	 * 
	 * @pram price es el preu del cotxe.
	 * 
	 * @pram fuelType es un atribut que guarda el tipus de combustble ( Gasolina o
	 * Dièsel )
	 * 
	 * @pram tankCapacity es un atribut que guarda la capacitat del deposit
	 * 
	 * @pram consumption es un atribut que guarda el consum per cada 100km
	 * 
	 * 
	 */
	public CombustionCar(String brand, String model, double price, String fuelType, float tankCapacity,
			float consumption) {
		super(brand, model, price);
		this.fuelType = fuelType;
		this.tankCapacity = tankCapacity;
		this.consumption = consumption;
		this.autonomy = calcAutonomy();
	}

	/*
	 * Aixo el que fa es retornar el tipus de combustible
	 * 
	 * @return fuelType
	 */
	public String getFuelType() {
		return fuelType;
	}

	/*
	 * Aixo el que fa es afegir/modificar el tipus de combustible
	 * 
	 * @pram fuelType
	 */
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	/*
	 * Aixo el que fa es retornar la capacitat del deposit
	 * 
	 * @return tankCapacity
	 */
	public float getTankCapacity() {
		return tankCapacity;
	}

	/*
	 * Aixo el que fa es afegir/modificar la capacitat del deposit
	 * 
	 * @pram tankCapacity
	 */
	public void setTankCapacity(float tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	/*
	 * Aixo el que fa es retornar el consum
	 * 
	 * @return consumption
	 */
	public float getConsumption() {
		return consumption;
	}

	/*
	 * Aixo el que fa es afegir/modificar el consum
	 * 
	 * @pram consumption
	 */
	public void setConsumption(float consumption) {
		this.consumption = consumption;
	}

	/*
	 * Aixo el que fa es retornar el calcul de la autonomia
	 * 
	 * @return tankCapacity / consumption * AUTONOMY
	 */
	@Override
	int calcAutonomy() {
		return (int) (tankCapacity / consumption * AUTONOMY);
	}

}
