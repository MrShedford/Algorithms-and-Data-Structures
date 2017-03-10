package lab5;
import java.util.*;

public class languages {
	public static void main(String[] args)
	{
		 FileIO reader = new FileIO();
         Scanner scan = new Scanner(System.in);
         String[] english = reader.load("X:/2nd/CS211/Encryption/src/lab5/english_monograms.txt"); 
         
         double[] eng = English(english);
         for(int i=0;i<eng.length;i++)
         {
        	 System.out.println(eng[i]);
         }
         
	}  
	
	public static double[] English (String[] inputs)//can be used for all the monograms with slight adjustments
	{
		double[] englishFreq = new double[50];
		int counter[] = new int[50];
		long fuckMe = 0;
		
		 for(int i =0; i<inputs.length;i++)//this goes into every single line of the monogram.txt for english
         {
        	if(inputs[i].length()>1)
        	{
        		counter[i] += Integer.parseInt(inputs[i].substring(2,inputs[i].length()-1));
        		 fuckMe += (long)counter[i];
        	}
         }
		 for(int i=0;i<englishFreq.length;i++)
		 {
			 
			 	englishFreq[i] =(double) (long)counter[i] / fuckMe;
		 }
		 
		 
		return englishFreq;
	}
}
