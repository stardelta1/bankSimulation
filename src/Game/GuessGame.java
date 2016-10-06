package Game;

import java.util.Random;

import Helper.InputHelper;

public class GuessGame {
	
	public void guessNumber() {
		System.out.println("I'm thinking of a number between 1 - 20 ...");
		System.out.println("Can you guess the number? You have 5 trials");
		int trials = 5;
		Random random = new Random();
		int randomNumber = random.nextInt(20);
		while(trials > 0) {
			int guessed = Integer.parseInt(InputHelper.getInput());
			if(trials <= 1) {
				System.out.println("Your trial is over!!! The number is: "+randomNumber);
			}			
			if(guessed > randomNumber){
				System.out.println("Your guess is too high! Try again!!");
			}else if(guessed < randomNumber) {
				System.out.println("Your guess is too low! Try again!!");
			}else if(guessed == randomNumber) {
				System.out.println(guessed+ ": Horray!!! you guessed right\n");
				break;
			}			
			trials--;
		}
	}
}
