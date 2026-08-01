import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer");

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= 12 ; i++) {
            int result = num * i;

            System.out.println(num + "*" + i + "=" + result);

            sum += result;
        }
        System.out.println("sum = " + sum);
    }
}