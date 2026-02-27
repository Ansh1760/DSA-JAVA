public class ArraySum {

    public static void main(String[] args) {

        int[] arr = {54, 43, 2, 1, 5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}