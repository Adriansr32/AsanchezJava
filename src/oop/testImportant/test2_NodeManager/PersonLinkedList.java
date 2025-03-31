	package examen3_2;

	/*
	* Clase PersonLinkedList aquesta clase el que fa es guardar tot els nodes
	* @pram head atribut tipus Node
	*/
	public class PersonLinkedList {
		private Node head;

		/*
		* Constructor amb head = null
		*/
		public PersonLinkedList() {
			this.head = null;
		}

		/*
		* Metodo que el que fa es afegir una persona
		* 
		* @pram person
		*/
		public void add(Person person) {
			if (head == null) {
				head = new Node(person);	
			}
			else {
				Node current = head;
				while (current.next != null) {
					current = current.next;
				}	
			} 
		}

		/*
		* Metode Remove que que el que fa es borrar una persona
		*/
		public Person remove() {
			if (head == null) {
				return null;
			}
			else {
				Person person = head.person;
				head = head.next;
				return person;
			}
		}

		/*
		* Metode contains per veura si una persona hi es o no
		* 
		* @return flase
		*/
		public boolean contains(Person person) {
			Node current = head;
			while (current != null) {
				if (current.person.equals(person)) {
					return true;
				}
				current = current.next;
			}
		}

		/*
		* Metodo size per veura la mida
		*/
		public int size() {
			Node current = head;
			int size = 0;
			while (current!= null) {
				size++;
				current = current.next;
			}
			return size;
		}
	}
