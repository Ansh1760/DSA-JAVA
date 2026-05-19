/*
===========================================================
🟢 Question: Bubble Sort Implementation in Java

Write a Java program to sort an array of integers using 
the Bubble Sort algorithm.

👉 Bubble Sort Logic:
- Compare adjacent elements
- Swap them if they are in the wrong order
- After each pass, the largest element moves to the end

Example:
Input:  {7, 8, 3, 1, 2}
Output: {1, 2, 3, 7, 8}

Time Complexity:
- Worst Case: O(n^2)
- Average Case: O(n^2)
- Best Case (Optimized): O(n)

===========================================================
*/

public class BubbleSortArray {
   public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
   }
    public static void main(String[] args) {

        // 🔹 Input array
        int[] arr = {7, 8, 3, 1, 2};

        // 🔹 Outer loop: number of passes
        for (int i = 0; i < arr.length - 1; i++) {

         

            // 🔹 Inner loop: compare adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // 🔸 Condition: swap only if elements are in wrong order
                if (arr[j] > arr[j + 1]) {

                    // 🔸 Swapping logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                   
                }
            }

           
        }

        // 🔹 Print sorted array
       printArray(arr);
    }
}