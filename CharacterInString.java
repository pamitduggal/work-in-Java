package KeyBoardInputs;
import java.util.Scanner;

public class CharacterInString {

    public static void characterInString() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your word :");
        String word = myObj.nextLine();

        System.out.println("Which index do you want ?");
        int index = Integer.parseInt(myObj.nextLine());

        System.out.println("The character is : " + word.charAt(index));
    }
}
