import java.util.*;

/*
 * ============================================================
 * 🧩 Problem: Find Element Index in a 2D Array
 * ============================================================
 *
 * 📌 Problem Statement:
 * Write a Java program to:
 * 1. Take input for number of rows and columns.
 * 2. Input elements of a 2D array (matrix).
 * 3. Take an integer X as input.
 * 4. Search for X in the matrix.
 * 5. If found, print its index (row, column).
 * 6. If not found, print "Item not found".
 *
 * 📥 Example Input:
 * Rows = 2, Cols = 3
 * Matrix:
 * 1 2 3
 * 4 5 6
 * X = 5
 *
 * 📤 Output:
 * Item found at index 1 1
 *
 * 🧠 Approach:
 * - Traverse the matrix using nested loops.
 * - Compare each element with X.
 * - If match found → print index and stop.
 *
 * ⏱ Time Complexity: O(n * m)
 * ⛓ Space Complexity: O(1)
 *
 * ============================================================
 */

public class FindIdxProblem {

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Input number of columns
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare 2D array
        int[][] numbers = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Input element to search
        System.out.print("Enter element to find: ");
        int x = sc.nextInt();

        // Flag to check if element is found
        boolean found = false;

        // Traverse the matrix to search element
        outer:
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                // Check if current element matches X
                if (numbers[i][j] == x) {
                    System.out.println("Item found at index " + i + " " + j);
                    found = true;

                    // Exit both loops once found
                    break outer;
                }
            }
        }

        // If element not found
        if (!found) {
            System.out.println("Item not found");
        }

        
        sc.close();
    }
}