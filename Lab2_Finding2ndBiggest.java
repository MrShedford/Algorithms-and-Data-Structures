/*
 * Find the second biggest number in the list of numbers given.
 * Each number is unique.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Lab2_Finding2ndBiggest{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //Take in the size of the array

		int arr[] = new int[n];

		for(int i = 0; i < n; i++) //Populate the array
			arr[i] = sc.nextInt();

		Arrays.sort(arr); //Sort the array in ascending order

		System.out.println(arr[n-2]); //Print the second last element in the array
	}
}