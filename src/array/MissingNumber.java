package array;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int N) {
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // missing number = 3
        int N = 6;

        int missing = findMissingNumber(arr, N);
        System.out.println("Missing number is: " + missing);
    }
}
