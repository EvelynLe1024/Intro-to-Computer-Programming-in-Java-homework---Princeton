/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] res = new int[n];
        if (n == 1) {
            res[0] = 0;
        }
        int i = 2;
        int size = 1;
        while (i <= n) {
            int bf_index = i - size - 1;
            if (res[bf_index] == 0) {
                res[i - 1] = 1;
            }
            else {
                res[i - 1] = 0;
            }
            if (i == size * 2) {
                size = size * 2;
            }
            i++;
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (res[j] == res[k]) {
                    System.out.print("+");
                    if (k != (n - 1)) {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print("-");
                    if (k != (n - 1)) {
                        System.out.print("  ");
                    }

                }

            }
            System.out.println();
        }
    }
}
