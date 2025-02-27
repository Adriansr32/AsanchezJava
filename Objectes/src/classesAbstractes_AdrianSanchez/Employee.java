package classesAbstractes_AdrianSanchez;

/**
 * Clase que representa un empleado, extendiendo la clase abstracta {@link Person}.
 * Contiene información adicional como la edad y el salario del empleado.
 * 
 * @author Adrian
 * @version 1.0
 */
public class Employee extends Person {
    private int age;
    private Double salary;

    /**
     * Constructor que inicializa un empleado con nombre, edad y salario.
     * 
     * @param name   El nombre del empleado.
     * @param age    La edad del empleado.
     * @param salary El salario del empleado.
     */
    public Employee(String name, int age, double salary) {
        super(name);
        this.age = age;
        this.salary = salary;
    }

    /**
     * Constructor que inicializa un empleado con nombre y edad. El salario se deja como nulo.
     * 
     * @param name   El nombre del empleado.
     * @param age    La edad del empleado.
     */
    public Employee(String name, int age) {
        super(name);
        this.age = age;
        this.salary = null;
    }
    
    /**
     * Muestra una descripción básica del empleado, incluyendo el nombre y la edad.
     * Si el salario está disponible, también lo muestra.
     */
    @Override
    public void getDescription() {
        if (salary != null) {
            System.out.println("Nombre: " + getName() + ", Edad: " + age + ", Salario: " + salary);
        } else {
            System.out.println("Nombre: " + getName() + ", Edad: " + age);
        }
    }
}
