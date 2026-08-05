import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        int characters = sentence.length();

        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        int vowels = 0;
        int consonants = 0;

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                    vowels++;

                } else {

                    consonants++;
                }

            }

        }

        System.out.println("Characters = " + characters);
        System.out.println("Words = " + wordCount);
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

    }
}