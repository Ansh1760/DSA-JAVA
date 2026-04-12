// Program to calculate x^n using recursion
// Example: 2^3 = 2 * 2 * 2

public class CalcPower {

    // This function calculates x raised to the power n
    public static int calpow(int x, int n) {

        // if base is 0, result will always be 0
        if (x == 0) {
            return 0;
        }

        // anything raised to power 0 is 1
        if (n == 0) {
            return 1;
        }

        // first calculate power for (n-1)
        int calNm1 = calpow(x, n - 1);

        // multiply current x with previous result
        int xPow = x * calNm1;

        // return the final value
        return xPow;
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 9;

        // calling the function
        int result = calpow(x, n);

        // printing the result
        System.out.println(result);
    }
}