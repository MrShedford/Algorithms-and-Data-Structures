//Return the Nth digit after the decimal point resulting from the division of a given numerator and divisor
import java.util.Scanner;
public class Lab10_DecimalExpansion{
	public static void main(String args[]){
		Scanner myscanner = new Scanner(System.in);
	 	int numerator = myscanner.nextInt();
	 	int divisor = myscanner.nextInt();
	 	int n = myscanner.nextInt();
	 	System.out.println(decimal2(numerator,divisor,n));
	}

	public static int decimal(int numerator, int divisor, int n){
		if(n == 0)
			return(numerator - (numerator % divisor)) / divisor; //Will return how many times the divisor goes in to the numerator

		return(decimal((numerator % divisor)*10, divisor, n-1)); //Will make the numerator smaller each time
	}

	//An alternatve, non-recursive way to answer the question
	public static int decimal2(int numerator, int divisor, int n){ //eg. 1000, 13, 2

		double result = (double)numerator/(double)divisor; // 76.9230...
		double decimal = (result * Math.pow(10, n)) % 10; // 7692.30... % 10 = 2.30...

		return (int)decimal; // 2
	}
}