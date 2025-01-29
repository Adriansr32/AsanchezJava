package metodes_1;

public class metodes1_5 {
	
    public static String caractersCentrals(String str) {
        int length = str.length();
        
        if (length % 2 == 1) {
            return String.valueOf(str.charAt(length / 2));
        } else {
            return str.substring(length / 2 - 1, length / 2 + 1);
        }
    }

    public static void main(String[] args) {
        String[] testStrings = {"hello", "java", "abcde", "abcdef"};

        for (String str : testStrings) {
            System.out.println("Cadena: \"" + str + "\"");
            System.out.println("Caràcters centrals: \"" + caractersCentrals(str) + "\"");
            System.out.println("------------------------");
        }
    }
}

