/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Divisors {
    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        }
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int old_a = a;
            int old_b = b;
            a = old_b;
            b = old_a % old_b;
        }
        return a;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        //System.out.println(a + " " + b);
        int res = ((Math.abs(a) / gcd(a, b))) * Math.abs(b);
        return res;
    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    // Returns the number of positive integers between 1 and n
    // that are relatively prime with n.
    public static int totient(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (areRelativelyPrime(i, n)) count++;
        }
        return count;
    }

    // Takes two integer command-line arguments a ansd b and prints each
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        StdOut.printf("gcd(%2d, %2d) = %1d\n", a, b, gcd(a, b));
        StdOut.printf("lcm(%2d, %2d)= %1d\n", a, b, lcm(a, b));
        StdOut.printf("areRelativelyPrime(%2d, %2d)= %1s\n", a, b, areRelativelyPrime(a, b));
        StdOut.printf("totient(%2d) = %1d\n", a, totient(a));
        StdOut.printf("totient(%2d)= %1d\n", b, totient(b));

    }
}
