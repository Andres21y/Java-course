import java.util.Scanner;

public class FnNormal {
    public static void main(String args[]) {
        int a = 0, b = 1, c = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("==============================================================================");
        System.out.println("================ Welcome to Fibonacci Sequence Program =======================");
        System.out.println("");

        System.out.println("== type one value");
        int amount = input.nextInt();
        for (int index = 0; index < amount; index++) {
            System.out.println(a + ",");

            try {
                c = a + b;
                a = b;
                b = c;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                if (input != null) {
                    input.close();
                }
            }

        }
        System.out.println("");
        System.out.println("=== Program has finished :)");
    }
}
