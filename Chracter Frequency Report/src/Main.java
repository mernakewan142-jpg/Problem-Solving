import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);

            boolean printed = false;

            for (int j = 0; j < i; j++) {

                if (current == text.charAt(j)) {
                    printed = true;
                    break;
                }

            }

            if (!printed) {

                int count = 0;

                for (int k = 0; k < text.length(); k++) {

                    if (current == text.charAt(k)) {
                        count++;
                    }

                }

                System.out.println(current + " : " + count);

            }

        }

    }

}