package objectes_AdrianSanchez;

class Course {

	private String nameCourse;
	private String nameTeacher;
	
	public Course(String nameCourse, String nameTeacher) {
		this.nameCourse = nameCourse;
		this.nameTeacher = nameTeacher;
	}
	public String getNameCourse() {
	    return nameCourse;
	}
	public String getNameTeacher() {
		return nameTeacher;
	}
	public void setNameCourse(String nameCourse) {
	    this.nameCourse = nameCourse;
	}
	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}
	
	public String formatCadena() {
	    return nameCourse + " impartit per " + nameTeacher;
	}
}
