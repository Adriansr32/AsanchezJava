package metodos2;

public class Sentences {
	public static int countWords(String sentence, String word) {
		if(word.length() == 0 ) {
			return 0;
		}
		int count = 0;
		int index = sentence.indexOf(word);
		while(index!=-1) {
			System.out.println("Found " + index+word.length());
			count++;
			sentence = sentence.substring(index+word.length());
			index = sentence.indexOf(word);
		}
		
		return count;
	}
	
	public static String reverse(String sentence) {
		StringBuilder rs = new StringBuilder();
		rs.append(sentence);
		rs.reverse();
		return rs.toString();
	}
}
