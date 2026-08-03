import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int first = 0;
        int second = 1;
        int sum = 0;
        int largest = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            sum += first;
            largest = first;

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        System.out.println("Largest Fibonacci Number = " + largest);
        System.out.println("Sum = " + sum);
    }
}