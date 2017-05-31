//Find the nearest prime to n
//My answer uses the Sieve of Eratosthenes

import java.util.Scanner;

public class Lab4_NearestPrime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int size = n*n; //As we don't know how big the prime nearest to n is, we have to make our array quite large

		boolean sieve[] = new boolean[size];
		sieve[0] = false;
		sieve[1] = false;
		for(int i = 2; i < size; i++)
			sieve[i] = true; //Set every element to true except index 0 and 1

		int record = n, answer = 0;

		for(int i = 2; i < size; i++){
			if(sieve[i] == true){
				if(Math.abs(n - i) < record){ //If the distance between the current prime and n is less than the record shortest distance
					record = Math.abs(n - i); //Update the record
					answer = i;
				}
				else
					break; //If the distance ever gets bigger than the record then you're past the shortest possible distance

				for(int j = i+i; j < size; j+=i) //When we've found a prime, set every multiple of that prime to false
					sieve[j] = false;
			}
		}
		System.out.println(answer);
	}
}