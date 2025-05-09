package excepcions2_AdriánSánchez;

/**
 * La clase OutOfRangeException es una excepción personalizada que se utiliza para indicar
 * que un número está fuera del rango permitido.
 */
public class OutOfRangeException extends Exception {
    private String message;

    /**
     * Constructor de la excepción OutOfRangeException.
     * 
     * @param message Mensaje que describe la razón de la excepción.
     */
    public OutOfRangeException(String message) {
        super();
        this.message = message;
    } 

    /**
     * Método que devuelve el mensaje de error asociado a la excepción.
     * 
     * @return El mensaje de error.
     */
    @Override
    public String getMessage() {
        return message;
    }
}
