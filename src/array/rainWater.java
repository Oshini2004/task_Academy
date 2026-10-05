package array;

public class rainWater {
    static int maxWater(int[] arrheight) {
        int n = arrheight.length;
       // if (n <= 2) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // fill leftMax: leftMax[i] = max height from 0..i
        leftMax [0]= arrheight[0];
        rightMax[n - 1] = arrheight[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arrheight[i]);
        }

        // fill rightMax: rightMax[i] = max height from i..n-1
       // rightMax[n - 1] = arrheight[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arrheight[i]);
        }

        // accumulate water
        int water = 0;
        for (int i = 1; i < n - 1; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - arrheight[i];
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(maxWater(arr)); // prints 9
    }
}
