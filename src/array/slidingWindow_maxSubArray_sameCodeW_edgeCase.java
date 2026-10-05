package array;

public class slidingWindow_maxSubArray_sameCodeW_edgeCase{
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        // Edge case: if k > array length
        if (n < k) {
            System.out.println("Invalid input: k is larger than array size.");
            return -1;
        }

        // Step 1: Calculate the sum of first window of size k
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window from start to end of array
        for (int i = k; i < n; i++) {
            // Slide the window by removing the element going out and adding the new one
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of subarray of length " + k + " is: " + result);
    }
}
//Step-by-Step Walkthrough:
//Compute sum of the first 3 elements → store in windowSum
//
//Loop from index 3 to end of array:
//
//Subtract the element at the start of the previous window (arr[i-k])
//
//Add the current element (arr[i])
//
//Update maxSum if windowSum is greater
//

