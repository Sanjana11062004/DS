import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        // Base case: If n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive step: Multiply n by the factorial of n-1
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }
}
