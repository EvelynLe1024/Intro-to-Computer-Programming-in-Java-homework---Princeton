/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[] mat = int[m + 2][n + 2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int r = (int) (Math.random();
                int t = mat[j][r];
                mat[j][r] = '*';
                '*' = t;
            }
        }


    }
}
