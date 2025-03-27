package provaTest;
public class Magatzem {
    private Bebidas[][] estanteria;
    private int files;
    private int columnes;

    public Magatzem(int files, int columnes) {
        this.files = files;
        this.columnes = columnes;
        this.estanteria = new Bebidas[files][columnes];
    }
    
    
    // Añadir bebida en la primera posición libre
    public void afegirBeguda(Bebidas beguda) {
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = beguda;
                    System.out.println("Beguda afegida correctament a la posició " + (i+1) + (char)('A' + j));
                    return;
                }
            }
        }
        System.out.println("Alert: El magatzem està ple!");
    }

    // Calcular preu total de todas las bebidas
    public double calcularPreu() {
        double total = 0;
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (estanteria[i][j] != null) {
                    total += estanteria[i][j].getPreu();
                }
            }
        }
        return total;
    }

    // Mostrar información del magatzem
    public void mostrarInformacio() {
        int refrescosCount = 0, aiguesCount = 0;
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (estanteria[i][j] instanceof Refrescos) {
                    refrescosCount++;
                } else if (estanteria[i][j] instanceof Aigua) {
                    aiguesCount++;
                }
            }
        }
        System.out.println("Aquest magatzem conté:");
        System.out.println("- " + refrescosCount + " refrescos");
        System.out.println("- " + aiguesCount + " aigües minerals");
    }
}
