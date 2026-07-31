import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Units");
        int Units = sc.nextInt();
        double bill ;

        if (Units <= 100){
            bill = Units * 0.50;
        } else if (Units <= 200){
            bill = ( 100 * 0.50 )+( (Units-100) * 0.75 );
        } else {
            bill = (100 * 0.50 )+(100 * 0.75)+( (Units-200) * 1.20 );
        }

        System.out.println("Total Bill = " + bill);
    }

        }

