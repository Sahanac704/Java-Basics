import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;  // use long to avoid overflow for larger numbers

        for (int i = 1; i <= n; i++) {
            fact *= i;   // fact = fact * i
        }

        System.out.println("Factorial of " + n + " is: " + fact);

        sc.close();
    }
}
