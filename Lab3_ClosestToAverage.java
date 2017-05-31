//Find the number in a list of numbers that is closest to the average of those numbers

import java.util.Scanner;

public class Lab3_ClosestToAverage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		double sum = 0;

		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double avg = sum / size; //Calculate the average

		double record = Math.abs(arr[0] - avg); //Set the record equal to the first distance from the average
		int index = 0;

		for(int i = 1; i < size; i++){
			double temp = Math.abs(arr[i] - avg);
			if(temp < record){ //Keep track of the closest distance from the average so far
				record = temp;
				index = i;
			}
		}
		System.out.println(arr[index]);
	}
}