package metodes;

public class METODESYATUSABE {	
    public static void main(String[] args) {
        testMin();
    }

    public static int min(int a, int b) {
        int retorn;
        if (a < b) {
            retorn = a;
        } else {
            retorn = b;
        }
        return retorn;
    }

    public static void testMin() {
        int a = 5;
        int b = 3;
        int resultatEsperat = 3;

        System.out.printf("min(%d, %d) -> %d  ", a, b, resultatEsperat);
        if (resultatEsperat != min(a, b))
            System.out.println("Test KO!!!");
        else
            System.out.println("Test OK");
    }
}
