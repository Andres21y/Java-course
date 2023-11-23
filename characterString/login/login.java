import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String user = "", password = "";
        Scanner input = new Scanner(System.in);

        System.out.println("======================== Please, type yor user name");
        user = input.nextLine();

        System.out.println("======================== Please, type yor user password");
        password = input.nextLine();

        logIn(user, password);
        input.close();
    }

    public static void logIn(String user, String password) {
        String nameSaved = "andres", passSaved = "12345";

        if (user.equals(nameSaved) && password.equals(passSaved)) {
            System.out.println("logIn, Welcome Mr." + nameSaved);
        }else{

            System.out.println("Something was wrong");
        }
    }
}
