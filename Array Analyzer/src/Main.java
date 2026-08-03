import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        int sum = 0;

        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < size; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        double average = (double) sum / size;

        System.out.println("Largest Element = " + largest);
        System.out.println("Smallest Element = " + smallest);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}