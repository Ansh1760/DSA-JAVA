// Question: Write a Java program to find a target value in an array.

public class FindTarget {

    // Method to search target value
    public static boolean findval(int arr[], int target) {

        // Loop through array
        for (int i = 0; i < arr.length; i++) {

            // Check target
            if (arr[i] == target) {
                return true;
            }
        }

        // Return false if target not found
        return false;
    }

    public static void main(String[] args) {

        int arr[] = {1, 22, 14, 51, 42};

        int target = 23;

        // Method call
        boolean res = findval(arr, target);

        // Print result
        System.out.println(res);
    }
}