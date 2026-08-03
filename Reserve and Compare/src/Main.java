import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int original = num;
        int reserve = 0;

        while (num > 0) {
            int digit = num % 10;
            reserve = reserve * 10 + digit;
            num /= 10;
        }
        System.out.println("Reserved Number = " + reserve);

            if (original == reserve) {
                System.out.println("equal");
            } else {
                System.out.println("Not equal");
            }
        }
    }
