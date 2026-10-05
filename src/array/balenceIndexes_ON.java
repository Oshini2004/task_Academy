package array;

public class balenceIndexes_ON {



        public static int countIndices(int[] arr) {
            int n = arr.length;

            // Step 1: calculate prefix sums
            int[] evenSum = new int[n];
            int[] oddSum = new int[n];

            evenSum[0] = arr[0];
            oddSum[0] = 0;

            for (int i = 1; i < n; i++) {
                evenSum[i] = evenSum[i - 1];
                oddSum[i] = oddSum[i - 1];
                if (i % 2 == 0) {
                    evenSum[i] += arr[i];
                } else {
                    oddSum[i] += arr[i];
                }
            }

            int count = 0;

            // Step 2: iterate through each index
            for (int i = 0; i < n; i++) {
                int leftEven = (i > 0) ? evenSum[i - 1] : 0;
                int leftOdd = (i > 0) ? oddSum[i - 1] : 0;
                int rightEven = evenSum[n - 1] - evenSum[i];
                int rightOdd = oddSum[n - 1] - oddSum[i];

                int newEven, newOdd;

                if (i % 2 == 0) {
                    newEven = leftEven + rightOdd;
                    newOdd = leftOdd + rightEven;
                } else {
                    newEven = leftEven + rightEven;
                    newOdd = leftOdd + rightOdd;
                }

                if (newEven == newOdd) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            int[] arr = {2, 1, 6, 4};
            int result = countIndices(arr);
            System.out.println("Count of indices: " + result);
        }
    }


