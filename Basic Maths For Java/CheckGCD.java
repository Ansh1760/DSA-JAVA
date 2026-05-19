/*
 Problem: Find GCD (Greatest Common Divisor) of two numbers.

 Approach:
 - Use Euclid's Algorithm
 - Replace (a, b) with (b, a % b)
 - Repeat until b becomes 0
*/

public class CheckGCD {

    // function to calculate GCD
    public static int checkGCD(int a, int b){

        // apply Euclid's algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a; // final GCD
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 6;

        int ans = checkGCD(a, b);
        System.out.println(ans); // print result
    }
}