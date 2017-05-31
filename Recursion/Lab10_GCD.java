//Find the greatest common divisor of two numbers using Euclid's algorithm
//Explanation of Euclid's Algorithm: https://www.youtube.com/watch?v=AJn843kplDw
import java.util.Scanner;
public class Lab10_GCD{
	public static void main(String args[] ){
		Scanner myscanner = new Scanner(System.in);
	 	long x = myscanner.nextLong();
	 	long y = myscanner.nextLong();
	 	System.out.println(GCD(x,y));
 	}

 	public static long GCD(long x, long y){
		//If x is zero then whatever y is, is the last non-zero number that divided in to both numbers equally
		if(x==0)
	 		return y;

		//Same princinple as above
	 	if(y==0)
	 		return x;

	 	long one=y;
	 	long two=x%y; //The remained will get smaller each time and will eventually be 0

	 	return(GCD(one,two));
	 }
}