package examen3_1;

/*
 * Clase ElectricCar per instanciar el cotxes electrics
 * @Author Adrian Sanchez
 * @pram AUTONOMY es una constante que guarda el número 100
 * @pram chargeTime es un atribut que guarda el temps per carregar el cotxe
 * @pram batteryCapacity es un atribut que guarda quanta capacitat de bateria te el cotxe
 * @pram consumption es un atribut que guarda el consum per cada 100km
 */
public class ElectricCar extends Car implements IElectricCar {
	private final int AUTONOMY = 100;
	private int chargeTime;
	private int batteryCapacity;
	private int consumption;

	/*
	 * @pram brand es la marca del cotxe.
	 * 
	 * @pram model es el model del cotxe.
	 * 
	 * @pram price es el preu del cotxe.
	 * 
	 * @pram chargeTime es un atribut que guarda el temps per carregar el cotxe
	 * 
	 * @pram batteryCapacity es un atribut que guarda quanta capacitat de bateria te
	 * el cotxe
	 * 
	 * @pram consumption es un atribut que guarda el consum per cada 100km
	 * 
	 */
	public ElectricCar(String brand, String model, double price, int chargeTime, int batteryCapacity, int consumption) {
		super(brand, model, price);
		this.chargeTime = chargeTime;
		this.batteryCapacity = batteryCapacity;
		this.consumption = consumption;
		this.autonomy = calcAutonomy();
	}

	/*
	 * Aixo el que fa es retornar el chargeTime ( Temps de carrega )
	 * @return chargeTime
	 */
	public int getChargeTime() {
		return chargeTime;
	}

	/*
	 * Aixo el que fa es afegir/modificar el chargeTime
	 * 
	 * @pram chargeTime ( Temps de carrega )
	 */
	public void setChargeTime(int chargeTime) {
		this.chargeTime = chargeTime;
	}

	/*
	 * Aixo el que fa es retornar el batteryCapacity ( la capacitat de la bateria )
	 * @return batteryCapacity
	 */
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	/*
	 * Aixo el que fa es afegir/modificar el baterryCapacity
	 * 
	 * @pram batteryCapacity ( capacitat de la bateria )
	 */
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	/*
	 * Aixo el que fa es retornar el consum
	 * @eturn consumption
	 */
	public int getConsumption() {
		return consumption;
	}

	/*
	 * Aixo el que fa es afegir/modificar el consum
	 * 
	 * @pram consumption
	 */
	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	/*
	 * Aixo el que fa es calcular la atonomia del cotxe electric
	 * 
	 * @return batteryCapcity / consumption * AUTONOMY
	 */
	@Override
	int calcAutonomy() {
		return batteryCapacity / consumption * AUTONOMY;
	}

}
