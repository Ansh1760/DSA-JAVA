public class FindAvg {
    public static  void findaverage(int arr[]){
       int sum = 0;
       for(int i : arr){
        sum+=i;
       }
       int size = arr.length;
       double avg = sum/size;
       System.out.println(avg);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        findaverage(arr);
    }
}
