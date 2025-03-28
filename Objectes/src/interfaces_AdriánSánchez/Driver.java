package interfaces_AdriánSánchez;

/**
 * Driver class that creates and manages a list of tables in a restaurant. It
 * calculates the total area, number of guests, and checks if the tables fit in
 * the dining room.
 */
public class Driver {
	public static void main(String[] args) {
        // Crear un array de taules de diferents tipus i mides
        TableCalculations[] tables = {
        	       	new RectangularTable("Vidre", true, 0, 5, 1),  // Taula rectangular regulable
        	        new RoundTable("Fusta", false, 0.75, 1.2),     // Taula rodona no regulable
        	        new RectangularTable("Metall", false, 0.8, 7.5, 1.5), // Taula rectangular no regulable
        	        new RoundTable("Vidre", false, 0.6, 1.5),      // Taula rodona no regulable
        	        new RectangularTable("Fusta", true, 178, 2913.8, 1),  // Taula rectangular regulable
        	        new RoundTable("Metall", false, 12.9, 1.8),      // Taula rodona no regulable
        };

  

        // Variables para calcular el área total y los comensales
        double areaTotal = 0;
        int guestTotals = 0;
        int numTables = tables.length;

        // Cálculo de área total y número total de comensales
        for (TableCalculations table : tables) {
            areaTotal += table.AreaCalc();
            guestTotals += table.guestCalc();
        }

        // Mostrar información sobre las taulas
        System.out.printf("El total d'àrea de les taules és: %.2f m2 \n", areaTotal);
        System.out.println("Hi caben " + guestTotals + " comensals.");
        System.out.println("Nombre de taules: " + numTables);

        // Verificar si les taules caben al menjador (25 m2 o menys)
        if (areaTotal <= 25) {
            System.out.println("Les taules caben bé al menjador.");
        } else {
            System.out.println("Les taules no caben al menjador.");
        }

        // Buscar la taula més gran (segons l'àrea)
        TableCalculations BigTable = tables[0];
        for (TableCalculations table : tables) {
            if (table.AreaCalc() > BigTable.AreaCalc()) {
                BigTable = table;
            }
        }

        // Mostrar el material de la taula més gran
        if (BigTable instanceof RectangularTable) {
            System.out.println("La taula més gran és de material: " + ((RectangularTable) BigTable).getMaterial());
        } else if (BigTable instanceof RoundTable) {
            System.out.println("La taula més gran és de material: " + ((RoundTable) BigTable).getMaterial());
        }
    }
}
