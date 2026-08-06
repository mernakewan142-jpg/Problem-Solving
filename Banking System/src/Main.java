import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static int[] accountNumber = new int[100];
    static String[] name = new String[100];
    static double[] balance = new double[100];
    static int count = 0;

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Banking System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Search Account");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    searchAccount();
                    break;

                case 5:
                    displayAccounts();
                    break;

                case 6:
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while (choice != 6);

    }

    public static void createAccount() {

        System.out.print("Enter Account Number: ");
        accountNumber[count] = input.nextInt();

        input.nextLine();

        System.out.print("Enter Name: ");
        name[count] = input.nextLine();

        System.out.print("Enter Balance: ");
        balance[count] = input.nextDouble();

        count++;

        System.out.println("Account Created Successfully.");

    }

    public static void deposit() {

        System.out.print("Enter Account Number: ");
        int acc = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (accountNumber[i] == acc) {

                System.out.print("Enter Deposit Amount: ");
                double amount = input.nextDouble();

                balance[i] += amount;

                System.out.println("Deposit Successful.");
                return;

            }

        }

        System.out.println("Account Not Found.");

    }

    public static void withdraw() {

        System.out.print("Enter Account Number: ");
        int acc = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (accountNumber[i] == acc) {

                System.out.print("Enter Withdraw Amount: ");
                double amount = input.nextDouble();

                if (amount <= balance[i]) {

                    balance[i] -= amount;
                    System.out.println("Withdrawal Successful.");

                } else {

                    System.out.println("Insufficient Balance.");

                }

                return;

            }

        }

        System.out.println("Account Not Found.");

    }

    public static void searchAccount() {

        System.out.print("Enter Account Number: ");
        int acc = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (accountNumber[i] == acc) {

                System.out.println("Account Number : " + accountNumber[i]);
                System.out.println("Name : " + name[i]);
                System.out.println("Balance : " + balance[i]);

                return;

            }

        }

        System.out.println("Account Not Found.");

    }

    public static void displayAccounts() {

        System.out.println("\n===== All Accounts =====");

        for (int i = 0; i < count; i++) {

            System.out.println("----------------------");
            System.out.println("Account Number : " + accountNumber[i]);
            System.out.println("Name : " + name[i]);
            System.out.println("Balance : " + balance[i]);
        }
    }
}