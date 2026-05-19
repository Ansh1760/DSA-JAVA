/*
 Problem: Check whether a number is prime or not.

 Approach:
 - A prime number has only 2 factors: 1 and itself
 - Check divisibility from 2 to n-1
 - If divisible by any number → not prime
*/

public class CheckPrimeOrNot {

    // function to check prime number
    public static boolean isPrimeNum(int num) {

        if(num <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i <= num - 1; i++) {
            if(num % i == 0){
                return false; // found a divisor
            }
        }

        return true; // no divisors found
    }

    public static void main(String[] args) {
        int num = 5; // sample input
        boolean ans = isPrimeNum(num);
        System.out.println(ans);
    }
}