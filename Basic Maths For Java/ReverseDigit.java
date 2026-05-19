/*
 Problem: Reverse the digits of a given number.

 Approach:
 - Extract last digit using modulus (%)
 - Add it to result after shifting previous digits
 - Remove last digit using division (/)
 - Repeat until number becomes 0
*/

public class ReverseDigit {

    // function to reverse digits of a number
    public static void reverseDigit(int num) {

        int ans = 0; // stores reversed number

        // process all digits
        while(num != 0){
            int digit = num % 10; // get last digit
            num = num / 10; // remove last digit
            ans = ans * 10 + digit; // build reversed number
        }

        System.out.println(ans); // final result
    }

    public static void main(String[] args) {
        int num = 12356; // sample input
        reverseDigit(num);
    }
}