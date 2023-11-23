import java.util.Scanner;

public class cadenas {
    public static void main(String[] args) {
        String name_one = "", name_two = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please type first name");
        name_one = input.nextLine();

        System.out.println("Please type second name");
        name_one = input.nextLine();

        input.close();

        if (name_one.equalsIgnoreCase(name_two)) {
            System.out.println("------names are equals");
            System.out.println("");
        } else {
            System.out.println("------name aren't equals");
            System.out.println("");
        }
    }

}
