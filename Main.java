package Main;
import java.util.Scanner;
import KeyBoardInputs.*;
import FlowControl.*;
import StringOperations.*;
import AdvancedExercises.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program start.");
        System.out.println("Which exercise do you want to see ?");
        System.out.println("1. PromptName");
        System.out.println("2. CharacterInString");
        System.out.println("3. Decision");
        System.out.println("4. PrintOddNumbers");
        System.out.println("5. TransposeMatrix");
        System.out.println("6. PrintTriangle");
        System.out.println("7. RemoveVowels");
        System.out.println("8. NumberGuessingGame");
        System.out.println("9. Hangman");
        System.out.println("10. RiceBags");
        System.out.println("11. RockPaperScissors");
        System.out.println("12. Calculator");

        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                PromptName.promptName();
                break;
            case 2:
                CharacterInString.characterInString();
                break;
            case 3:
                Conditional.decison();
                break;
            case 4:
                Loop.printOddNumbers();
                break;
            case 5:
                Loop.tranposeMatrix();
                break;
            case 6:
                Loop.printTriangle();
                break;
            case 7:
                RemoveVowels.removeVowels();
                break;
            case 8:
                NumberGuessingGame.run();
                break;
            case 9:
                Hangman.run();
                break;
            case 10:
                PackageRiceBags.run();
                break;
            case 11:
                RockPaperScissors.run();
                break;
            case 12:
                Calculator c = new Calculator();
                break;
        }
    }
}