// Program to find factorial using recursion

public class FactorialRecursive {

    /**
     * Function to calculate factorial
     * @param n number
     * @return factorial of n
     */
    public static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        int result = factorial(n);

        System.out.println("Factorial of " + n + " is: " + result);
    }
}
