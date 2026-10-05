package array;
import java.util.Arrays;

public class bitmaskingFindUniqueNumWNegativeNum {
    public static int uniqueNumber() {
        int[] arr = {-2, 1, 1, 1, -2, -2, 4};  // example input (3N+1 form)
        int[] freq = new int[32];  // 32 bits for Java int (signed 32-bit)

        // Step 1️⃣: count bits across all numbers
        for (int num : arr) {
            for (int bit = 0; bit < 32; bit++) {
                // (num >>> bit) shifts bits right *without* sign extension
                // & 1 extracts the bit at that position
                if (((num >>> bit) & 1) == 1) {
                    freq[bit]++;
                }
            }
        }

        // Step 2️⃣: rebuild the unique number
        int ans = 0;
        for (int bit = 0; bit < 32; bit++) {
            if (freq[bit] % 3 != 0) {    // this bit belongs to unique number
                ans |= (1 << bit);
            }
        }

        // Step 3️⃣: handle sign bit (for negative numbers)
        // If the 31st bit (sign bit) is set, interpret result as negative
        if ((ans & (1 << 31)) != 0) {
            ans -= (1L << 32);  // convert to negative equivalent
        }

        // Output
        System.out.println("Unique number: " + ans);
        System.out.println("Bit frequency array: " + Arrays.toString(freq));

        return ans;
    }

    public static void main(String[] args) {
        uniqueNumber();
    }
}
