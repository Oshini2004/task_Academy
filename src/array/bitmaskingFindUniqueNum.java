package array;

import java.util.Arrays;

public class bitmaskingFindUniqueNum {

        // This method implements the bit-count (mod 3) approach to find
        // the number that appears once while all others appear three times.
        public static int uniqueNumber() {
            int[] arr = {6,5,8,7,7,8,8,5,2,5,6,6,7}; // example input
            int n = arr.length;

            // freq[i] will store how many numbers in the array have bit i = 1
            int[] freq = new int[n];

            // For every number in the array, extract bits and add to freq[]
            for (int num : arr) {
                int j = 0; // j is the bit-position index (0 => LSB)
                // extract every bit of 'num' and add it to freq[j]
                // NOTE: this while loop (num > 0) only processes positive bits.
                // For negative numbers it will stop early because num becomes negative.
                // We'll show a safer alternative after this block.
                while (num > 0) {
                    int lastBit = (num & 1); // get least significant bit
                    if (lastBit == 1) {
                        freq[j]++;          // increment count for bit-position j
                    }
                    j++;                    // move to next bit position
                    num = num >> 1;        // right-shift number to process next bit
                }
                // when while ends, we have added this number's set-bits into freq[]
            }

            // Reconstruct the unique number from freq[] using modulo 3 logic
            int p = 1;  // p holds power-of-two for current bit (1<<0, 1<<1, ...)
            int ans = 0;
            for (int num : freq) {
                // If bit count at this position % 3 != 0 it means the unique number
                // has a 1 at this bit-position.
                ans = ans + (num % 3) * p;
                p = p << 1; // move to next bit's place value
            }

            System.out.println(ans);                // print the unique number
            System.out.println(Arrays.toString(freq)); // print bit counts for debugging
            return ans; // original function returns 1 in your snippet (unused)
        }

        public static void main(String[] args) {
            uniqueNumber();
        }
    }
