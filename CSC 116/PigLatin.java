import java.util.*;

public class PigLatin {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a word:  ");
		String word = console.next();
		String pigLatinWord = pigLatinWord(word);		
		System.out.println(pigLatinWord);
	}



	public static String pigLatinWord(String word) {
		return word.substring(1,word.length()) + "-" + word.charAt(0) + "ay";
	}


}