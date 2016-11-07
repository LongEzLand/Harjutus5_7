import java.util.Random;
import java.util.Scanner;

/**
 * Created by Lazarus on 7.11.2016.
 *
 * Exercise 5.7 Now that we have conditional statements, we can get back to
 the “Guess My Number” game from Exercise 3.4.
 You should already have a program that chooses a random number, prompts
 the user to guess it, and displays the difference between the guess and the
 chosen number.
 Adding a small amount of code at a time, and testing as you go, modify the
 program so it tells the user whether the guess is too high or too low, and then
 prompts the user for another guess.
 The program should continue until the user gets it right. Hint: Use two
 methods, and make one of them recursive.
 *
 */

public class Harjutus5_7 {

    public static void main(String[] args) {

        System.out.print("I'm thinking of a number between 1 and 100\n(including both).");
        System.out.println(" Can You guess what it is?\n");
        //Random numbri genereerimine
        Random random = new Random();
        int number = random.nextInt(100)+1;
        myGuess(number);
        System.out.println("Good Job!");

    }
    public static void myGuess(int randomNumber){
        System.out.print("Write your guess here: ");
        Scanner in = new Scanner(System.in);
        int myGuess = in.nextInt();

        if  (myGuess > 100 || myGuess < 0){
            System.out.println("I said \"between 1 and 100\"!");
            myGuess(randomNumber);
        }
        else if (randomNumber > myGuess){
            System.out.println("Higher!");
            myGuess(randomNumber);
        }
        else if(randomNumber < myGuess){
            System.out.println("Lower!");
            myGuess(randomNumber);
        }
        else {
            System.out.println("Correct!");
        }
        return;
    }
}

