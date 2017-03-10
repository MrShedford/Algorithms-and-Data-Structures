package lab5;
import java.util.*;


public class decoder {
	public static void main(String[] args)
	{
		 FileIO reader = new FileIO();
         Scanner scan = new Scanner(System.in);
         String[] inputs = reader.load("X:/2nd/CS211/Encryption/src/lab5/encrypted.txt"); 
         int[] inputValues = new int[inputs.length];
         
         for(int i =0; i <inputs.length;i++)//check to see if it loads in the dictionary properly 
         {
        	 System.out.println(inputs[i]);
         }
         
         scan.close();
	}
}
