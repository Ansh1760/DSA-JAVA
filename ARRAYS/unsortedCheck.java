// Question: Write a Java program to check whether an array is sorted or not.

public class unsortedCheck {

    // Method to check sorted array
    public static void unSortedCheck(int arr[]) {

        // Loop till second last element
        for (int i = 0; i < arr.length - 1; i++) {

            // Check if current element is greater
            if (arr[i] > arr[i + 1]) {

                System.out.println("Array is Unsorted"+ " "+ "at location" + " "+ arr[i+1]);
                return;
            }
        }

        // If no unsorted pair found
        System.out.println("Array is Sorted");
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 4, 5, 2, 9};

        // Method call
        unSortedCheck(arr);
    }
}