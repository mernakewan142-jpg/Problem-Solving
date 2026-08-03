import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int num = sc.nextInt();

        int count = 0;
        int sum = 0;
        int largest = 0;
        int smallest = 9;

        while (num > 0){
            int digit = num % 10;
            count++;
            sum += digit;

            if (digit > largest) {
                largest = digit;
            }

                if (digit < smallest){
                    smallest = digit;
                }
                num /= 10;
            }
        System.out.println("Number of digit = " + count);
        System.out.println("Sum of digit = " + sum);
        System.out.println("Largest digit = " + largest);
        System.out.println("Smallest digit = " + smallest);
        }
    }
