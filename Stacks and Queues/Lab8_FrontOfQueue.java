/*
 * What's at the front of the queue after performing the given insert and remove commands?
 * CONSTRAINTS: 	1 <= commands <= 20		1 <= length of string <= 20
*/

import java.util.Scanner;
public class Lab8_FrontOfQueue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Queue myQueue = new Queue(20); //The queue will never be bigger than 20
		while(sc.hasNext()){
            String arr[] = sc.nextLine().split(" "); //Splits input when it reaches a space and puts each element in an array

            if(arr[0].equals("STOP")) //You need to put in a stopping condition when using standard input with hasNext()
            	break;

            else if(arr[0].equals("INSERT"))
                myQueue.insert(arr[1]);

            else //If it says REMOVE
                if(myQueue.isEmpty())
                    continue; //Will move on to the next iteration of the loop if the stack's empty
                else
                    myQueue.remove();
		}
		System.out.println(myQueue.remove());
    }
}
class Queue{
	private int maxSize;
	private String[] queueArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int size){ //Constructor
		maxSize = size;
		queueArray = new String[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public boolean insert(String x){ //Inserts an element at the rear of the queue
		if(isFull())
			return false;
		if(rear == maxSize-1) //If the back of the queue is the end of the array wrap around to the front
			rear = -1;
		rear++;
		queueArray[rear] = x;
		nItems++;
		return true;
	}

	public String remove(){ //Remove an element from the front of the queue
		if(isEmpty()){
			System.out.println("Queue is empty");
			return null;
		}
		String temp = queueArray[front];
		front++;
		if(front == maxSize) //Dealing with wrap-around again
			front = 0;
		nItems--;
		return temp;
	}

	public boolean isFull(){ //Returns true is the queue is full
		return(nItems == maxSize);
	}

	public boolean isEmpty(){ //Returns true is the queue is empty
		return(nItems == 0);
	}
}