package metodes_4;

import java.util.*;

/**
 * Esta clase simula un torneo de fútbol con equipos aleatorios en los cuartos de final.
 * Los equipos se mezclan y se muestran los enfrentamientos en los cuartos de final utilizando un <code>StringBuilder</code>.
 * 
 * @author Tu Nombre
 * @version 1.0
 */
public class metodes4_1 {

    /**
     * El método principal que inicializa los equipos, los mezcla y muestra los enfrentamientos de los cuartos de final.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     * @see #shuffle(ArrayList)
     * @see #finals(ArrayList)
     */
    public static void main(String[] args) {
        ArrayList<String> teams = Teams0();
        System.out.println("-----------------------");
        System.out.println("Equips per els cuarts: ");
        System.out.println("-----------------------");
        System.out.println();
        
        shuffle(teams); // Mezcla los equipos antes de mostrar los enfrentamientos
        finals(teams);  // Muestra los enfrentamientos de los cuartos de final
    }

    /**
     * Muestra los enfrentamientos de los cuartos de final. Los equipos se dividen en dos grupos,
     * y se muestran en el formato "<equipo1> vs <equipo2>".
     * 
     * @param finals Lista de equipos que participan en los cuartos de final.
     * @see #shuffle(ArrayList)
     */
    public static void finals(ArrayList<String> finals) {
        StringBuilder sb = new StringBuilder();

        // Dividir los equipos en dos grupos
        ArrayList<String> team1 = new ArrayList<>(finals.subList(0, 4));
        ArrayList<String> team2 = new ArrayList<>(finals.subList(4, 8));

        System.out.println("---------------------------");
        System.out.println();

        // Crear los enfrentamientos en el StringBuilder
        for (int i = 0; i < team1.size(); i++) {
            sb.append(team1.get(i)).append(" vs ").append(team2.get(i)).append("\n");
        }

        // Imprimir los enfrentamientos
        System.out.println(sb.toString());
        System.out.println("---------------------------");
    }

    /**
     * Mezcla los equipos aleatoriamente usando <code>Collections.shuffle</code>.
     * 
     * @param teams Lista de equipos a mezclar.
     * @see Collections#shuffle(List)
     */
    public static void shuffle(ArrayList<String> teams) {
        Collections.shuffle(teams);
    }

    /**
     * Crea y devuelve una lista de equipos inicial para el torneo.
     * 
     * @return Una lista de equipos participantes.
     * @see ArrayList
     */
    public static ArrayList<String> Teams0() {
        ArrayList<String> teams = new ArrayList<>();

        // Añadir equipos a la lista
        teams.add("Real Madrid");
        teams.add("FC Barcelona");
        teams.add("Atlético de Madrid");
        teams.add("Liverpool FC");
        teams.add("Bayern Múnich");
        teams.add("Juventus");
        teams.add("Paris Saint-Germain");
        teams.add("Real Betis");

        return teams;
    }
}
