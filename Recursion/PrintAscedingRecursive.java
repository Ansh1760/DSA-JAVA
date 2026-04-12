// Program to print numbers from 1 to N using recursion
// Author: Ashwini

public class PrintAscedingRecursive {

    /**
     * Function to print numbers from n to N-1
     * @param n current number
     * @param N limit (exclusive)
     */
    public static void printNum(int n, int N) {

        // Base case: stop when n reaches N
        if (n == N) {
            return;
        }

        // Print current number
        System.out.println(n);

        // Recursive call: move to next number
        printNum(n + 1, N);
    }

    public static void main(String[] args) {

        // Starting number
        int n = 1;

        // Ending limit (exclusive)
        int N = 11;

        // Function call
        printNum(n, N);
    }
}