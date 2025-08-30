import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input: how many terms
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;  // first two terms

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");  // print current term

            // generate next term
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}

