import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumEven = 0, sumOdd = 0;
        for (int i = 1; i <= n; i++) { // start from 1 (not 0)
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        // Euclidean algorithm
        int a = sumEven, b = sumOdd;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of Even sum and Odd sum = " + a);
    }
}
