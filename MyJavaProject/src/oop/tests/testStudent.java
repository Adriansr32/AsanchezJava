package tests;

import basic_objects.Student;

public class testStudent {

	public static void main(String[] args) {
		Student pringao1 = new Student("pringaillo", 13, 7);
		Student pringao2 = new Student("pringaillo2", 18, 4);
		
	System.out.println("El alumno:  " + pringao1.getName() + " ha aprobado: " + pringao1.isPassed());	
	System.out.println("El alumno:  " + pringao2.getName() + " ha aprobado: " + pringao2.isPassed());	
	}

}
