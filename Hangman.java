package AdvancedExercises;
import java.util.Scanner;

public class Hangman {

    static String words[] = {"celebration", "biography", "bullet", "dynamic", "organisation", "magnitude", "sunday", "drive", "gesture", "response"};

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        String word = words[(int)Math.floor(Math.random() * ( 9 - 0 ))];
        int wordLength = word.length();

        System.out.println("Word : "+word);
        System.out.println("Word length : "+ wordLength);

        String guessingWord = "";
        for (int i = 0; i < wordLength; i++) {
            guessingWord += '_';
        }

        int charLeft = wordLength;
        int lives_left = 11;

        System.out.println("You start with "+lives_left+ " lives.");

        boolean charFound = false;

        while(lives_left > 0 && charLeft > 0){
            System.out.println("---------------------");
            System.out.println("Lives left : " + lives_left);

            System.out.println("Word : " + guessingWord);

            System.out.println("Enter your guess : ");
            char userChar = scanner.nextLine().toLowerCase().charAt(0);

            charFound = false;
            for (int i = 0; i < wordLength; i++) {
                if(word.charAt(i) == userChar && guessingWord.charAt(i) != userChar){
                    guessingWord = guessingWord.substring(0, i) + userChar + guessingWord.substring(i+1, wordLength);
                    charLeft--;
                    charFound = true;
                }
            }

            if(!charFound)
                lives_left--;
        }

        System.out.println("---------------------");

        if(lives_left <= 0)
            System.out.println("Oh no, you don't find the word "+word);
        else
            System.out.println("Congratulations !! You find the word "+word);

    }
}
