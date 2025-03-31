package examen3_2;

/*
 * Clase node que el que fa es crear un node
 * @pram person dataType Person
 * @pram next dataType Node
 */
public class Node {
	private Person person;
	private Node next;

	/*
	 * Constructor de node amb person
	 * 
	 * @pram person
	 */
	public Node(Person person) {
		this.person = person;
		this.next = null;
	}

	/*
	 * Aixo el que fa es retornar la persona
	 * 
	 * @pram person
	 */
	public Person getPerson() {
		return person;
	}

	/*
	 * Aixo el que fa es retornar next
	 * 
	 * @return next
	 */
	public Node getNext() {
		return next;
	}

	/*
	 * Aixo el que fa es afegir/modificar el next
	 * 
	 * @pram next
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
