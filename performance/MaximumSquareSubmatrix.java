/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class MaximumSquareSubmatrix {
    // Returns the size of the largest square submatrix of a[][]
    // containing only 1s.
    public static int size(int[][] a) {
        int n = a.length;
        //Create an empty submatrix
        int[][] sub = new int[n][n];
        //copy the first row
        for (int i = 0; i < n; i++) {
            sub[0][i] = a[0][i];
        }
        // copy the first column
        for (int i = 0; i < n; i++) {
            sub[i][0] = a[i][0];
        }
        // check if a[i][j] == 1
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i][j] == 1) {
                    sub[i][j] = Math.min(sub[i - 1][j - 1], Math.min(sub[i][j - 1], sub[i - 1][j]))
                            + 1;
                }
                else {
                    sub[i][j] = 0;
                }
            }
        }
        // find the maximum size of the submatrix
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sub[i][j] > maxSize) {
                    maxSize = sub[i][j];
                }
            }

        }
        return maxSize;
    }


    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest square submatrix containing
    // only 1s.
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = StdIn.readInt();
            }
        }
        StdOut.print(size(matrix));
    }


}

