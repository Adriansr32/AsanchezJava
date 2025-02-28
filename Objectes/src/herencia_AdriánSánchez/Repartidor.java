package herencia_AdriánSánchez;

import java.time.*;

public class Repartidor extends Empleats {
	private int zone;
    public final double PLUS = 100;

	public Repartidor(String DNI, String name, String lastName, LocalDate bornDate, double salary, int zone) {
		super(DNI, name, lastName, bornDate, salary);
		this.zone = zone;
	}
	
	public int getZone() {
		return zone;
	}
	public void setZone(int newValue) {
		this.zone = newValue;
	}
	@Override
	public String toString() {
	
		return super.toString() + " zona: " + zone;
	}
	@Override
	public boolean plus() {
		if((calAge() < 25) && (zone == 5)) {
			double p = getSalary() + PLUS;
			setSalary(p);
			System.out.print("Se le afegit un plus al treballador: " + getName());
			return true;
		}
		return false;
	}
}	
