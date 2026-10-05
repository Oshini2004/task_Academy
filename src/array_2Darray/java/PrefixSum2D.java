package array_2Darray.java;

public class PrefixSum2D {

        public static void main(String[] args) {
            // Step 1: Define your original matrix
            int[][] matrix = {
                    {1, 2, 3},
                    {2, 1, 1},
                    {1, 2, 1}
            };

            // Step 2: Get number of rows and columns
            int rows = matrix.length;
            int cols = matrix[0].length;

            // Step 3: Create a 2D prefix sum matrix of same size
            int[][] prefixSum = new int[rows][cols];

            // Step 4: Build the prefix sum matrix using optimal approach
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // Start with the current matrix value
                    prefixSum[i][j] = matrix[i][j];

                    // Add value from top cell if it exists
                    if (i > 0)
                        prefixSum[i][j] += prefixSum[i - 1][j];

                    // Add value from left cell if it exists
                    if (j > 0)
                        prefixSum[i][j] += prefixSum[i][j - 1];

                    // Subtract value from top-left cell (already counted twice)
                    if (i > 0 && j > 0)
                        prefixSum[i][j] -= prefixSum[i - 1][j - 1];
                }
            }

            // Step 5: Print the prefix sum matrix
            System.out.println("Prefix Sum Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(prefixSum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


