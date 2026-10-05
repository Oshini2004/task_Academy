package hashing;
import java.util.HashMap;

public class pairsumScaler_cornerCase {
    public static boolean hashPairWithSum(int[] arr, int k) {
        // Step 1: Store frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check for pairs
        for (int num : arr) {
            int complement = k - num;

            if (num != complement) {
                // Case 1: Normal pair (different numbers)
                if (map.containsKey(complement)) {
                    return true;
                }
            } else {
                // Case 2: Special case where num == complement
                // e.g., num = 5, complement = 5, need at least 2 occurrences
                if (map.get(num) >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    // Driver
    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15};
        int k1 = 9;
        System.out.println(hashPairWithSum(arr1, k1)); // true (2+7)

        int[] arr2 = {5, 5, 3,9};
        int k2 = 10;
        System.out.println(hashPairWithSum(arr2, k2)); // true (5+5)

        int[] arr3 = {1, 2, 3, 4};
        int k3 = 10;
        System.out.println(hashPairWithSum(arr3, k3)); // false
    }
}
