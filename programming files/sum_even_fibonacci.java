//bug introduced: LR
// This method sums the even terms of the Fibonacci sequence from 0 to 4,000,000
public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int sumEven = 0;
        while (b < 4000000) {
            if (b % 2 == 0) {
                sumEven += b;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732
