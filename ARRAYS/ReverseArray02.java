/*
 * Problem: Reverse an Array
 * Approach: Two Pointer Technique (In-place)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ReverseArray02 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int left = 0;
        int right = arr.length - 1;

        // Swap elements from both ends moving towards center
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}