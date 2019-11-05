/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Ramanujan {
    // Is n a Ramanujan number?

    public static boolean isRamanujan(long n) {
        int count = 0;
        for (long a = 1; a <= (long) Math.cbrt(n) + 1; a++) {
            double b = Math.cbrt((n - Math.pow(a, 3)));
            double cubicD = b * b * b;
            long cubicL = (long) b * (long) b * (long) b;
            if ((long) cubicD == cubicL) {
                //System.out.println(a + " + " + b + " + " + Math.cbrt(n));
                count++;
            }
        }
        //System.out.println(count);
        return count == 4;
    }

    /*
    public static boolean isRamanujan(long n) {
        int r1 = 0;
        int r2 = 0;

        for (int a = 1; a < (int) Math.cbrt(n); a++) {
            double b = Math.cbrt((n - Math.pow(a, 3)));
            double cubicD = b * b * b;
            long cubicL = (int) b * (int) b * (int) b;
            if ((int) cubicD == cubicL) {
                if (r1 != 0 && r2 != 0 && r1 == a && r2 == b) {
                    return true;
                }
                r1 = a;
                r2 = (int) b;
            }
        }
        return false;
    }
    */

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        // System.out.println("n = " + n);
        StdOut.print(isRamanujan(n));
    }
}
