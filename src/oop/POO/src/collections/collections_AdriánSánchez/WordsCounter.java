package collections_AdriánSánchez;

import java.util.*;

/**
 * La clase {@code WordsCounter} proporciona una funcionalidad para contar la frecuencia de cada palabra 
 * en un texto dado. Las palabras se consideran insensibles a mayúsculas/minúsculas y se separan por espacios.
 * <p>
 * Este programa de ejemplo procesa un texto de entrada, convierte todas las palabras a minúsculas,
 * y luego muestra cuántas veces aparece cada una.
 * </p>
 * 
 * <p><b>Ejemplo de salida:</b></p>
 * <pre>
 * Paraula: hola | Freqüència: 3
 * Paraula: món | Freqüència: 2
 * Paraula: adéu | Freqüència: 1
 * </pre>
 * 
 * @author Adrián Sánchez
 */
public class WordsCounter {

    /**
     * Método principal que ejecuta el conteo de palabras.
     * <p>
     * Convierte el texto de entrada a minúsculas, lo divide en palabras usando espacios como separadores,
     * y luego usa un {@link HashMap} para contar la frecuencia de cada palabra.
     * </p>
     * 
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        String text = "Hola món hola adéu món hola";
        String[] words = text.toLowerCase().split("\\s+");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (frequency.containsKey(word)) {
            	frequency.put(word, frequency.get(word) + 1);
            } else {
            	frequency.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> input : frequency.entrySet()) {
            System.out.println("Paraula: " + input.getKey() + " | Freqüència: " + input.getValue());
        }
    }
}
