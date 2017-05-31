public class BubbleSort{
	//Bubble sort method
	public static int[] bubble(int arr[]){ //ascending order

		for(int i = arr.length-1; i > 0; i--)
			for(int j = 0; j < i; j++){ //Will perform swaps up to the current maximum
				if(arr[j] > arr[j+1]){ //Performs the swap
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		return arr;
	}
	//Example
	public static void main(String args[]){
		int arr[] = {3,7,1,76,10,2};
		arr = bubble(arr); //Call the bubble sort method
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" "); // 1 2 3 7 10 76
	}
}