import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer Number");
        int num = sc.nextInt();

        for (int i = num ; i >= 0 ; i--){
            System.out.println(i);
        }
        System.out.println("Blast Off");
    }
}