// Java program for Number Game
import java.util.*;
 
public class numbergame {
 
    // main function50
    public static void main(String arg[])
    {
        // Function Call
        guessNum();
    }
    // Function for the task
    public static void
    guessNum()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);
 
        // Generate the numbers
        int number = 1 + (int)(100* Math.random());
 
        // Given t trials
        int t = 5;
 
        int i, guess;
 
        System.out.println("A number is chosen between 1 to 100, Guess the number in 5 trials.");
 
        //iteration using for loop
        for (i = 0; i < t; i++) {
 
            System.out.println("Guess the number:");
            guess = sc.nextInt();
 
            // If condition
            if (number == guess) {
                System.out.println("Congratulations! You guess is correct. You won the Game");
                break;
            }
            else if (number > guess && i != t - 1) {
                System.out.println("The number is greater than " + guess);
            }
            else if (number < guess && i != t - 1) {
                System.out.println("The number is less than " + guess);
            }
        }
 
        if (i == t) {
            System.out.println("You have exhausted 5 trials.");
            System.out.println("The number was " + number);
        }
    }
}