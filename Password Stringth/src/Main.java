import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password");

        String Password = sc.nextLine();
        boolean Digit = false;

        for (int i = 0; i < Password.length(); i++) {

            if (Character.isDigit(Password.charAt(i))) {
                Digit = true;
                break;
            }
        }
        if (Password.length() >= 8 && Digit){
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
