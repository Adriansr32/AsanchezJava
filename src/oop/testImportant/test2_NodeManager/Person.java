package examen3_2;

/*
 * Clase person per a crear una persona
 * @pram name
 */
public class Person {
	private String name;

	/*
	 * Constructor de persona
	 * 
	 * @pram name
	 */
	public Person(String name) {
		this.name = name;
	}

	/*
	 * Aixo el que fa es retornar el name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/*
	 * Aixo el que fa es afegir/modificar el name
	 * 
	 * @pram name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
