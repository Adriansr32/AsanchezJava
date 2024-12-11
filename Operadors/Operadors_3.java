package Operadors;
import java.util.Scanner;
public class Operadors_3 {
    public static void main(String[] args) {
 	Scanner in;
 	in = new Scanner(System.in);
	     

	System.out.print("Nombre de vals: ");
	int vals = in.nextInt();
        int xocolatines = vals / 10;
        vals = vals % 10;

        int xiclets = vals / 3;
        int sobrants = vals % 3;
	System.out.println("Xocolatines: " + xocolatines);
	System.out.println("Xiclets: " + xiclets);
	System.out.println("Sobren: " + sobrants);
<<<<<<< HEAD
=======
	in.close();
>>>>>>> a127d31bd2d72ee41bfa80f04367c5d67760a3ef
}
}
