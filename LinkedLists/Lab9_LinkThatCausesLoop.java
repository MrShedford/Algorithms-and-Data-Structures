/*
 * Find the link in the list that causes it to loop
 * CONSTRAINTS: 0 <= Number of links <= 100
*/
import java.util.*;
public class Lab9_LinkThatCausesLoop{
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
 	public static String findLoopLength(LinkedList myList){
        if(myList.isEmpty())
            return "empty"; //Return empty if the list is empty

        Link current = myList.first; //Make current equal to the first element in the list
        Link previous = myList.first; //We need to keep track of the previous element
        int count = 0;
        Link arr[] = new Link[100]; //It says in the constraints the the list will never be bigger than 100

        while(current.next != null){
            arr[count] = current; //Populate the array with the links from the list

            for(int i = 0; i < count; i++)
                if(arr[i] == current) //Check if we have seen the current element before(i.e if it's in the array)
                    return previous.data; //Return the data of the link that causes us to loop

            count++; //Increment counter for each iteration of the loop
            previous = current; //Make previous the current element in the list
            current = current.next; //Make current the next element in the list
        }
        return "OK"; //If you walk through the entire list and complete the while loop then there is no loop in the list
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