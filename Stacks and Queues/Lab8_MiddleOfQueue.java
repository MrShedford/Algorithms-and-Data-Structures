//Find the median value in a Queue given input
//Example input: INSERT 20,INSERT 30, INSERT 23,REMOVE, REMOVE

package GitHub;
import java.util.*;

public class Lab8_MiddleOfQueue {
	public static void main(String args[]){
	 Scanner sc= new Scanner(System.in);
     String x;
     Queue theQueue =new Queue(20);

     while(sc.hasNext()){
         x=sc.next();
         if(x.equals("STOP"))			//Need stopping condition when using hasNext with standard input.
         	break;

         if((x.equals("REMOVE"))&&!theQueue.isEmpty()){
                theQueue.remove();
         }

         else{
             x=sc.next();
             theQueue.insert(x);
         }
     }
    if(theQueue.isEmpty()){
        System.out.println("empty");
    }
    else{
        int size=0;
        size =size+theQueue.size();
        if(size%2==0){
            size=(size/2)-1;
        }
        else{
            size=size/2;
        }

         for(int i=0;i<size;i++){
                 theQueue.remove();

         }
        System.out.println(theQueue.remove());
    }

}
}

class Queue{

 private int maxSize;
 private String[] queArray;
 private int front;
 private int rear;
 private int nItems;

 public Queue(int s){
     maxSize = s;
     queArray = new String[maxSize];
     front = 0;
     rear = -1;
     nItems = 0;
 }

 public boolean insert(String item){
 //fill this in
     if(isFull()) return false;
     if(rear==maxSize-1)
         rear=-1;
     rear++;
     queArray[rear]=item;
     nItems++;
     return true;
 }

 public String remove(){
 //fill this in
     if(isEmpty()) return null;
     String temp=queArray[front];
     front++;
     if(front==maxSize)
         front=0;
     nItems--;
     return temp;
 }

 public boolean isEmpty(){
     return (nItems==0);
 }

 public boolean isFull(){
     return (nItems==maxSize);
 }

 public int size(){
     return nItems;
 }

}
