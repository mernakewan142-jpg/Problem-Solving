import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] temp = new int[7];

        int sum = 0;

        System.out.println("Enter temperatures:");

        for (int i = 0; i < 7; i++) {
            temp[i] = input.nextInt();
            sum += temp[i];
        }

        int highest = temp[0];
        int lowest = temp[0];

        for (int i = 1; i < 7; i++) {

            if (temp[i] > highest) {
                highest = temp[i];
            }

            if (temp[i] < lowest) {
                lowest = temp[i];
            }

        }

        double average = sum / 7.0;

        int daysAboveAverage = 0;

        for (int i = 0; i < 7; i++) {

            if (temp[i] > average) {
                daysAboveAverage++;
            }

        }

        System.out.println("Highest Temperature = " + highest);
        System.out.println("Lowest Temperature = " + lowest);
        System.out.println("Weekly Average = " + average);
        System.out.println("Days Above Average = " + daysAboveAverage);

    }
}