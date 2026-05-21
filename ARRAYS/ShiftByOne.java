    // Question:
    // Shift all elements of the array by one position to the right

public class ShiftByOne {
    public static void main(String[] args) {

        

        int arr[] = {1, 2, 3, 4, 5, 6};

        // Store the last element
        int last = arr[arr.length - 1];

        // Shift elements one step to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Put the last element at first position
        arr[0] = last;

        // Print the updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}