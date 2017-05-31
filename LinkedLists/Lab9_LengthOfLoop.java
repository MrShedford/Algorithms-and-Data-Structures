/*
 * Find the length of the loop in the linked list
 * CONSTRAINTS: 0 <= Number of links <= 100
*/
import java.util.*;
public class Lab9_LengthOfLoop {
	public static void main(String args[] ) throws Exception {
		Scanner myscanner = new Scanner(System.in);
 		int num = Integer.parseInt(myscanner.nextLine());
 		Link[] array = new Link[num];

 		for(int i=0;i<num;i++)
 			array[i]=new Link(myscanner.nextLine());

 		while(myscanner.hasNext()){
 			int select=myscanner.nextInt();
 			if(select == -1) //Need a stoppping condition when using hasNext() with standard input
 				break;
 			int next=myscanner.nextInt();
 			if(next!=-1)
 				array[select].next=array[next];
 		}
 		LinkedList mylist = new LinkedList();
 		if(num>0)
 			mylist.first=array[0];

 		System.out.println(findLoopLength(mylist));
	}

	//This is the method we had to write
 	public static int findLoopLength(LinkedList myList){
        if(myList.isEmpty())
            return 0; //Return 0 if the list is empty

        Link current = myList.first; //Make current equal to the first element in the list
        int count = 0;
        Link arr[] = new Link[100]; //It says in the constraints the the list will never be bigger than 100

        while(current.next != null){
            arr[count] = current; //Populate the array with the links from the list

            for(int i = 0; i < count; i++)
                if(arr[i] == current) //Check if we have seen the current element before(i.e if it's in the array)
                    return count-i; //The length of the loop is the index of current minus the index of the repeated element

            count++; //Increment counter for each iteration of the loop
            current = current.next; //Make current the next element in the list
        }
        return 0; //If you walk through the entire list and complete the while loop then there is no loop in the list
   }
}
class Link{
	public String data;
	public Link next;

	public Link(String input){
		data=input;
		next=null;
	}
}
class LinkedList {
	public Link first;

	public LinkedList( ){
		first=null;
	}

	public boolean isEmpty( ){
		return (first==null);
	}

	public void insertHead(Link insert){
		if(isEmpty())
			first=insert;

		else{
			insert.next=first;
			first=insert;
		}
	}
}