package array;
//Sliding Window Approach Explanation:
//Goal: Find the maximum sum of any contiguous subarray of size k = 3.

//Why Sliding Window? Because instead of recomputing the sum
// every time (O(n*k)), we just subtract the element going
// out of the window and add the new one coming in (O(n)).

public class slidingWindow_maxSubArray {
    public static void main(String[] args) {
        int []arr={2, 1, 5, 1, 3, 2};
        int n= arr.length;
        int k=3;

        int sum=0;
        int largestSum=0;
//Calculate the sum of first window of size k
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        largestSum=sum;
        //
        // Slide the window from start to end of array
        for(int i=1;i<=n-k;i++){// Slide the window by removing the element going out and adding the new one
            sum=sum+arr[i+k-1]-arr[i-1];
            largestSum=Math.max(largestSum,sum);
        }
        System.out.println("max.sum of subarray is "+largestSum);
    }
}
