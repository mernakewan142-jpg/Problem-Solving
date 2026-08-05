import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static String[] books = new String[100];
    static boolean[] borrowed = new boolean[100];
    static int count = 0;

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    borrowBook();
                    break;

                case 3:
                    returnBook();
                    break;

                case 4:
                    displayBooks();
                    break;

                case 5:
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

    }

    public static void addBook() {

        System.out.print("Enter Book Name: ");
        books[count] = input.nextLine();
        borrowed[count] = false;
        count++;

        System.out.println("Book Added Successfully.");

    }

    public static void borrowBook() {

        System.out.print("Enter Book Name: ");
        String name = input.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (books[i].equalsIgnoreCase(name)) {

                found = true;

                if (!borrowed[i]) {

                    borrowed[i] = true;
                    System.out.println("Book Borrowed.");

                } else {

                    System.out.println("Book Already Borrowed.");

                }

            }

        }

        if (!found) {

            System.out.println("Book Not Found.");

        }

    }

    public static void returnBook() {

        System.out.print("Enter Book Name: ");
        String name = input.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (books[i].equalsIgnoreCase(name)) {

                found = true;

                if (borrowed[i]) {

                    borrowed[i] = false;
                    System.out.println("Book Returned.");

                } else {

                    System.out.println("Book Was Not Borrowed.");

                }

            }

        }

        if (!found) {

            System.out.println("Book Not Found.");

        }

    }

    public static void displayBooks() {

        System.out.println("\nAvailable Books:");

        for (int i = 0; i < count; i++) {

            if (!borrowed[i]) {

                System.out.println(books[i]);

            }

        }

    }

}