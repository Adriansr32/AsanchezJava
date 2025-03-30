package metodes1_AdrianSanchez;

public class metodes1_4 {
    public static int primerDigit(int n) {
        n = Math.abs(n); 
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    public static int ultimDigit(int n) {
        return Math.abs(n % 10); 
    }

    public static int contaDigits(int n) {
        n = Math.abs(n); 
        int count = 0;
        do {
            count++;
            n /= 10;
        } while (n > 0);
        return count;
    }

    public static void main(String[] args) {
        int[] testNumbers = {12345, -9876, 0, 7, -100};

        for (int num : testNumbers) {
            System.out.println("Nombre: " + num);
            System.out.println("Primer dígit: " + primerDigit(num));
            System.out.println("Últim dígit: " + ultimDigit(num));
            System.out.println("Nombre de dígits: " + contaDigits(num));
            System.out.println("------------------------");
        }
    }
}
