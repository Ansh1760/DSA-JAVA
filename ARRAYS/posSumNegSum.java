// Question: Write a Java program to find the sum of positive and negative numbers in an array.

public class posSumNegSum {

    // Method to calculate positive and negative sums
    public static void SumCalc(int arr[]) {

        int posSum = 0;
        int negSum = 0;

        // Loop through array
        for (int i = 0; i < arr.length; i++) {

            // Add positive numbers
            if (arr[i] > 0) {
                posSum += arr[i];
            }

            // Add negative numbers
            if (arr[i] < 0) {
                negSum += arr[i];
            }
        }

        // Print sums
        System.out.println(posSum);
        System.out.println(negSum);
    }

    public static void main(String[] args) {

        // Array elements
        int arr[] = {1, -54, 41, -102 - 5, 45, -5};

        // Method call
        SumCalc(arr);
    }
}