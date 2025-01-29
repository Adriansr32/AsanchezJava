package metodes_1;

public class metodes1_3 {

	public static void main(String[] args) {
		test();
	}
		public static boolean totsIguals(double x, double y, double z) {
			return (x == y && x == z);
		}
		public static boolean totsDiferents(double x, double y, double z) {
			return (x != y && x != z && y != z);
			
		}
		public static boolean estanOrdenats(double x, double y, double z) {
			return (x <= y && y <= z);
		}
		
		public static void test() {
			double x, y, z;
			x = 3.2;
			y = 3.2;
			z = 3.1;
			cI(x, y, z, false);
			cD(x, y, z, false);
			cO(x, y, z, false);
			x = 2.2;
			y = 3.2;
			z = 4.2;
			cI(x, y, z, false);
			cD(x, y, z, true);
			cO(x, y, z, true);

		}
		
		public static void cI(double x, double y, double z, boolean r) {
			System.out.printf("totsIgual(%.1f, %.1f, %.1f) -> %b ", x, y, z, r);
			if (r == totsIguals(x, y, z))
		         System.out.println("Test OK");
		    else
		         System.out.println("Test KO!!!");
		}
		public static void cD(double x, double y, double z, boolean r) {
			System.out.printf("totsDiferents(%.1f, %.1f, %.1f) -> %b ", x, y, z, r); 
			if (r == totsDiferents(x, y, z))
		         System.out.println("Test OK");
		    else
		         System.out.println("Test KO!!!");
			}
		public static void cO(double x, double y, double z, boolean r) {
			System.out.printf("estanOrdenats(%.1f, %.1f, %.1f) -> %b ", x, y, z, r);   
			if (r == estanOrdenats(x, y, z))
		         System.out.println("Test OK");
		    else
		         System.out.println("Test KO!!!");
			}
		
	}


