package examen3_1;

public interface ICombustionCar {
	/*
	 * Aixo el que fa es retornar el tipus de combustible
	 * 
	 * @return fuelType
	 */
	public String getFuelType();

	/*
	 * Aixo el que fa es afegir/modificar el tipus de combustible
	 * 
	 * @pram fuelType
	 */
	public void setFuelType(String fuelType);

	/*
	 * Aixo el que fa es retornar la capacitat del deposit
	 * 
	 * @return tankCapacity
	 */
	public float getTankCapacity();

	/*
	 * Aixo el que fa es afegir/modificar la capacitat del deposit
	 * 
	 * @pram tankCapacity
	 */
	public void setTankCapacity(float tankCapacity);

	/*
	 * Aixo el que fa es retornar el consum
	 * 
	 * @return consumption
	 */
	public float getConsumption();

	/*
	 * Aixo el que fa es afegir/modificar el consum
	 * 
	 * @pram consumption
	 */
	public void setConsumption(float consumption);
}
