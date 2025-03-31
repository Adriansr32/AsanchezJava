package examen3_1;

public interface IElectricCar {
	/*
	 * Aixo el que fa es retornar el chargeTime ( Temps de carrega )
	 * 
	 * @return chargeTime
	 */
	public int getChargeTime();

	/*
	 * Aixo el que fa es afegir/modificar el chargeTime
	 * 
	 * @pram chargeTime ( Temps de carrega )
	 */
	public void setChargeTime(int chargeTime);

	/*
	 * Aixo el que fa es retornar el batteryCapacity ( la capacitat de la bateria )
	 * 
	 * @return batteryCapacity
	 */
	public int getBatteryCapacity();

	/*
	 * Aixo el que fa es afegir/modificar el baterryCapacity
	 * 
	 * @pram batteryCapacity ( capacitat de la bateria )
	 */
	public void setBatteryCapacity(int batteryCapacity);

	/*
	 * Aixo el que fa es retornar el consum
	 * 
	 * @eturn consumption
	 */
	public int getConsumption();

	/*
	 * Aixo el que fa es afegir/modificar el consum
	 * 
	 * @pram consumption
	 */
	public void setConsumption(int consumption);

}
