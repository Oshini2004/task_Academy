package array;

import java.util.Scanner;

public class Equilibrium_index {
    public static int countEquilibriumIndices(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int count = 0;

        // Calculate total sum of the array
        for (int num=0;num< arr.length;num++) {
            totalSum +=arr[num];
        }

        // Traverse and check for equilibrium index
        for (int i = 0; i < arr.length; i++) {
            // Right sum = totalSum - leftSum - current element
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                count++;
            }

            leftSum += arr[i]; // Update left sum for next iteration
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int result = countEquilibriumIndices(arr);
        System.out.println("Number of equilibrium indices: " + result);
    }
}