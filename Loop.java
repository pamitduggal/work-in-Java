package FlowControl;
import java.util.Scanner;

public class Loop {

    public static void printOddNumbers(){
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void tranposeMatrix(){
        System.out.println("Enter your 3x3 matrix :");
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        String[] secondLine = scanner.nextLine().split(" ");
        String[] thirdLine = scanner.nextLine().split(" ");

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++)
            matrix[0][i] = Integer.parseInt(firstLine[i]);
        for (int i = 0; i < 3; i++)
            matrix[1][i] = Integer.parseInt(secondLine[i]);
        for (int i = 0; i < 3; i++)
            matrix[2][i] = Integer.parseInt(thirdLine[i]);

        int[][] transposedMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposedMatrix[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }

    public static void printTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("*");
            for (int j = 0; j < i; j++)
                System.out.print("*");

            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            System.out.println(" ");
        }
    }
}
