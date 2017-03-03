package phil;

import java.util.*;

public class Scrabble{
    public static void main(String args[]){
    	 FileIO reader = new FileIO();
         Scanner scan = new Scanner(System.in);
    	
    	 System.out.println("Enter your letters:");
         String letters = scan.nextLine();
         char[] charArray = letters.toCharArray();//puts the letters into a char array
         
         
         
         
         String[] inputs = reader.load("X:/2nd/CS211/Lab4_Scrabble/src/phil/dictionary.txt");    //Reading the File as a String array
         int[] inputValues = new int[inputs.length];//this array will store the points of every work in the dictionary
         String[] longestWords = new String[100000];
         
        
         //goes through and finds all matches with the word        
         for(int i = 0; i < charArray.length;i++)//this goes through each character
         {
        	 int charCounter = 0;
        	 for(int j =0; j<inputs.length;j++)
        	 {
        		 for(int k =0; k<inputs[j].length();k++)
        		 {
        			 if(charArray[i] == inputs[j].charAt(k))
        				 charCounter++;
        		 }
        		 inputValues[j] = charCounter;
        		 
        	 }
         }
        
        
       
        
        
        
        
        try{
            reader.save("X:/2nd/CS211/Lab4_Scrabble/src/phil/dictionary.txt",inputs);
        }catch (Exception e){
            System.out.println(e.getClass());
        }
        
       scan.close();
        
       
        
    }
 
}