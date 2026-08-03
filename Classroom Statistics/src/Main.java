import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int highest = 0;
        int lowest = 100;
        int sum = 0;
        int passed = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter mark " + i + ": ");
            int mark = input.nextInt();

            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }

            sum += mark;

            if (mark >= 50) {
                passed++;
            }
        }

        double average = (double) sum / 10;

        System.out.println("Highest Mark = " + highest);
        System.out.println("Lowest Mark = " + lowest);
        System.out.println("Average = " + average);
        System.out.println("Passed Students = " + passed);
    }
}