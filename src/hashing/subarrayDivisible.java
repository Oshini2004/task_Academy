package hashing;
import java.util.HashMap;
import java.util.Map;

public class subarrayDivisible {

        /**
         * Finds and prints any non-empty subarray whose sum % M == 0.
         * If found, prints start and end indices (0-based) and the elements.
         * If none found, prints a message.
         */
        public static void printAnySubarrayDivisible(int[] arr, int M) {


            int n = arr.length;
            Map<Integer, Integer> hm = new HashMap<>(); // modulo -> first index where it appeared
            int prefix = 0;

            // We store modulo 0 seen at index -1 to allow prefix itself to be valid subarray from 0..i
            hm.put(0, -1);

            for (int i = 0; i < n; i++) {
                prefix = prefix + arr[i];
                // normalize modulo to be in [0, M-1], handles negative numbers correctly
                int mod = ((prefix % M) + M) % M;

                if (hm.containsKey(mod)) {
                    int start = hm.get(mod) + 1;
                    int end = i;
                    System.out.printf("Found subarray with sum %% %d == 0: indices [%d .. %d]\n", M, start, end);
                    System.out.print("Elements: ");
                    for (int k = start; k <= end; k++) {
                        System.out.print(arr[k] + (k == end ? "\n" : " "));
                    }
                    return;
                } else {
                    hm.put(mod, i);
                }
            }

            System.out.println("No non-empty subarray found with sum % " + M + " == 0");
        }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, -6};
        int M = arr.length; // you can change M to any positive integer
        printAnySubarrayDivisible(arr, M);

        // Other demo:
        int[] arr2 = {5, 7, 2, 9};
        int M2 = 5; // arbitrary modulus
        printAnySubarrayDivisible(arr2, M2);

        int []arr3={3,2,4,7,6,1,8};
        int M3= 7;
        printAnySubarrayDivisible(arr3,M3);
    }

}