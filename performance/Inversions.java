/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Inversions {
    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        int m = a.length;
        long count = 0L;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (i < j && a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        //k = count(a);
        if (k == 0) {
            return a;
        }

        long gap = k;
        int size = 0;

        int[] res = new int[n];
        int p = 0;
        while (gap > 0) {
            if (gap > p) {
                gap -= p;
                p++;
            }
            else {
                //System.out.println("gap = " + gap + ", p = " + p);
                int i = 0;
                for (; i < p - gap; i++) {
                    res[i] = p - 1 - i;
                    //System.out.println("1:" + res[i] + " : " + i);
                }
                res[i++] = p;
                //System.out.println("i = " + i + ", p = " + p);
                while (i <= p) {
                    res[i] = p - i;
                    //System.out.println("2:" + res[i] + " : " + i);
                    i++;
                }
                while (i < n) {
                    res[i] = i;
                    //System.out.println("3:" + res[i] + " : " + i);
                    i++;
                }
                //gap = 0;
                break;
            }
        }
        return res;
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] res = generate(n, k);
        //System.out.println(count(res));

        for (int i = 0; i < res.length; i++)
            StdOut.print(res[i] + " ");
    }
}
