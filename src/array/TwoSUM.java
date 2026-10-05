package array;

import java.util.HashMap;


public class TwoSUM {

        public static int[] twoSum(int[] nums, int target) {
            // Create a HashMap to store (value -> index)
            // It helps us quickly check if we've seen the complement before.
            HashMap<Integer, Integer> map = new HashMap<>();

            // Loop through each element in the array
            for (int i = 0; i < nums.length; i++) {
                // Find the number we need to reach the target
                int complement = target - nums[i];

                // Check if the complement already exists in the map
                if (map.containsKey(complement)) {
                    // If yes, return the index of complement and current index
                    return new int[]{map.get(complement), i};
                }

                // If not found, store the current number and its index
                // So we can check it later when needed as a complement
                map.put(nums[i], i);
            }

            // If no pair found (theoretically shouldn't happen per problem)
            return new int[]{};
        }

        public static void main(String[] args) {
            // Example input
            int[] nums = {2, 11, 15,7};
            int target = 9;

            // Call the function
            int[] result = twoSum(nums, target);

            // Print the result indices
            System.out.println( result[0] + ", " + result[1] );
        }
    }

