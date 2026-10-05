package array;

public class SmallestUnsortedSubarray_wBestTimeComp {
    public static int[] findUnsortedSubarray(int[] arr) {
        int n = arr.length;
        int s = 0, e = n - 1;

        // Step 1: find initial breakpoints
        while (s < n - 1 && arr[s] <= arr[s + 1]) s++;
        if (s == n - 1) {
            // already sorted
            return new int[]{0, 0};
        }
        while (e > 0 && arr[e] >= arr[e - 1]) e--;

        // Step 2: find min and max in the subarray
        int subMin = arr[s], subMax = arr[s];
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < subMin) subMin = arr[i];
            if (arr[i] > subMax) subMax = arr[i];
        }

        // Step 3: expand left
        while (s > 0 && arr[s - 1] > subMin) s--;
        // expand right
        while (e < n - 1 && arr[e + 1] < subMax) e++;

        return new int[]{s, e};
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        int[] result = findUnsortedSubarray(arr);
        System.out.println("Subarray to sort: indices " + result[0] + " to " + result[1]);
        // Expected output: indices 2 to 5
    }
}

