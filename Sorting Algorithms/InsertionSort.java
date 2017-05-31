public class InsertionSort{
	//Insertion sort method
	public static int[] insertion(int[] arr){ //ascending order

		for(int i = 1; i < arr.length; i++){
			int record = i;
			int temp = arr[i]; //Back up the current element
			for(int j = i; j > 0; j--) //Work back from the current element
				if(arr[j-1] >= temp){
					record = j-1; //Keep track of the best position found so far to place current element
					arr[j] = arr[j-1]; //Shift elements up to make room for insertion
				}
			arr[record] = temp; //Place the current element in the best position found
		}
		return arr;
	}
	//Example
	public static void main(String args[]){
		int arr[] = {3, 1, 56, 7, 21, 2};
		arr = insertion(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" "); // 1 2 3 7 21 56
	}
}