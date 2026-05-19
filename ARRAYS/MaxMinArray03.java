public class MaxMinArray03 {
    public static void main(String[] args) {
        int[] arr = {4,8,7,8,9,1};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("maximum"+max);
        System.out.println("minimum"+min);
    }
}
