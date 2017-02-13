package L1;

import java.util.Scanner;


public class huffmanEncoding {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int[] ASCIIarray = new int[256];//used to store the ascii values


        System.out.println("Please enter your sentence:");
        String sentence = sc.nextLine();//user inputs sentence to be convertted

        for(int i =0; i <sentence.length();i++)//this goes through the sentence
        {
            String temp = Integer.toBinaryString((int)sentence.charAt(i));

            for(int j =0; j<256;j++)//this will run through the ascii value of the char in the array
            {
                if((int)sentence.charAt(i) == j)//finds the ASCII value
                {
                    ASCIIarray[j]++;//increments the ASCII Value Counter, which becomes the frequency of thr word in the end result
                }
            }

            while(temp.length()!=7)//create full 7 digit binary code (leading 0s)
            {
                temp = "0" + temp;
            }
            if(i%8 ==0)
            {
                System.out.println();
            }
            System.out.print(temp + " ");
        }
        System.out.println();


        for(int k = 0; k < 256; k++)//goes through ASCII values
        {
            if(ASCIIarray[k] != 0)//will not go into non occurring values
            {
                if(ASCIIarray[k] != 1)//grammar print for 1 occurrence
                {
                    System.out.println("'" + (char)k + "'" + " appeared " + ASCIIarray[k] + " times");
                }

                else//every other occurrence is here
                {
                    System.out.println("'" + (char)k + "'" + " appeared " + ASCIIarray[k] + " time");
                }
            }
        }





    }
}
