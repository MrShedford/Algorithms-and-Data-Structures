public class SelectionSort{
	//Selectoin sort method
	public static int[] selection(int[] arr){ //ascending order

		for(int i = 0; i < arr.length; i++){
			int record = i;
			for(int j = i; j < arr.length; j++) //Iterate from the current element to the end of the array
				if(arr[j] < arr[record])
					record = j; //Keep a track of the smallest number found so far
			//Swap the current element with the smallest number found
			int temp = arr[i];
			arr[i] = arr[record];
			arr[record] = temp;
		}
		return arr;
	}
	//Example
	public static void main(String args[]){
		int arr[] = {3, 1, 56, 7, 21, 2};
		arr = selection(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" "); // 1 2 3 7 21 56
	}
}