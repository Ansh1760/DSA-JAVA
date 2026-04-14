/*
 Problem: Find LCM (Least Common Multiple) of two numbers.

 Approach:
 - First find GCD using Euclid's Algorithm
 - Then use formula: LCM = (a * b) / GCD
*/

public class Lcm {

    // function to calculate GCD
    public static int findGCD(int a, int b){

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        
        int a = 45;
        int b = 54;

        int gcd = findGCD(a, b); // get GCD
        int lcm = (a * b) / gcd; // calculate LCM

        System.out.println(lcm);
    }
}