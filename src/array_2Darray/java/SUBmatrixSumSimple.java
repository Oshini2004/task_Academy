package array_2Darray.java;
import java.util.Scanner;

public class SUBmatrixSumSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Read matrix (we keep 1-based indexing for convenience)
        long[][] a = new long[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                a[i][j] = sc.nextLong();
            }
        }

        // Build prefix sum array pref[i][j] = sum of rectangle (1,1) to (i,j)
        long[][] pref = new long[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                pref[i][j] = pref[i - 1][j]   // sum above
                        + pref[i][j - 1] // sum left
                        - pref[i - 1][j - 1] // added twice, so subtract
                        + a[i][j]; // add current cell
            }
        }

        // Answer queries
        int Q = sc.nextInt();
        for (int q = 0; q < Q; q++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // assume queries are 1-based and valid
            long ans = pref[x2][y2]
                    - pref[x1 - 1][y2]
                    - pref[x2][y1 - 1]
                    + pref[x1 - 1][y1 - 1];

            System.out.println(ans);
        }
        sc.close();
    }
}
