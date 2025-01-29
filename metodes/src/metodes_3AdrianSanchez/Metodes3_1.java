package metodes_3AdrianSanchez;
import java.util.*;

/**
 * Generates a Christmas tree using a user-specified letter.
 * The tree height is an odd number between 5 and 29.
 * 
 * @author Adrian Sanchez
 * @version 1.0
 * @since 2025-01-22
 */
public class Metodes3_1 {

    /**
     * Main method that prompts the user for an odd number and a letter,
     * then calls {@link #arbre(int, String)} to print the tree.
     *
     * @param args Command-line arguments, not used.
     * @since 2025-01-22
     */
    public static void main(String[] args) {
    	readingNums();
    }
    public static void readingNums() {
    	 Scanner in = new Scanner(System.in);

         boolean correctN = false;
         int num = 0;
         // Input loop for an odd number between 5 and 29
         while (!correctN) {
             System.out.print("Enter an odd number [5 - 29]: ");
             num = in.nextInt();
             if (num >= 5 && num <= 29 && num % 2 != 0) {  
                 correctN = true;
             } else {
                 System.err.println("Invalid input");
             }
         }
         in.nextLine();  // Clear the buffer

         boolean correctL = false;
         String letter = "";
         // Input loop for a single letter
         while (!correctL) {
             System.out.print("Enter a letter for the tree: ");
             letter = in.nextLine().trim();
             if (letter.length() == 1 && Character.isLetter(letter.charAt(0))) {
                 correctL = true;
             } else {
                 System.err.println("Enter a single letter");
             }
         }

         arbre(num, letter);
         in.close();
     }

     /**
      * Prints a tree using the specified letter.
      * The tree's height is determined by the 'num' parameter.
      *
      * @param num Tree height, must be an odd number between 5 and 29.
      * @param letter Letter used to form the tree.
      * @return Nothing, the tree is printed to the console.
      * @since 2025-01-22
      */
           public static void arbre(int num, String letter) {
        // Loop to print the tree layers
        for (int i = 1; i <= num; i += 2) {
            // Print the letter with spaces
            System.out.printf("%" + ((4 + num - i) / 2 + i) + "s%n", letter.toUpperCase().repeat(i));
        }
        // Print the trunk with spaces
        System.out.printf("%" + ((4 + num + 1) / 2) + "s%n", "l");
    }
}
