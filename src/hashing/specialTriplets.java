package hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class specialTriplets {
    public static int CountspecialTriplets(int[] nums) {
        int n = nums.length;
        long mod = (long)1e9 + 7;
        long result = 0;

        Map<Long, Long> left = new HashMap<>();
        Map<Long, Long> right = new HashMap<>();

        // initialize right map with frequency of all elements
        for (int num : nums) {
            right.put((long)num, right.getOrDefault((long)num, 0L) + 1);
        }

        for (int j = 0; j < n; j++) {
            long x = nums[j];

            // move current element from right to left
            right.put(x, right.get(x) - 1);
            if (right.get(x) == 0) right.remove(x);

            long target = x * 2;

            long leftCount = left.getOrDefault(target, 0L);
            long rightCount = right.getOrDefault(target, 0L);

            result = (result + (leftCount * rightCount) % mod) % mod;

            // add current element to left map
            left.put(x, left.getOrDefault(x, 0L) + 1);
        }

        return (int)result;
    }

    public static void main(String[] args) {
        int[]nums={8,4,2,4,8,6};
       int res =CountspecialTriplets(nums);
        System.out.println(res);

    }
}




