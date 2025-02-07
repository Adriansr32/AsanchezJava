/**
 * La classe DissenyModular_1 és el punt d'entrada per a la
 * execució del programa modular. Aquesta classe gestiona un
 * menú d'opcions que permet a l'usuari executar diferents
 * mètodes relacionats amb la generació de matrius binàries,
 * la conversió de números a lletres, i altres funcions.
 *
 * @author AdrianSanchez
 * @version 1.0
 * @since 2025-02-05
 */
package dissenyModular_AdriánSánchez;

import java.util.*;
import metodes1_AdrianSanchez.metodes1_6;
import metodes2_AdrianSanchez.metodes2_3;
import metodes3_AdrianSanchez.Metodes3_1;

/**
 * Mètode principal per a l'execució del programa.
 *
 * @param args Arguments de línia de comandes (no s'utilitzen).
 */
public class DissenyModular_1 {

    /**
     * Mètode principal que gestiona el menú i les opcions
     * disponibles per a l'usuari.
     *
     * @param args Arguments de línia de comandes (no s'utilitzen).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        int op = 0;

        while (!valid) {
            mostrarMenu();

            System.out.println("Entra una opcio: ");

            if (in.hasNextInt()) {
                op = in.nextInt();
                if (op >= 1 && op <= 5) {
                    valid = true;
                } else {
                    System.err.println("Opció no vàlida. Intenta de nou.");
                }
            } else {
                System.err.println("Error: El valor ha de ser un número.");
                in.next();
            }
        }

        switch (op) {
            case 1:
                ejecutarTestMatriuBinaria();
                break;
            case 2:
                mostrarNumeroEnLletres();
                break;
            case 3:
                dibujarArbre();
                break;
            case 4:
                mostrarFaq();
                break;
            case 5:
                System.out.println("Sortint...");
                break;
            default:
                System.out.println("Opcio no valida.");
        }

        in.close();
    }

    /**
     * Mostra el menú d'opcions disponibles per a l'usuari.
     * Aquest mètode no té paràmetres ni retorna cap valor.
     *
     * @see #ejecutarTestMatriuBinaria()
     * @see #mostrarNumeroEnLletres()
     * @see #dibujarArbre()
     * @see #mostrarFaq()
     */
    public static void mostrarMenu() {
        System.out.println("Menú");
        System.out.println("-------------------------------");
        System.out.println("1. Executa el test sobre el mètode de generació de matriu binària (dimensió= 4)");
        System.out.println("2. Mostra com s'escriu amb lletres el número 2823");
        System.out.println("3. Dibuixa les fulles d'un arbre amb base 21");
        System.out.println("4. Preguntes més freqüents sobre mètodes");
        System.out.println("5. Sortir");
        System.out.println();
    }

    /**
     * Executa el test sobre la generació d'una matriu binària
     * de dimensió 4 i mostra el resultat.
     * 
     * @throws IllegalArgumentException Si la dimensió no és vàlida.
     * @see metodes1_6#generarMatriuBinaria(int)
     * @see metodes1_6#mostrarMatriu(int[][])
     */
    public static void ejecutarTestMatriuBinaria() {
        int[][] matriu = metodes1_6.generarMatriuBinaria(4);
        System.out.println("Matriu binària generada:");
        metodes1_6.mostrarMatriu(matriu);
    }

    /**
     * Mostra el número 2823 en forma de text.
     *
     * @see metodes2_3#intToNom(int)
     */
    public static void mostrarNumeroEnLletres() {
        int numero = 2823;
        String nom = metodes2_3.intToNom(numero);
        System.out.println(nom);
    }

    /**
     * Dibuixa un arbre amb una base de 21 i una lletra inicial 'A'.
     *
     * @see Metodes3_1#arbre(int, String)
     */
    public static void dibujarArbre() {
        int num = 21;
        String letter = "A";
        Metodes3_1.arbre(num, letter);
    }

    /**
     * Mostra les preguntes més freqüents sobre els mètodes
     * disponibles.
     *
     * @see DissenyModular_2#faq()
     */
    public static void mostrarFaq() {
        String faqResult = DissenyModular_2.faq();
        System.out.println(faqResult);
    }
}
