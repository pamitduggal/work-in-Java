package FlowControl;
import java.util.Scanner;

public class Conditional {

    public static void decison() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you ?");
        int age = Integer.parseInt(scanner.nextLine());

        if(age >= 18)
            System.out.println("You are able to vote.");
        else
            System.out.println("You are not able to vote.");

        if(age%2 == 0)
            System.out.println("And your age is an even number.");
        else
            System.out.println("And your age is an odd number.");
    }
}
