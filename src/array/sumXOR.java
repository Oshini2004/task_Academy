package array;

public class sumXOR {

        public static long findSum() {
            int[] arr = {7, 3, 5};
            int n = arr.length;
            long sum = 0L;

            // iterate over bit positions 0..31 (for 32-bit ints)
            for (int bit = 0; bit < 32; bit++) {
                int cntOne = 0;

                // count how many numbers have the current 'bit' set
                for (int num : arr) {
                    if ((num & (1 << bit)) != 0) {   // correct bit test
                        cntOne++;
                    }
                }

                int cntZero = n - cntOne;               // numbers without this bit set
                long contribution = (long) cntOne * cntZero * (1L << bit);
                sum += contribution;                    // add contribution from this bit
            }

            return sum;
        }

        public static void main(String[] args) {
            System.out.println(findSum()); // prints 12 for {7,3,5}

    }

}