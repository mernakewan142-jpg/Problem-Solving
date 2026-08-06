import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static int[] id = new int[100];
    static String[] name = new String[100];
    static double[] salary = new double[100];
    static int count = 0;

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    searchEmployee();
                    break;

                case 3:
                    updateSalary();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    displayEmployees();
                    break;

                case 6:
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while (choice != 6);

    }

    public static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        id[count] = input.nextInt();

        input.nextLine();

        System.out.print("Enter Employee Name: ");
        name[count] = input.nextLine();

        System.out.print("Enter Salary: ");
        salary[count] = input.nextDouble();

        count++;

        System.out.println("Employee Added Successfully.");

    }

    public static void searchEmployee() {

        System.out.print("Enter Employee ID: ");
        int searchId = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (id[i] == searchId) {

                System.out.println("ID: " + id[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Salary: " + salary[i]);

                return;
            }

        }

        System.out.println("Employee Not Found.");

    }

    public static void updateSalary() {

        System.out.print("Enter Employee ID: ");
        int searchId = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (id[i] == searchId) {

                System.out.print("Enter New Salary: ");
                salary[i] = input.nextDouble();

                System.out.println("Salary Updated Successfully.");

                return;
            }

        }

        System.out.println("Employee Not Found.");

    }

    public static void deleteEmployee() {

        System.out.print("Enter Employee ID: ");
        int searchId = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (id[i] == searchId) {

                for (int j = i; j < count - 1; j++) {

                    id[j] = id[j + 1];
                    name[j] = name[j + 1];
                    salary[j] = salary[j + 1];

                }

                count--;

                System.out.println("Employee Deleted Successfully.");

                return;
            }

        }

        System.out.println("Employee Not Found.");

    }

    public static void displayEmployees() {

        if (count == 0) {

            System.out.println("No Employees.");

            return;
        }

        System.out.println("\n===== Employees =====");

        for (int i = 0; i < count; i++) {

            System.out.println("----------------------");
            System.out.println("ID: " + id[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Salary: " + salary[i]);

        }

    }

}