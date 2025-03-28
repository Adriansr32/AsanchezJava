package objectes_AdrianSanchez;

public class testAlumno {

	public static void main(String[] args) {
		Alumno pringao1 = new Alumno("pringaillo", 13, 7);
		Alumno pringao2 = new Alumno("pringaillo2", 18, 4);
		
	System.out.println("El alumno:  " + pringao1.getNombre() + " ha aprobado: " + pringao1.esAprobado());	
	System.out.println("El alumno:  " + pringao2.getNombre() + " ha aprobado: " + pringao2.esAprobado());	
	}

}
