package methods4_AdrianSanchez;
import java.util.Scanner;

/**
 * This class contains methods to manage dates and verify their validity.
 * @author Adrián Sánchez
 * @version 1.0
 */
public class DateManager {

    /**
     * Main method that executes the program.
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        String nums = inputNums();

        int day = day(nums);
        int month = month(nums);
        int year = year(nums);
        
        if (isValidYear(year) && isValidMonth(month) && isValidDay(day, month, year)) {
            String weekDay = getWeekDay(day, month, year);
            System.out.println();
            System.out.println("Your date is: " + weekDay + " day " + day + " of " + getMonthName(month) + " of " + year);
        } 
        if (!isValidYear(year)) {
            System.err.println("Invalid year, year must be between 2021 - 2024!");
        }
        if (!isValidMonth(month)) {
            System.err.println("Invalid month, month must be between 1 - 12!");
        }
        if (!isValidDay(day, month, year)) {
            System.err.println("Invalid day, the year is NOT a leap year!");
        }
    }

    /**
     * Asks the user to input a date in dd/mm/yyyy format and verifies its validity.
     * @return A string representing a valid date in dd/mm/yyyy format.
     */
    public static String inputNums() {
        Scanner in = new Scanner(System.in);
        String date;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter a date in format dd/mm/yyyy (valid years: 2021-2024): ");
            date = in.nextLine();

            if (isCorrectFormat(date)) {
                int day = day(date);
                int month = month(date);
                int year = year(date);

                if (isValidYear(year) && isValidMonth(month) && isValidDay(day, month, year)) {
                    valid = true;
                    return date;
                } else {
                    System.err.println("Error: The date is incorrect.");
                }
            } else {
                System.err.println("Error: Incorrect format. Use dd/mm/yyyy.");
            }
        }
        return "";
    }

    /**
     * Verifies if a string has the correct date format (dd/mm/yyyy).
     * @param date The string to verify.
     * @return true if the format is correct, false otherwise.
     */
    public static boolean isCorrectFormat(String date) {
        String[] parts = date.split("/");
        if (parts.length != 3) return false;

        for (int i = 0; i < parts.length; i++) {
            if (!isNumber(parts[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifies if a string is a number.
     * @param str The string to verify.
     * @return true if the string is a number, false otherwise.
     */
    public static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Extracts the day from a date string in dd/mm/yyyy format.
     * @param nums The string containing the date.
     * @return The day as an integer.
     */
    public static int day(String nums) {
        return Integer.parseInt(nums.split("/")[0]);
    }

    /**
     * Returns the day passed as parameter.
     * @param day The day as an integer.
     * @return The same day as an integer.
     */
    public static int day(int day) {
        return day;
    }

    /**
     * Extracts the month from a date string in dd/mm/yyyy format.
     * @param nums The string containing the date.
     * @return The month as an integer.
     */
    public static int month(String nums) {
        return Integer.parseInt(nums.split("/")[1]);
    }

    /**
     * Returns the month passed as parameter.
     * @param month The month as an integer.
     * @return The same month as an integer.
     */
    public static int month(int month) {
        return month;
    }

    /**
     * Extracts the year from a date string in dd/mm/yyyy format.
     * @param nums The string containing the date.
     * @return The year as an integer.
     */
    public static int year(String nums) {
        return Integer.parseInt(nums.split("/")[2]);
    }

    /**
     * Returns the year passed as parameter.
     * @param year The year as an integer.
     * @return The same year as an integer.
     */
    public static int year(int year) {
        return year;
    }

    /**
     * Verifies if a day is valid for a given month and year.
     * @param day The day to verify.
     * @param month The month to verify.
     * @param year The year to verify.
     * @return true if the day is valid, false otherwise.
     */
    public static boolean isValidDay(int day, int month, int year) {
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysPerMonth[1] = 29;
        }
        return day >= 1 && day <= daysPerMonth[month - 1];
    }

    /**
     * Verifies if a month is valid.
     * @param month The month to verify.
     * @return true if the month is valid, false otherwise.
     */
    public static boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    /**
     * Verifies if a year is valid.
     * @param year The year to verify.
     * @return true if the year is valid, false otherwise.
     */
    public static boolean isValidYear(int year) {
        return year >= 2021 && year <= 2024;
    }

    /**
     * Calculates the day of the week for a given date.
     * @param day The day of the date.
     * @param month The month of the date.
     * @param year The year of the date.
     * @return The name of the day of the week.
     */
    public static String getWeekDay(int day, int month, int year) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int K = year % 100;
        int J = year / 100;
        int h = (day + (13 * (month + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        String[] weekDays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return weekDays[h];
    }

    /**
     * Returns the name of the month corresponding to a given month number.
     * @param month The month number.
     * @return The name of the month.
     */
    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }
}