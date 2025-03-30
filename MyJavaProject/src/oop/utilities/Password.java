package utilities;
import java.util.*;
import java.util.Random;

public class Password {
    private int longitud;
    private String contrasenya;

    public Password() {
        this.longitud = 8; 
        this.contrasenya = generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasenya = generarPassword();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contrasenya = generarPassword(); 
    }

    private String generarPassword() {
        String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder contrasenya = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(CARACTERES.length());
            contrasenya.append(CARACTERES.charAt(indice));
        }

        return contrasenya.toString();
    }

    public boolean esForta() {
        int majuscules = 0;
        int minuscules = 0;
        int numeros = 0;

        for (char c : contrasenya.toCharArray()) {
            if (Character.isUpperCase(c)) {
                majuscules++;
            } else if (Character.isLowerCase(c)) {
                minuscules++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return (majuscules >= 2 && minuscules >= 1 && numeros >= 5);
    }
}

