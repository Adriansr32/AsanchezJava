package collections_AdriánSánchez;

import java.util.*;

/**
 * La clase {@code Palíndrom} proporciona una utilidad para comprobar si una palabra es un palíndromo.
 * <p>
 * Un palíndromo és una paraula que es llegeix igual d'esquerra a dreta que de dreta a esquerra,
 * ignorant majúscules i minúscules.
 * </p>
 * 
 * <p><b>Exemple d'execució:</b></p>
 * <pre>
 * Civic és un palíndrom.
 * </pre>
 * 
 * @author Adrián Sánchez
 */
public class Palíndrom {

    /**
     * Mètode principal que comprova si una paraula és un palíndrom.
     * <p>
     * Es crida al mètode {@link #isPalindrome(String)} per realitzar la comprovació
     * i mostrar el resultat per consola.
     * </p>
     *
     * @param args Arguments de línia de comandes (no s'utilitzen).
     */
    public static void main(String[] args) {
        String word = "pana"; 
        if (isPalindrome(word)) {
            System.out.println(word + " és un palíndrom.");
        } else {
            System.out.println(word + " no és un palíndrom.");
        }
    }

    /**
     * Comprova si una paraula és un palíndrom utilitzant una cua i una pila.
     * <p>
     * La paraula es converteix a minúscules i cada caràcter es col·loca en una cua
     * i en una pila. Després es comparen els elements extrets d'ambdues estructures.
     * </p>
     *
     * @param word La paraula a comprovar.
     * @return {@code true} si la paraula és un palíndrom, {@code false} en cas contrari.
     */
    public static boolean isPalindrome(String word) {
    	word = word.toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Deque<Character> stack = new LinkedList<>();

        for (char character : word.toCharArray()) {
        	queue.add(character);
            stack.add(character);
        }

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.removeLast())) {
                return false;
            }
        }

        return true;
    }
}
