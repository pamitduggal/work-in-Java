import java.util.Scanner;

class Game {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        boolean wantContinue;

        do {
            do {
                System.out.println("Please make a Choice!");
                System.out.println("1. Paper");
                System.out.println("2. Scissors");
                System.out.println("3. Rock");
                choice = Integer.parseInt(scanner.nextLine());
            } while (choice <= 0 && choice > 3);

            switch (choice) {
                case 1:
                    System.out.println("Selected  Paper!");
                    break;
                case 2:
                    System.out.println("Selected Scissors!");
                    break;
                case 3:
                    System.out.println("Selected Rock!");
                    break;
                default:
                    break;
            }

            int computerChoice = (int)Math.floor(Math.random() * (3)+1);
            switch (computerChoice) {
                case 1:
                    System.out.println("Paper is Chosen!");
                    if (choice == 1)
                        System.out.println("Matched Equally !");
                    else if (choice == 2)
                        System.out.println("You win.");
                    else if (choice == 3)
                        System.out.println("I win.");
                    break;
                case 2:
                    System.out.println("Scissors is Chosen!");
                    if (choice == 2)
                        System.out.println("Matched Equally!.");
                    else if (choice == 3)
                        System.out.println("You win.");
                    else if (choice == 1)
                        System.out.println("I win.");
                    break;
                case 3:
                    System.out.println("Rock is Chosen !");
                    if (choice == 3)
                        System.out.println("Matched Equally.");
                    else if (choice == 1)
                        System.out.println("You win.");
                    else if (choice == 2)
                       System.out.println("I win.");
                    break;
                default: System.out.println("Wrong Choice Error !");
                    break;
            }

            System.out.println("Press y to Continue ? ");
            char response = scanner.nextLine().toLowerCase().charAt(0);
            if(response == 'y')
                wantContinue = true;
            else
                wantContinue = false;


        }while(wantContinue);




    }
}
