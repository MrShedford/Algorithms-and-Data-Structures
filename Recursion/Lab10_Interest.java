// Given an interest rate and a bank balance calculate how much will be in the account after a given number of years
import java.util.Scanner;
public class Lab10_Interest{
	public static void main(String args[]){
		Scanner myscanner = new Scanner(System.in);
 		int y = myscanner.nextInt();
 		double i = myscanner.nextDouble();
 		double x = myscanner.nextDouble();
 		System.out.println(String.format( "%.2f", compound(y,i,x)));
	}

	//This method is equivalent to balance * Math.pow(factor, years)
	public static double compound(int years, double interest, double balance){
		if(years==0) //base case
			return balance;

		double factor = (interest/100) + 1; //Balance * factor = balance with interest added

		double three = balance;
		double two = interest;
		int one = years-1;

		return(factor * compound(one, two, three));
	}
}