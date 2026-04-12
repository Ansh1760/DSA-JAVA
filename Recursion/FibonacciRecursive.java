// Program to print Fibonacci series using Recursion
// Author: Ashwini
// Description: This program prints first N Fibonacci numbers using recursion

public class FibonacciRecursive {

    /**
     * Function to print Fibonacci series recursively
     * @param a first number
     * @param b second number
     * @param n number of remaining terms to print
     */
    public static void printFib(int a, int b, int n) {

        // Base case: stop when no terms are left
        if (n == 0) {
            return;
        }

        // Calculate next Fibonacci number
        int c = a + b;

        // Print the next number
        System.out.println(c);

        // Recursive call: move forward in the series
        printFib(b, c, n - 1);
    }

    public static void main(String[] args) {

        // Initial Fibonacci numbers
        int a = 0;
        int b = 1;

        // Print first two numbers manually
        System.out.println(a);
        System.out.println(b);

        // Total number of terms required
        int n = 7;

        // Call recursive function for remaining terms
        printFib(a, b, n - 2);
    }
}