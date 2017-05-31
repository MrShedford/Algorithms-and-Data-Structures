//Sort a list of words in order of their size, if words are the same size, order them in alphabetical order.

import java.util.Scanner;
public class Lab6_SortWords{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); sc.nextLine();
		String arr[] = new String[n];

		for(int i = 0; i < n; i++)
			arr[i] = sc.nextLine();

		for(int i = 0; i < n; i++){ //Insertion sort
			int record = i;
			for(int j = i; j < n; j++){
				if(arr[j].length() < arr[record].length())
					record = j; //Keep track of the smallest word we find
			}
			String temp = arr[i];
			arr[i] = arr[record];
			arr[record] = temp; //Performing the swap

			if(i>0 && arr[i].length() == arr[i-1].length()){ //If two words are the same length, put them in alphabetical order
				if(arr[i].compareTo(arr[i-1]) < 0){
					String x = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = x;
				}
			}
		}
		for(int i = 0; i < n; i++)
			System.out.print(arr[i]+" ");
	}
}