package hashing;

import java.util.HashSet;

public class missingNum {
    public static int NumMissing(int[]arr,int N){
        HashSet<Integer>set=new HashSet<>();

        // Step 1: Add all elements of the array to the HashSet
        for (int num : arr) {
            set.add(num);
        }

        // Step 2: Check which number from 1 to N is missing
        for (int i = 1; i <= N; i++) {
            if (!set.contains(i)) {
                return i;  // Missing number found
            }
        }

        return -1; // In case no number is missing (shouldn't happen normally)
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // missing = 3
        int N = 5;

        int missing = NumMissing(arr, N);
        System.out.println("Missing number is: " + missing);
    }
}
