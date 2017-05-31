//This version of merge sort does the merge and recursion in one method
public class MergeSortV2{

	//Merge sort method
	public static void sort(int[] arr, int[] workspace, int lower, int upper){ //Ascending order
		int mid = (upper + lower) / 2;

		if(upper == lower) // base case
			return;

		//Will keep splitting what we're working on in two halves until it reaches the base case
		sort(arr, workspace, lower, mid); //Lower half
		sort(arr, workspace, mid+1, upper); //Upper half

		for(int i = lower; i <= upper; i++)
			workspace[i] = arr[i]; //Put the segment we're currently looking at, in the workspace

		//First = current element of 1st half.   Second = current element of 2nd half.
		int first = lower, second = mid+1;

		for(int i = lower; i <= upper; i++){
			if(first > mid) //If we have added everything from the first half in to the array
				arr[i] = workspace[second++]; //Put what's left in the second half, in to the array

			else if(second > upper) //If we have added everything from the second half in to the array
				arr[i] = workspace[first++]; //Put what's left in the first half, in to the array

			else if(workspace[first] < workspace[second])
				arr[i] = workspace[first++]; //Place first in to the array if it is smaller. Increment first

			else
				arr[i] = workspace[second++]; //Place second in to the array if it is smaller. Increment second
		}
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