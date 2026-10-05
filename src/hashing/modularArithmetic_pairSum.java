package hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class modularArithmetic_pairSum{
    public static int countPairs(int[] arr, int M) {
        Map<Integer, Integer> mapfreq = new HashMap<>();

        // Step 1: build remainder frequency map
        for (int x : arr) {
            int r = ((x % M) + M) % M; // safe for negatives
            mapfreq.put(r, mapfreq.getOrDefault(r, 0) + 1);//to safely increase frequency even if the key doesn’t exist yet//avoids null values

        }

        int ans = 0;

        // Case 1: remainder 0 (pairs inside this group)
        int f0 = mapfreq.getOrDefault(0, 0);
        ans += f0 * (f0 - 1) / 2;

        // Case 2: pairs (r, M-r)
        for (int r = 1; r < M; r++) {
            int complement = M - r;

            // Only count each pair once → ensure r < complement
            if (complement <= r) break;

            int fr = mapfreq.getOrDefault(r, 0);//fr=how many no. have remender r
            int fc = mapfreq.getOrDefault(complement, 0);//fc=remender M-r

            ans += fr * fc;
        }

        // Case 3: if M even → remainder M/2 pairs
        if (M % 2 == 0) {
            int fMid = mapfreq.getOrDefault(M / 2, 0);
            ans += fMid * (fMid - 1) / 2;
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 4};
        int M = 5;

        System.out.println(countPairs(arr, M)); // Output: 2
    }
}



