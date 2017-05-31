/*
 * Of three numbers find the number furthest away from the other two.
 * This is Phil's solution.
*/
import java.util.*;
public class Lab2_FindOutlier {
	public static void main(String args[] ) throws Exception {
		Scanner myscanner = new Scanner(System.in);

		int one=myscanner.nextInt();
		int two=myscanner.nextInt();
		int three=myscanner.nextInt();

		int min = Math.min(Math.min(one,two),three);
		int max = Math.max(Math.max(one,two),three);
		int middle = one+two+three-min-max;

		if(Math.abs(min-middle)==Math.abs(max-middle)) //All the points are the same distance from each other so no outlier
			System.out.println("NA");

		else if(Math.abs(min-middle)>Math.abs(max-middle)) //If the min is further away from the middle than the max the min is the outlier
			System.out.println(min);

		else //If the max is further away from the middle than the min the max is the outlier
		System.out.println(max);
	}
}