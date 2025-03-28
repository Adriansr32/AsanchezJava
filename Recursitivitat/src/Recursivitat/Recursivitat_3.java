package Recursivitat;

public class Recursivitat_3 {

	public static boolean find(String str, String match) {
        if (str.length() < match.length()) {
            return false;
        }

        if (str.startsWith(match)) {
            return true;
        }

        return find(str.substring(1), match);
    }

    public static void main(String[] args) {
        System.out.println(find("recursivitat", "curs")); // true
        System.out.println(find("recursivitat", "ivi")); // true
        System.out.println(find("hello", "hello"));       // true
        System.out.println(find("hello", "o"));          // true
        System.out.println(find("hello", "world"));      // false
    }
}
