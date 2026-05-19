/*
 Problem: Print all digits of a given number.

 Approach:
 - Extract last digit using modulus (%)
 - Print it
 - Remove last digit using division (/)
 - Repeat until number becomes 0
*/

public class PrintDigits {

    // function to print each digit of a number
    public static void printDigit(int n){
        
        // loop runs until all digits are processed
        while(n != 0){
            int digit = n % 10; // get last digit
            System.out.println(digit);
            n = n / 10; // remove last digit
        }
    }

    public static void main(String[] args) {
        int n = 54785; // sample number
        printDigit(n);
    }
}