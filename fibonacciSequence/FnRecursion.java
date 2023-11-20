import java.util.Scanner;

public class FnRecursion {
    public static void main(String args[]) {

        int num = 10;
        Scanner input = new Scanner(System.in);

        System.out.println("==============================================================================");
        System.out.println("================ Welcome to Fibonacci Sequence Program =======================");
        System.out.println("");

        try {
            System.out.println("**--Please, Enter the number value to calculate");
            num = input.nextInt();
            System.out.println("");

            for (int i = 0; i < num; i++) {
                System.out.println("== " + fn(i) + " ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el Scanner en el bloque finally para asegurarse de que siempre se
            // cierre
            if (input != null) {
                input.close();
            }
        }

        System.out.println("");
        System.out.println("=== Program has finished :)");

    }

    public static int fn(int num) {
        return (num <= 1) ? num : fn(num - 1) + fn(num - 2);
    }

}
