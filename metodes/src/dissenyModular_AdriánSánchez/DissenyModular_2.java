/**
 * La classe DissenyModular_2 proporciona funcionalitats
 * relacionades amb les preguntes més freqüents (FAQ) sobre
 * l'ús de classes i paquets en Java. Aquesta classe permet
 * obtenir respostes a preguntes comunes de manera aleatòria.
 * 
 * @author AdrianSanchez
 * @version 1.0
 * @since 2025-02-05
 */
package dissenyModular_AdriánSánchez;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe que gestiona les preguntes freqüents sobre
 * l'ús de classes i paquets en Java.
 */
class DissenyModular_2 {

    /**
     * Retorna un text amb tres preguntes freqüents seleccionades
     * aleatòriament juntament amb les seves respostes.
     *
     * @return Un String que conté tres preguntes i les seves
     *         respectives respostes.
     * @throws IllegalArgumentException Si no es poden seleccionar
     *         preguntes (per exemple, si la llista està buida).
     * @see ArrayList
     */
    static String faq() {
        ArrayList<String> preguntes = new ArrayList<>();
        preguntes.add("Si creo una classe i no la poso en cap paquet en quin paquet estarà?");
        preguntes.add("Si tinc una classe en el default package la podrem veure des de un altre paquet ? Perquè?");
        preguntes.add("Si tinc una classe sense cap qualificador public des d'on serà accessible?");
        preguntes.add("Si tinc una classe amb el qualificador private en comptes de public des d'on serà accessible?");
        preguntes.add("Si tinc una classe amb el qualificador package en comptes de public des d'on serà accessible?");
        preguntes.add("Quin missatge d'error mostra l'eclipse quan intentes accedir a una classe sense qualificador d'un altre paquet?");

        ArrayList<String> respostes = new ArrayList<>();
        respostes.add("Estarà en el paquet per defecte (default package).");
        respostes.add("No, només es podrà veure dins del mateix paquet.");
        respostes.add("Només serà accessible dins del mateix paquet.");
        respostes.add("Només serà accessible dins de la classe on està definida.");
        respostes.add("Només serà accessible dins del mateix paquet.");
        respostes.add("L'error serà 'The type X is not public, so it cannot be referenced from another package'.");

        Random random = new Random();
        
        String faqText = "";
        ArrayList<Integer> seleccionados = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            int index;
            do {
                index = random.nextInt(preguntes.size());  
            } while (seleccionados.contains(index));  
            
            seleccionados.add(index);

            faqText += preguntes.get(index) + "\n";
            faqText += "Resposta: " + respostes.get(index) + "\n\n";
        }

        return faqText;
    }
}
