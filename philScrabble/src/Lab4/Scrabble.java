
package Lab4;
import java.util.*;
class Scrabble {

  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the letters you have: ");
    String letters = scan.next().toLowerCase(); // Chnage to lowercase to match exact words.

    FileIO reader = new FileIO();
    String[] dictionary = reader.load("X:/philScrabble/src/Lab4/dictionary.txt"); // Reading the File as a String array.

    public static int findLength(String letters, String[] array){
        ArrayList<String> possibleWords = new ArrayList<String>();
        int longestPossibleWord = 1;
             // Loop through each word in dictionary and check if that word can be formed with our letters.
        for(int i = 0; i < array.length; i++) {
          String word = array[i];
          if(canFormWord(letters, word)) { // If we can form this word with our letters.
            if(word.length() >= longestPossibleWord) { // If longer than the longest possible word we have so far, add it to the list.
              longestPossibleWord = word.length();
              possibleWords.add(word);
            }
          }
        }
        return longestPossibleWord;

            
        }
      public static boolean canFormWord(String letters, String word) {

        // Foreach char check if that letter exists, if it does remove from letter string as we have used them.
        for(char c : word.toCharArray()) {
          int charIndex = letters.indexOf(c);
          if(charIndex == -1) return false; // If not found, the word can't be formed.
          letters = letters.substring(0, charIndex) + letters.substring(charIndex + 1);
        }

        return true; // Making this word is possible with the set of letters we have.
      }
  }
