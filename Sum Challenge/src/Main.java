import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the N");
        int N = sc.nextInt();
        int EvenSum = 0;
        int OddSum = 0;

        for (int i = 1 ; i <= N ; i++) {
            if (i % 2 == 0) {
                EvenSum += i;
            } else {
                OddSum += i;
            }
        }

        System.out.println("Even Sum = " + EvenSum);
        System.out.println("Odd Sum = " + OddSum);


    }
}