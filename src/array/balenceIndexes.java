package array;

public class balenceIndexes {


        public static int countIndices(int[] arr) {
            int n = arr.length;
            int count = 0;
            for (int i = 0; i < n; i++) {
                // Create a temporary array excluding index i
                int[] temp = new int[n - 1];
                int index = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        temp[index] = arr[j];
                        index++;
                    }
                }

                // Calculate sums of even and odd indexed elements
                int sum_even = 0;
                int sum_odd = 0;
                for (int j = 0; j < temp.length; j++) {
                    if (j % 2 == 0) {
                        sum_even += temp[j];
                    } else {
                        sum_odd += temp[j];
                    }
                }

                // Check if even and odd sums are equal
                if (sum_even == sum_odd) {
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
