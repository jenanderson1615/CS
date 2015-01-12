/*************************************
 Program: Guess my card
 Author: Jen Anderson
 Date: 02/03/13
 Description: This program has the user attempt to guess a random number determined by
  			  the computer in six guesses or less.
 Input: This program asks for the user to enter integer guesses, though it controls for 
 			  non integer guesses as well.
				
 ************************************/

import java.util.*;

public class assignment2
{
	public static void main(String[] args)
	{
		//My five variables and my scanner object are initialized.  
		int myRandomNumber = 1 + (int)(Math.random() * ((52 - 1) + 1));
		int rangelow = 1;
		int rangehigh = 52;
		int userGuess;
		int whileLoopCounter = 0;
		Scanner guesses = new Scanner(System.in);
		
		//These lines introduce the game and give instructions to the user.
		System.out.println("This is a number guessing game! Try to guess the magic number! ");
		System.out.println("The range is 1 to 52.  You have 6 guesses.  Good luck!");
		System.out.print("What's your first guess?: ");
		
		//This while statement ensures each user guess is tested to see if its an integer.
		while (true) 
		{
			try 
			{
				userGuess = guesses.nextInt();
				/* My while loop tests the numbers against my randomly generated 'magic number.' The while loop is entered if the user has guessed less than six times, 
				 * or if the right answer has not been entered.  After a guess meets these two qualifications, its tested to see if its inside the range, if its lower than
				 * the random number, or if its higher than the random number.  Statements are printed depending on which of these three categories
				 * the guess fits into.  In the second two loops, the range is also updated.*/
				
				while (whileLoopCounter < 5 && userGuess!=myRandomNumber) 
				{		
					if(userGuess<rangelow||userGuess>rangehigh) 
					{
						System.out.println("You should already know " + userGuess + " is not in the specified range! Enter a number between " + (rangelow) + " and " + (rangehigh) + ". " );
					}
					else if (userGuess < myRandomNumber) 
					{
						rangelow = (userGuess+1); 
						System.out.println("It's too low, so your next guess should be between " + rangelow + " and " + rangehigh + ".  ");
					}
					else if (userGuess > myRandomNumber) 
					{
						rangehigh = (userGuess-1);
						System.out.println("It's too high, so your next guess should be between " + rangelow + " and " + rangehigh + ".  ");
					}	
					/*The next three statements ask for another guess and read the user's next guess (Since the while loop was entered, it means the guess was not right),
					and update the while loop counter for each wrong guess.*/
					System.out.print("Guess number " + (whileLoopCounter+2) + " is: ");
					userGuess = guesses.nextInt();	
					whileLoopCounter = whileLoopCounter + 1;
				} 
				/*If a user's guess does not meet the qualifications of the while loop, this if statement is evaluated.  The first if statement
				 * covers what occurs if the user guesses right, and the else covers what happens if the user isn't able to guess right in the number of guesses
				 * allowed.   */
				if (userGuess == myRandomNumber)
				{
					System.out.print("You're right!  The magic number was " + myRandomNumber + "!\n");
					break;	
				}		
				else
				{
					System.out.print("You ran out of guesses.  The magic number was " + myRandomNumber + ".  You may need to work on your guessing skills.\n");
					break;
				}	
			} 
			/*This catches if anything other than an integer is added.*/
			catch (InputMismatchException ex) 
			{
				System.out.print("You need to enter integers to play this game.  This attempt does not count as a guess.  Please try again: ");
				guesses.next();
			}
		} 
	}
}



