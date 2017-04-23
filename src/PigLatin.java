
import java.util.Scanner;
public class PigLatin {
	// Strings of consonants and vowels
	static String consonants = "BCDFGHJKLMNPQRSTVWXZbcdefghjklmnpqrstvwxz";
	static String vowels = "AEIOUaeiou";
	static String pigLatin = "";
	//Rearranges the word and returns it in Pig Latin
	public static String Swap(String English){
		String firstStr = English.substring(0, 1);
		String end = English.substring(1);
		if(consonants.contains(firstStr)){
			pigLatin = end + firstStr + "ay";
			return capitalize(pigLatin);
		}
		else{
			pigLatin = English + "way";
			return capitalize(pigLatin);
		}
	}
	//Capitalizes the first letter of the word.
	public static String capitalize(String input){
		String firstLetter = input.substring(0, 1);
		String restOfWord = input.substring(1);
		firstLetter = firstLetter.toUpperCase();
		return firstLetter + restOfWord;
		
	}
	public static void main(String[]args){
		Scanner console = new Scanner(System.in);
		//Prompts user for a word
		System.out.println("What is your word?");
		String English = console.nextLine();
		English = English.toLowerCase();
		// Splits the input line into words and puts those in an array
		String[] arr = English.split(" ");
		String fin = "";
		//Goes through all elements of the array and puts them in pig latin
		for(int i = 0; i < arr.length; i++){
			fin += Swap(arr[i]) + " ";
		}
		System.out.println( "Your new sentance is:\n" + fin);
	}
}
