import java.util.Arrays;
import java.util.Scanner;

public class KthMinMax {

    public static void main(String[] args) {

        int[] arr = {4, 8, 5, 9, 85, 7, 8};

        Arrays.sort(arr);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter k value: ");
        int k = sc.nextInt();

        if(k <= 0 || k > arr.length) {
            System.out.println("Invalid k");
            return;
        }

        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];

        System.out.println("Kth Minimum: " + kthMin);
        System.out.println("Kth Maximum: " + kthMax);

        sc.close();
    }
}