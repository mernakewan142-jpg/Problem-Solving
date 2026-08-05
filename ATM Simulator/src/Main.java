import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static double balance = 0;
    static String history = "";

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    deposit();
                    break;

                case 2:
                    withdraw();
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    showHistory();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while (choice != 5);

    }

    public static void deposit() {

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        balance += amount;

        history += "Deposit: +" + amount + "\n";

        System.out.println("Deposit Successful.");

    }

    public static void withdraw() {

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        if (amount <= balance) {

            balance -= amount;

            history += "Withdraw: -" + amount + "\n";

            System.out.println("Withdrawal Successful.");

        } else {

            System.out.println("Insufficient Balance");

        }

    }

    public static void checkBalance() {

        System.out.println("Current Balance = " + balance);

    }

    public static void showHistory() {

        if (history.equals("")) {

            System.out.println("No Transactions Yet.");

        } else {

            System.out.println(history);

        }

    }

}