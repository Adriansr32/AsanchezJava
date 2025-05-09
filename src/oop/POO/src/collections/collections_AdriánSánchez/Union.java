package collections_AdriánSánchez;

import java.util.*;

/**
 * La classe {@code Union} demostra com realitzar la unió i la intersecció de dos conjunts (sets) d'enters
 * utilitzant la classe {@link HashSet}.
 * <p>
 * S'afegeixen valors a dos conjunts i després es calcula:
 * <ul>
 *   <li><b>Unió:</b> Tots els elements presents en qualsevol dels dos conjunts.</li>
 *   <li><b>Intersecció:</b> Només els elements comuns entre els dos conjunts.</li>
 * </ul>
 * </p>
 *
 * <p><b>Exemple de sortida:</b></p>
 * <pre>
 * Set 1: [1, 2, 3, 4]
 * Set 2: [3, 4, 5, 6]
 * Unio: [1, 2, 3, 4, 5, 6]
 * Intersecció: [3, 4]
 * </pre>
 * 
 * @author Adrián Sánchez
 */
public class Union {

    /**
     * Mètode principal que crea dos conjunts d'enters, calcula la seva unió i intersecció,
     * i imprimeix els resultats per consola.
     *
     * @param args Arguments de línia de comandes (no s'utilitzen).
     */
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Unio: " + union);
        System.out.println("Intersecció: " + intersection);
    }
}
