
import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of A");
        int A = sc.nextInt();

        System.out.println("Enter the Value of B");
        int B = sc.nextInt();

        System.out.println("Enter the Value of C");
        int C = sc.nextInt();

        if (A <= B && A <= C) {
            System.out.println("THE MINIMUM VALUE IS A: " + A);
        } else if (B <= A && B <= C) {
            System.out.println("THE MINIMUM VALUE IS B: " + B);
        } else {
            System.out.println("THE MINIMUM VALUE IS C: " + C);
        }

        sc.close();
    }
}
