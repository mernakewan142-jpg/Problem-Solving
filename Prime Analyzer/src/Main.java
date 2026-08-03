import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        boolean isBrime = true;
        int smallestDivisior = 0;

        if (num <= 1){
            isBrime = false;
            smallestDivisior = num;

        } else {
            for (int i = 2 ; i < num ; i++){
                if (num % i == 0){
                    isBrime = false;
                    smallestDivisior = i;
                    break;
                }
            }
        }
        if (isBrime){
            System.out.println("prime");

        } else {
            System.out.println("Not Prime");
            System.out.println("Smallest Divisor = " + smallestDivisior);
        }
    }
}