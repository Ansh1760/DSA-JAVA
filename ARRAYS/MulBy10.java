// Question: Write a Java program to multiply each element of an array by 10.

public class MulBy10 {

    // Method to multiply each array element by 10
    public static int[] MultiplyTen(int arr[]) {

        // New array to store updated values
        int newArr[] = new int[arr.length];

        // Loop through original array
        for (int i = 0; i < arr.length; i++) {

            // Multiply each element by 10
            newArr[i] = arr[i] * 10;
        }

        // Return updated array
        return newArr;
    }

    public static void main(String[] args) {

        // Original array
        int arr[] = {1, 2, 3, 4, 5};

        // Calling method
        int result[] = MultiplyTen(arr);

        // Printing new array
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}