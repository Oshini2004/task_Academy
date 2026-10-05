package array_2Darray.java;

public class PrefixSum2DQuery {

        public static void main(String[] args) {
            // Step 1: Input 2D matrix
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int rows = matrix.length;
            int cols = matrix[0].length;

            // Step 2: Create prefix sum matrix
            int[][] prefixSum = new int[rows][cols];

            // Step 3: Compute prefix sums (O(n * m) time)
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    prefixSum[i][j] = matrix[i][j];

                    if (i > 0)
                        prefixSum[i][j] += prefixSum[i - 1][j];

                    if (j > 0)
                        prefixSum[i][j] += prefixSum[i][j - 1];

                    if (i > 0 && j > 0)
                        prefixSum[i][j] -= prefixSum[i - 1][j - 1];
                }
            }

            // Step 4: Define the submatrix you want to query (top-left to bottom-right)
            int r1 = 1, c1 = 1, r2 = 2, c2 = 2;
            // Submatrix is:
            // 5 6
            // 8 9

            // Step 5: Use the prefix sum to calculate submatrix sum
            int submatrixSum = getSubmatrixSum(prefixSum, r1, c1, r2, c2);

            System.out.println("Sum of submatrix from (" + r1 + "," + c1 + ") to (" + r2 + "," + c2 + ") is: " + submatrixSum);
        }

        // Helper method to query submatrix sum using prefix sum
        public static int getSubmatrixSum(int[][] prefixSum, int r1, int c1, int r2, int c2) {
            int total = prefixSum[r2][c2];

            if (r1 > 0)
                total -= prefixSum[r1 - 1][c2];

            if (c1 > 0)
                total -= prefixSum[r2][c1 - 1];

            if (r1 > 0 && c1 > 0)
                total += prefixSum[r1 - 1][c1 - 1];

            return total;
        }
    

}
