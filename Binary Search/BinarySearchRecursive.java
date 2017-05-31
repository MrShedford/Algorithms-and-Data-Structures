import java.util.Scanner;
public class BinarySearchRecursive{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = {1, 3, 5, 6, 10, 23};
		System.out.println(find(n, arr));
	}
	public static boolean find(int key, int[] arr){
			return search(key, 0 , arr.length-1, arr);
	}

	public static boolean search(int key, int lower, int upper, int[] arr){
		int middle = (lower + upper)/2;

		if(arr[middle] == key)
			return true;

		else if(upper < lower)
			return false;

		else if(key < arr[middle]) //Disregard the upper half
			return search(key, lower, middle-1, arr);

		else //Disregard the lower half
			return search(key, middle+1, upper, arr);
	}
}