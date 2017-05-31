import java.util.Scanner;
public class BinarySearchIterative{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1, 3, 5, 6, 10, 23};
		int key = sc.nextInt();

		System.out.println(search(arr, key));
	}

	public static boolean search(int[] arr, int key){
		int lower = 0, upper = arr.length -1;
		int middle = (lower + upper) / 2;

		while(lower <= upper){
			middle = (lower + upper) / 2;

			if(arr[middle] == key)
				return true;

			else if(key < arr[middle]) //Disregard the upper half
				upper = middle-1;

			else //Disregard the lower half
				lower = middle+1;

		}
		return false;
	}
}