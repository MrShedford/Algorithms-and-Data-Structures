/*
 * Given a number of coin tosses and how likely a coin is to land on heads,
 * what's the probability that the majority of coin tosses will be heads?
*/
import java.util.Scanner;
public class Lab5_BiasedCoin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		double tosses = sc.nextDouble();
		int prob = sc.nextInt();

		int successes = 0;

		double simulations = 100000;

		for(int i = 0; i < simulations; i++){
			int count = 0; //Reset the counter for each simulation
			for(int j = 0; j < tosses; j++){
				if((Math.random()*100) <= prob)
					count++; //Count how many times we get a head
			}
			if(count > tosses/2) //If more than half the tosses are heads
				successes++; //Increment the number of successful simulations
		}
		int result = (int)(Math.round((successes/simulations)*100)); //Calculate the percentage chance of getting majority heads

		System.out.println(result);
	}
}