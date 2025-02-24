package metodes3_AdrianSanchez;

import java.util.*;

/**
 * Class for handling a list of integers, separating positive and negative numbers,
 * sorting, and displaying them in different formats.
 * 
 * @author Adrian Sanchez
 * @version 1.0
 * @since 2025-01-22
 */
public class Metodes3_2 {
    static ArrayList<Integer> nums = new ArrayList<>();
    static ArrayList<Integer> numsPositive = new ArrayList<>();
    static ArrayList<Integer> numsNegative = new ArrayList<>();

    /**
     * Main method that controls the program flow: reads numbers, processes them,
     * and displays results.
     *
     * @param args Command-line arguments, not used.
     * @since 2025-01-22
     */
    public static void main(String[] args) {
        ReadingNums();
        PrintNums("Has entrat els següents números:");
        SortAndDisplay();
        SeparateNums();
        PrintNumsPositives();
        PrintNumsNegatives();
    }

    /**
     * Reads integers from the user, adding them to a list if they are between -10 and 10.
     * Stops when the user inputs 0.
     */
    public static void ReadingNums() {
        Scanner in = new Scanner(System.in);
        boolean zero = false;
        int num = 0;
        while (!zero) {
            System.out.print("Introduce un número: ");
            num = in.nextInt();

            if (num == 0) {
                zero = true;
            } else if (num >= -10 && num <= 10) {
                nums.add(num);
            } else {
                System.err.println("[Error!] - Introdueix un número entre el -10 i el 10!");
            }
        }
        in.close();
    }

    /**
     * Prints the contents of the list {@code nums} with a custom message.
     *
     * @param mensaje The message to display before printing the numbers.
     */
    public static void PrintNums(String mensaje) {
        System.out.print(mensaje + " [");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
            if (i < nums.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Sorts the list {@code nums} in ascending order and displays the sorted numbers.
     */
    public static void SortAndDisplay() {
        Collections.sort(nums);
        PrintNums("Si els ordenem quedaran així:");
    }

    /**
     * Separates numbers from the {@code nums} list into positive and negative lists.
     */
    public static void SeparateNums() {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                numsPositive.add(nums.get(i));
            } else if (nums.get(i) < 0) {
                numsNegative.add(nums.get(i));
            }
        }
    }

    /**
     * Prints the positive numbers from the {@code numsPositive} list 
     * and their corresponding representation as asterisks.
     */
    public static void PrintNumsPositives() {
        System.out.print("Els números positius són: [");
        for (int i = 0; i < numsPositive.size(); i++) {
            System.out.print(numsPositive.get(i));
            if (i < numsPositive.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        PrintSPositives();
    }

    /**
     * Displays each positive number from {@code numsPositive} followed by 
     * a line of asterisks corresponding to its value.
     */
    public static void PrintSPositives() {
        for (int i = 0; i < numsPositive.size(); i++) {
            System.out.print(numsPositive.get(i) + ":");
            for (int j = 0; j < numsPositive.get(i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints the negative numbers from the {@code numsNegative} list 
     * (sorted in descending order) and their corresponding representation as asterisks.
     */
    public static void PrintNumsNegatives() {
        numsNegative.sort(Collections.reverseOrder());
        System.out.print("Els números negatius són: [");
        for (int i = 0; i < numsNegative.size(); i++) {
            System.out.print(numsNegative.get(i));
            if (i < numsNegative.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        PrintSNegatives();
    }

    /**
     * Displays each negative number from {@code numsNegative} followed by 
     * a line of asterisks corresponding to its absolute value.
     */
    public static void PrintSNegatives() {
        for (int i = 0; i < numsNegative.size(); i++) {
            System.out.print(numsNegative.get(i) + ":");
            for (int j = 0; j < Math.abs(numsNegative.get(i)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
