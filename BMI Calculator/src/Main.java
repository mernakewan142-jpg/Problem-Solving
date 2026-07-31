import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight (kg) : ");
        double weight = sc.nextDouble();

        System.out.println("Enter your height (m) :");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("BMI = " + BMI);

        if (BMI < 18.5) {
            System.out.println("Underweight");

        } else if (BMI < 25) {
            System.out.println("Normal");

        } else if (BMI < 30) {
            System.out.println("Overweight");

        } else {
            System.out.println("Obese");
        }
    }
        }
