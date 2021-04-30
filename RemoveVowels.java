package StringOperations;
import java.util.Scanner;


public class RemoveVowels {

    public static void removeVowels(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = scanner.nextLine();

        word = word.replaceAll("[AEIOUYaeiouy]", "");
        System.out.println("Your word without vowels : " + word);
    }
}
