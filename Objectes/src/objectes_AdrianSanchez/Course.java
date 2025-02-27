package objectes_AdrianSanchez;

/**
 * Representa un curs amb el seu nom i el nom del professor.
 * Proporciona mètodes per obtenir i modificar aquests atributs,
 * així com un mètode per obtenir una representació en cadena del curs.
 */
class Course {

    /**
     * El nom del curs.
     */
    private String nameCourse;

    /**
     * El nom del professor del curs.
     */
    private String nameTeacher;

    /**
     * Crea un curs amb el nom del curs i el nom del professor especificats.
     * 
     * @param nameCourse El nom del curs.
     * @param nameTeacher El nom del professor del curs.
     */
    public Course(String nameCourse, String nameTeacher) {
        this.nameCourse = nameCourse;
        this.nameTeacher = nameTeacher;
    }

    /**
     * Obté el nom del curs.
     * 
     * @return El nom del curs.
     */
    public String getNameCourse() {
        return nameCourse;
    }

    /**
     * Obté el nom del professor.
     * 
     * @return El nom del professor.
     */
    public String getNameTeacher() {
        return nameTeacher;
    }

    /**
     * Estableix el nom del curs.
     * 
     * @param nameCourse El nou nom del curs.
     */
    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    /**
     * Estableix el nom del professor.
     * 
     * @param nameTeacher El nou nom del professor.
     */
    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    /**
     * Retorna una representació en cadena del curs amb el seu nom i el nom del professor.
     * 
     * @return Una cadena amb la informació del curs.
     */
    public String formatCadena() {
        return nameCourse + " impartit per " + nameTeacher;
    }
}
