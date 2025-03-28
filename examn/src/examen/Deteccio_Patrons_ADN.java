package examen;
import java.util.Scanner;
public class Deteccio_Patrons_ADN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
 
		 
		 System.out.println("Entrada: ");
		 String p = in.nextLine();
		 
		 System.out.println("Sortida: ");
		 
		 System.out.print("Segons aquesta sequencia d'ADN la persona te: sang ");
		 if(p.contains("ACCTGGATCAAA")) {
			 System.out.print("tipus 0, ");
		 }
		 else if(p.contains("ACCTGGATCAAT")) {
			 System.out.print("tipus A, ");
		 }
		 else if(p.contains("ACCTGGATCATT")) {
			 System.out.print("tipus B, ");
		 }
		 else if(p.contains("ACCTGGATCACT")) {
			 System.out.print("tipus AB, ");
		 }
		 if(p.contains("ACTGTGGA")) {
			 System.out.print("ulls blaus, ");
		 }
		 else if(p.contains("ACTGTGGC")) {
			 System.out.print("ulls marrons, ");
		 }
		 else if(p.contains("ACTGTGGT")) {
			 System.out.print("ulls verds, ");
		 }
		 if(p.contains("TGGCACCT")) {
			 System.out.print("cabells ros");
		 }
		 else if(p.contains("TGGCACCG")) {
			 System.out.print("cabells castany");
		 }
		 else if(p.contains("TGGCACAA")) {
			 System.out.print("cabells negre");
		 } 
		 else {
			 System.out.println("Entrada Incorrecte: L'entrada no es correpson a una sequencia d'ADN");
		 }
in.close();
	}

}
