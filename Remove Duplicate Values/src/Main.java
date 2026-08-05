import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int[] unique = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        int count = 0;

        for (int i = 0; i < size; i++) {

            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.print("Unique Values: ");

        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }

    }
}