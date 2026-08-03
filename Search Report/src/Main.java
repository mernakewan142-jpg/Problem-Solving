import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter target: ");
        int target = input.nextInt();

        boolean found = false;
        int position = -1;
        int occurrences = 0;

        for (int i = 0; i < size; i++) {

            if (arr[i] == target) {

                found = true;

                if (position == -1) {
                    position = i;
                }

                occurrences++;
            }
        }

        if (found) {
            System.out.println("Found");
            System.out.println("Position = " + position);
            System.out.println("Occurrences = " + occurrences);
        } else {
            System.out.println("Not Found");
        }

    }
}