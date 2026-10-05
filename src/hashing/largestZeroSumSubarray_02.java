package hashing;
import java.util.Arrays;
import java.util.HashMap;

public class largestZeroSumSubarray_02 {
    public static int maxlength(int[] arr, int n) {
        HashMap<Integer, Integer> hash = new HashMap<>(); // prefixSum -> first index where it appeared
        int max = 0;   // best length found
        int sum = 0;   // running prefix sum

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If prefix sum is zero, subarray 0..i sums to 0, length = i+1
            if (sum == 0) {
                max = Math.max(max, i + 1);
            }

            // If we've seen this prefix sum before, subarray (prevIndex+1)..i sums to 0
            if (hash.containsKey(sum)) {
                int prevIndex = hash.get(sum);
                max = Math.max(max, i - prevIndex);
            } else {
                // store only the first occurrence of this prefix sum
                hash.put(sum, i);
            }
        }
        return max;
    }

    // small test
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -4, 1,2 ,6};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Longest zero-sum subarray length = " + maxlength(arr, arr.length));
        // expected output: 5
    }
}
