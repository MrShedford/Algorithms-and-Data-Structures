/*
 * Read in a list of student names and their test scores and output the name of the student with the median score.
 * You can assume that the number of students will always be odd.
*/
import java.util.Scanner;
public class Lab6_MedianScore{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String arr1[] = new String[n]; //This array will hold the names
		int arr2[] = new int[n]; //This array will hold the scores

		for(int i = 0; i < n; i++){
			arr1[i] = sc.next();
			arr2[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){ //Insertion sort
			int record = i;
			for(int j = i; j < n; j++){
				if(arr2[j] < arr2[record])
					record = j; //Keep track of the smallest score
			}
			//Perform two identical swaps on the arrays
			int temp1 = arr2[i];
			arr2[i] = arr2[record];
			arr2[record] = temp1; //This will order the score

			String temp2 = arr1[i];
			arr1[i] = arr1[record];
			arr1[record] = temp2; //This will order the names
		}

		int middle = (arr1.length+1)/ 2; //Find the index for the middle
		System.out.println(arr1[middle-1]);
	}
}