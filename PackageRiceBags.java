package AdvancedExercises;
import java.util.Scanner;

public class PackageRiceBags {

    public static void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many small rice bags ? (1kg)");
        int smallBagsGiven = Integer.parseInt(scanner.nextLine());

        System.out.println("How many big rice bags ? (5kg)");
        int bigBagsGiven = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the goal kilos of rice ?");
        int goal = Integer.parseInt(scanner.nextLine());

        int kilosLeft = goal;
        int smallBagsFilled = 0;
        int bigBagsFilled = 0;


        while(bigBagsFilled < bigBagsGiven && kilosLeft / 5 > 0){
            bigBagsFilled ++;
            kilosLeft -= 5;
        }

        smallBagsFilled = kilosLeft;

        if(smallBagsFilled > smallBagsGiven)
            System.out.println("This is not possible to fill the goal with the bags given.");
        else{
            System.out.println("To fill " + goal + " kilos of rice :");
            System.out.println("- " + bigBagsFilled + " big bags");
            System.out.println("- " + smallBagsFilled + " small bags");
        }
    }
}
