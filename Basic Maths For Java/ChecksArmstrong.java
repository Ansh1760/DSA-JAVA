public class ChecksArmstrong {
    public static void main(String[] args) {

        int n = 153; // sample input
        int original = n;
        int sum = 0;

        // process each digit
        while (n > 0) {
            int digit = n % 10; // get last digit
            sum = sum + (digit * digit * digit); // cube and add
            n = n / 10; // remove last digit
        }

        // check condition
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    } 
}
