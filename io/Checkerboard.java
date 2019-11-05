/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Checkerboard {
    public static void main(String[] args) {
        //int n = StdIn.readInt();
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.GRAY);
                else StdDraw.setPenColor(StdDraw.BLUE);
                //System.out.println("i" + "  " + j);
                StdDraw.filledSquare((double) (i) + 0.5, (double) (j) + 0.5, 0.5);
            }
        }

    }

}
