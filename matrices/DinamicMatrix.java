import java.util.Scanner;

public class DinamicMatrix {
    public static void main(String[] args) {

        int counter = 0;
        int row = 0;
        int col = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Hpw many rows do you want? ");
        row = input.nextInt();

        System.out.println("How many columns do you want?");
        col = input.nextInt();

        int matrix[][] = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = counter;
                counter++;
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }

        input.close();
    }
}
