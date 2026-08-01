import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your PIN");
        int PIN = sc.nextInt();

        if (PIN == 1234){
            System.out.println("Access Granted");
        } else {
            System.out.println("Invalid PIN");
        }

    }
}