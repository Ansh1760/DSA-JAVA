public class PrintAlternative {

    public static void main(String[] args) {

        // Question:
        // Print extreme elements of the array in alternate order

        int arr[] = {1, 2, 3, 4, 5, 6};

        // Example Output:
        // 1 6 2 5 3 4

        // Pointer for starting index
        int start = 0;

        // Pointer for ending index
        int end = arr.length - 1;

        // Loop until start crosses end
        while (start <= end) {

            // Print element from start
            System.out.print(arr[start] + " ");
            start++;

            // Print element from end
            if (start <= end) {
                System.out.print(arr[end] + " ");
                end--;
            }
        }
    }
}