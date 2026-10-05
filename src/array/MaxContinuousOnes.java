package array;

public class MaxContinuousOnes {


        public static int findMaxConsecutiveOnes(int[] nums) {
            int left = 0, zeroCount = 0, maxLength = 0;

            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    zeroCount++;
                }

                while (zeroCount > 1) {
                    if (nums[left] == 0) {
                        zeroCount--;
                    }
                    left++;
                }

                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }

        public static void main(String[] args) {
            int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
            System.out.println("Maximum continuous 1's after replacing one 0: "
                    + findMaxConsecutiveOnes(arr));
        }
    }
//Time Complexity
//O(N) — Each element is processed at most twice (once by right, once by left).
//
//O(1) extra space.
//



