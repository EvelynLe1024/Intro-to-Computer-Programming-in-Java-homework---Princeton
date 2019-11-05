/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class TrinomialDP {


    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k, long[][] memo) {

        if (n == 0 && k == 0) return 1;
        if (k < -n || k > n) return 0;

        int translated = k + n;
        if (memo[n][translated] > 0) return memo[n][translated];
        long res = trinomial(n - 1, k - 1, memo) + trinomial(n - 1, k, memo) + trinomial(n - 1,
                                                                                         k + 1,
                                                                                         memo);
        memo[n][translated] = res;
        return res;
    }


    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        long[][] memo = new long[n + 1][2 * n + 3];
        StdOut.println(trinomial(n, k, memo));
    }

    /*
    private static long[] f = new long[92];
    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
        int T[][] = new int[n + 1][2 * n + 3];
        for (int i = 0; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i == 0 && k == 0) T[i][j] = 1;
                else if (j < -n || j > n) T[i][j] = 0;
                else
                    T[i][j] = T[i - 1][j - 1] + T[i - 1][j] + T[i - 1][j + 1];
            }
        }
        return T[n][k];
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
    }
    */
}
