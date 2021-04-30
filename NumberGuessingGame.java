package AdvancedExercises;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void run(){
        int number = (int)Math.floor(Math.random() * ( 100 - 0 ));
        System.out.println("(Guessing number is : "+ number+")");

        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        int tryLeft = 5;

        while(!found && tryLeft>0){
            System.out.println("Enter your guess :");
            int guess = Integer.parseInt(scanner.nextLine());

            if(guess > number)
                System.out.println("Too high.");
            else if(guess < number)
                System.out.println("Too low.");
            else
                found = true;

            tryLeft--;
        }

        if(found)
            System.out.println("Congratulations, you found the number !");
        else
            System.out.println("I'm sorry but you have no more try.");

    }
}
