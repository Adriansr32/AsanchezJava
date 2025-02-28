package herencia_AdriánSánchez;

import java.time.*;

public class Comercial extends Empleats {
	private double commission;
    public final double PLUS = 200;

	
	public Comercial(String DNI, String name, String lastName, LocalDate bornDate, double salary, double commission) {
		super(DNI, name, lastName, bornDate, salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}
	
	public void setCommission(double newValue) {
		this.commission = newValue;
	}
	
	@Override
	public String toString() {
		return super.toString() + " comissió: " + commission;
	}

	@Override
	public boolean plus() {
		if ((calAge() > 30) && (commission>200)) {
			double p = getSalary() + 200;
			System.out.println("Se le afegit un plus al treballador: " + getName());
			setSalary(p);
			return true;
		}
		return false;
	}
}
