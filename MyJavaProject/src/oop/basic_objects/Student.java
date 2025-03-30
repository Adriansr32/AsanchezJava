package basic_objects;

public class Student {
	private String name;
	private int age;
	private int finalGrade;
	
	public Student(String name, int age, int finalGrade) {
		this.name = name;
		this.age = age;
		this.finalGrade = finalGrade;
	}
	
	public String getName(){
		return name;
	}
	public boolean isPassed() {
		if (this.finalGrade >= 5) {
			return true;
		}
		return false;
	}
}
