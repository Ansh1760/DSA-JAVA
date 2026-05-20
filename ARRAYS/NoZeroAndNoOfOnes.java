// Question: Write a Java program to count number of 0s and 1s in an array.

public class NoZeroAndNoOfOnes {

    // Method to count zeros and ones
    public static void CalcZeros(int arr[]) {

        int zeros = 0;
        int ones = 0;

        // Loop through array
        for (int i : arr) {

            // Check for 0
            if (i == 0) {
                zeros++;
            }

            // Check for 1
            if (i == 1) {
                ones++;
            }
        }

        // Print counts
        System.out.println("Zeros = " + zeros);
        System.out.println("Ones = " + ones);
    }

    public static void main(String[] args) {

        // Array elements
        int arr[] = {1, 1, 0, 1, 1, 0, 1, 0};

        // Method call
        CalcZeros(arr);
    }
}