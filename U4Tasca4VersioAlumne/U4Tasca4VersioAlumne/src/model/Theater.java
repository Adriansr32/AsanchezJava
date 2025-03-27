package model;

public class Theater implements ITheater {
	private static int counter = 0;
	private int id;
	private int capacity;
	
	public Theater(int capacity) {
		this.id = counter++;
		this.capacity = capacity;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int getCapacity() {
		return capacity;
	}
	@Override
	public String toString() {
		return "id: " + id + ", capacity: " + capacity;
	}

}
