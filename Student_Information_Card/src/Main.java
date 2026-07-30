import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Full Name : ");
        String Name = sc.nextLine();

        System.out.println("Enter Your Age : ");
        int Age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Your University : ");
        String University = sc.nextLine();

        System.out.println("Enter Your GPA");
        double GPA = sc.nextDouble();


    }
}

