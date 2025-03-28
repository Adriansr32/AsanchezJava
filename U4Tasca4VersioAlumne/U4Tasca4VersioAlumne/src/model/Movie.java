package model;

public class Movie implements IMovie {
	private static int counter = 0;
	private int id;
	private String name;
	private String author;
	private int duration;
	
	public Movie(String name, String author, int duration) {
		this.id = counter++;
		this.name = name;
		this.author = author;
		this.duration = duration;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int getDuration() {
		return duration;
	}

	@Override
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "id: " + id + "\nName: " + name + "\nAuthor: " + author+ "\nDuration: " + duration + "m" + "\n------------------";
	}
}
