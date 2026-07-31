import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of Meal1 : ");
        double Meal1 = sc.nextDouble();

        System.out.println("Enter the price of Meal2 :");
        double Meal2 = sc.nextDouble();

        System.out.println("Enter the price of Meal3");
        double Meal3 = sc.nextDouble();

        double TotalPrice =  Meal1 + Meal2 + Meal3;
        double VAT = TotalPrice * 0.14;
        double FinalPrice = TotalPrice + VAT;

        System.out.println("\n===== Restaurant Bill =====");
        System.out.println("Total Price = " + TotalPrice);
        System.out.println("VAT = " + VAT);
        System.out.println("Final Price = " + FinalPrice );
        System.out.println("============================");
    }
}