//Check if a given word is a palindrome
import java.util.Scanner;
public class Lab10_Palindrome{
	public static void main(String args[]){
		Scanner myscanner = new Scanner(System.in);
 		String mystring = myscanner.nextLine();
 		System.out.println(check(mystring));
	}
	public static String check(String myString){
		if(myString.charAt(0) != myString.charAt(myString.length()-1)) //check if first and last letters are the same
			return "FALSE";

		else if(myString.length() <= 2) //Base case
			return "TRUE";

		String substring = myString.substring(1, myString.length()-1);

		return check(substring); //Remove the first and last letters and check this new string
	}
}