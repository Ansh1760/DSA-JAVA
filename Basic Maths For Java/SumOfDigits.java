/*
 Problem: Find the sum of digits of a given number.

 Approach:
 - Extract last digit using modulus (%)
 - Add it to sum
 - Remove last digit using division (/)
 - Repeat until number becomes 0
*/

public class SumOfDigits {
   
    // function to calculate sum of digits
    public static void sumDigit(int n, int sum){
        
        // loop through all digits
        while(n != 0){
            int digit = n % 10; // get last digit
            n = n / 10; // remove last digit
            sum += digit; // add to sum
        }

        System.out.println(sum); // final result
    }

    public static void main(String[] args) {
        int n = 541235; // sample number
        int sum = 0;

        sumDigit(n, sum);
    }
}