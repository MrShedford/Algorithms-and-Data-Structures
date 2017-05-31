//Find the nth prime
//My answer uses the Sieve of Eratosthenes

import java.util.Scanner;

public class Lab4_NthPrime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int size = n*n; //As we don't know how big the nth prime number is, we have to make our array quite large

		boolean sieve[] = new boolean[size];
		sieve[0] = false;
		sieve[1] = false;
		for(int i = 2; i < size; i++)
			sieve[i] = true; //Set every element to true except index 0 and 1

		int count = 0;
		boolean check = false;

		int i = 2;
		while(check == false){
			if(sieve[i] == true){
				count++; //Keep track of how many prime numbers we've found
				if(count == n){ //When we've found the nth prime number we print it and stop the loop
					System.out.println(i);
					check = true;
				}
				else
					for(int j = i+i; j < size; j+=i) //When we've found a prime, set every multiple of that prime to false
						sieve[j] = false;
			}
			i++;
		}
	}
}