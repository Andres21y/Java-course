import java.util.Scanner;

public class DinamicVectors {
    public static void main(String[] args) {
        int length = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("===|| How many numbers do you want to enter? ");
        length = input.nextInt();

        int numbers[] = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter value # " + (i + 1));
             numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + numbers[i] + "]");
        }

        input.close();
    }
}
