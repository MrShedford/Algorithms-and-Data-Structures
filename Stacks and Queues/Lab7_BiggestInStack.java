//Get the biggest element in the stack after performing the given push and pop commands

import java.util.Scanner;
public class Lab7_BiggestInStack{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();sc.nextLine();

        Stack myStack = new Stack(n);

        for(int i = 0; i < n; i++){
            String arr[] = sc.nextLine().split(" "); //Splits input when it reaches a space and puts each element in an array

            if(arr[0].equals("PUSH")){
                int temp = Integer.parseInt(arr[1]);
                myStack.push(temp); //Convert the number from a string to an int and push it on to the stack
            }
            else
                if(myStack.isEmpty())
                    continue; //Will move on to the next iteration of the loop if the stack's empty
                else
                    myStack.pop();
        }

        if(myStack.isEmpty())
            System.out.println("empty");

        else{
            int record = Integer.MIN_VALUE;

            while(!myStack.isEmpty()){
            	if(myStack.peek() > record)
            		record = myStack.peek(); //Keep updating the biggest number we find
            	myStack.pop();
            }
            System.out.println(record);
        }
    }
}
class Stack{
    private int maxsize;
    private int[] stackArray;
    private int top;

    public Stack(int size){
        maxsize = size;
        stackArray = new int[maxsize];
        top = -1;
    }
    public void push(int x){
        top++;
        stackArray[top] = x;
    }
    public int pop(){
        return stackArray[top--];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return(top == -1);
    }
    public boolean isFull(){
        return(top == maxsize -1);
    }
    public void makeEmpty(){
        top = -1;
    }
}