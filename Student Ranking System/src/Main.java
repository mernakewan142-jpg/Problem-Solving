import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine();

        String[] names = new String[n];
        int[] marks = new int[n];

        int sum = 0;
        int passed = 0;

        int highest = 0;
        int lowest = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            names[i] = input.nextLine();

            System.out.print("Enter mark: ");
            marks[i] = input.nextInt();
            input.nextLine();

            sum += marks[i];

            if (marks[i] >= 60)
                passed++;

            if (i == 0) {

                highest = 0;
                lowest = 0;

            } else {

                if (marks[i] > marks[highest]) {
                    highest = i;
                }

                if (marks[i] < marks[lowest]) {
                    lowest = i;
                }

            }

        }

        double average = (double) sum / n;

        System.out.println("Top Student = " + names[highest]);
        System.out.println("Highest Mark = " + marks[highest]);

        System.out.println("Lowest Student = " + names[lowest]);
        System.out.println("Lowest Mark = " + marks[lowest]);

        System.out.println("Class Average = " + average);

        System.out.println("Passed Students = " + passed);

    }

}