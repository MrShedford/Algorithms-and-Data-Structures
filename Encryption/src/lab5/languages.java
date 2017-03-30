package lab5;
import java.util.*;

public class languages {
	public static void main(String[] args)
	{
		 FileIO reader = new FileIO();
         Scanner scan = new Scanner(System.in);
         String[] english = reader.load("X:/2nd/CS211/Encryption/src/lab5/english_monograms.txt"); 
         String[] finnish = reader.load("X:/2nd/CS211/Encryption/src/lab5/finnish_monograms.txt");
         String[] swedish = reader.load("X:/2nd/CS211/Encryption/src/lab5/swedish_monograms.txt");
         
         double[] eng = English(english);
         //double[] dtc = finnish(finnish);
         //double[] swd = Swedish(swedish);
       
	}  
	
	public static double[] English (String[] inputs)//can be used for all the monograms with slight adjustments
	{
		double[] englishFreq = new double[256];
		int counter[] = new int[256];
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
		 
		Arrays.sort(englishFreq);
		return englishFreq;
}
	/*public static double[] finnish (String[] inputs)//can be used for all the monograms with slight adjustments
	{
		double[] finnishFreq = new double[256];
		int counter[] = new int[256];
		long fuckMe = 0;
		
		
		 for(int i =0; i<inputs.length;i++)//this goes into every single line of the monogram.txt for english
	     {
	    	if(inputs[i].length()>1)
	    	{
	    		counter[i] += Integer.parseInt(inputs[i].substring(2,inputs[i].length()-1));
	    		 fuckMe += (long)counter[i];
	    	}
	     }
		 for(int i=0;i<finnishFreq.length;i++)
		 {
			 
			 	finnishFreq[i] =(double) (long)counter[i] / fuckMe;
		 }
		 
		Arrays.sort(finnishFreq);
		return finnishFreq;
	}
	public static double[] Swedish (String[] inputs)//can be used for all the monograms with slight adjustments
	{
		double[] swedishFreq = new double[256];
		int counter[] = new int[256];
		long fuckMe = 0;
		
		
		 for(int i =0; i<inputs.length;i++)//this goes into every single line of the monogram.txt for english
	     {
	    	if(inputs[i].length()>1)
	    	{
	    		counter[i] += Integer.parseInt(inputs[i].substring(2,inputs[i].length()-1));
	    		 fuckMe += (long)counter[i];
	    	}
	     }
		 for(int i=0;i<swedishFreq.length;i++)
		 {
			 
			 	swedishFreq[i] =(double) (long)counter[i] / fuckMe;
		 }
		 
		Arrays.sort(swedishFreq);
		return swedishFreq;
	}*/

}
