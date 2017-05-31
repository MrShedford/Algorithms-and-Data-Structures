//This version of merge sort does the merge and recursion in two seperate methods
public class MergeSortV1{

	//This is the recursive method
	public static void sort(int[] arr, int[] workspace, int lower, int upper){ //Ascending order
		if(lower == upper) //Base case
			return;
		else{
			int mid = (lower + upper) / 2;

			//Will keep splitting what we're working on in two halves until it reaches the base case
			sort(arr, workspace, lower, mid); //First half
			sort(arr, workspace, mid+1, upper); //Second half

			merge(arr, workspace, lower, upper); //Merge the two halves we're working on
		}
	}

	//This is the method that performs the merge
	public static void merge(int [] arr, int[] workspace, int lower, int upper){
		int j = 0; //Index of the workspace
		int mid = (upper + lower) / 2;

		//First = current element of 1st half.   Second = current element of 2nd half.
		int first = lower, second = mid+1;

		int n = upper - lower+1; //number of elements

		while(first <= mid && second <= upper){
			if(arr[first] < arr[second])
				workspace[j++] = arr[first++]; //Place first in to the array if it is smaller. Increment first

			else
				workspace[j++] = arr[second++]; //Place second in to the array if it is smaller. Increment second
		}

		while(first <= mid) //If we have added everything from the second half in to the workspace
			workspace[j++] = arr[first++]; //Put what's left in the first half, in to the workspace

		while(second <= upper) //If we have added everything from the first half in to the workspace
			workspace[j++] = arr[second++]; //Put what's left in the second half, in to the workspace

		for(j = 0; j < n; j++)
			arr[lower+j] = workspace[j]; //Copy what's in the workspace, in to our original array
	}

	//Example
	public static void main(String args[]){
		int arr[] = {3, 1, 56, 7, 21, 2};
		int workspace[] = new int[arr.length];
		sort(arr, workspace, 0, arr.length-1);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" "); // 1 2 3 7 21 56
	}
}