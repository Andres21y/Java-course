
import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        String mainCharacter = "", resCharacter = "";
        int numCharacter = 0, from = 0, to =0;
        Scanner input = new Scanner(System.in);

    System.out.println("===== Please enter a string of characters");
    mainCharacter = input.nextLine();

    numCharacter = mainCharacter.length();
    System.out.println("");
    System.out.println("This character has: " + numCharacter + " characters");

    System.out.println("");
    System.out.println("===== From what character do you want to cut?");
    from = input.nextInt();

    System.out.println("");
    System.out.println("===== To what character do you want to cut?");
    to = input.nextInt();


    System.out.println("");
    resCharacter= mainCharacter.substring(from, to);
    System.out.println("The new character is: " + resCharacter);
    
    input.close();
    System.out.println("");

    }
}
