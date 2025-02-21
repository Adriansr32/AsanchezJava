package empresa;

public class Main {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan", 2000);
		Gerente gerente1 = new Gerente("Laura", 3000, 500);
		Programador programador1 = new Programador("Carlos", 2500, "Java");
		
		System.out.println(empleado1);
		System.out.println(gerente1);
		System.out.println(programador1);
		
	}

}
