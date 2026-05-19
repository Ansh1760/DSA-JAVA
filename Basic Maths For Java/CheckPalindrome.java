/*
 Problem: Check whether a number is palindrome or not.

 Approach:
 - Reverse the number
 - Compare original number with reversed number
*/

public class CheckPalindrome {

    // function to check palindrome
    public static void palindrome(int num) {

        int original = num; // store original number
        int reversedNum = 0;

        // reverse the number
        while(num != 0){
            int digit = num % 10; // get last digit
            reversedNum = reversedNum * 10 + digit;
            num = num / 10; // remove last digit
        }

        // compare original and reversed
        if(reversedNum == original){
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }

    public static void main(String[] args) {
        int num = 1221; // sample input
        palindrome(num);
    }
}