package array;

import java.util.Arrays;
import java.util.Scanner;

public class prefixEvenRange {
    public static void main(String[] args) {
    //  Scanner sc = new Scanner(System.in);
//
//        // Input size of array
//        System.out.print("Enter number of elements (N): ");
//       int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

        int[]arr={1,3,6,4,2,4};
        int n= arr.length;
        // Build prefix sum for even indices
        int[] evenPrefixSum = new int[n];
        evenPrefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                evenPrefixSum[i] = evenPrefixSum[i - 1] + arr[i];
            } else {
                evenPrefixSum[i] = evenPrefixSum[i - 1];
            }
        }

        // Input number of queries
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of queries (Q): ");
        int q = sc.nextInt();

        System.out.println("Enter queries (L R):");
        for (int i = 0; i < q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();

            int sum = evenPrefixSum[R];
            if (L > 0) {
                sum -= evenPrefixSum[L - 1];
            }

            System.out.println("Sum of even indices from " + L + " to " + R + " = " + sum);
        }

        sc.close();
    }
}

