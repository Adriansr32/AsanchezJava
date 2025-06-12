package examen;

public class bienhechosabe {

	public static void main(String[] args) {
		
		String rawSentence, cipheredSentence;
		rawSentence = args[0];
		
		
		int ascii;
		cipheredSentence = "";
		for(int i=0; i<rawSentence.length(); i++) {
			ascii = rawSentence.charAt(i);
			if (ascii == ' ') {
				cipheredSentence += "AA";
			} else if (ascii >= 'A' & ascii <= 'Z') {
				cipheredSentence += (char)('A'+ascii/10);
				cipheredSentence += (char)('A'+ascii%10);				
			} else {
				System.out.println("La frase conte caràcters no permesos. Siusplau introdueix una frase que només contingui espais o lletres majúscules.");
				System.out.println(ascii);
				System.out.println((char)ascii);
				System.exit(1);
			}
		}
		
		System.out.println("La teva frase encriptada és: " + cipheredSentence);
	}
}
