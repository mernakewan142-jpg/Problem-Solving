import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        do {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            attempts++;

            if (guess > secret) {
                System.out.println("Too High");
            } else if (guess < secret) {
                System.out.println("Too Low");
            }

        } while (guess != secret);

        System.out.println("Correct!");
        System.out.println("Attempts = " + attempts);
    }
}