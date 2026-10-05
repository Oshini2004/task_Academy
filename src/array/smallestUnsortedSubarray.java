package array;

import java.util.Arrays;

public class smallestUnsortedSubarray {
    public static int[] findUnsortedSubarray(int[] arr) {
        int n = arr.length;
        int[] sortedArr = Arrays.copyOf(arr, n);
        Arrays.sort(sortedArr);

        int i = 0;
        while (arr[i] == sortedArr[i]) {
            i++;
        }

        int j= n - 1;
        while (arr[j] == sortedArr[j]) {
            j--;
        }
        System.out.println("value if i & j "+i+ " & " +j );

//        if (i == n) {
//            // The array is already sorted
//            return new int[]{0, 0};
//        }

        return new int[]{i,j};

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,10,11,7,12,7,7,16,18,19};
        int[] result = findUnsortedSubarray(arr);
        System.out.println("Subarray to be sorted lies between indices: " + result[0] + " and " + result[1]);
    }
}


