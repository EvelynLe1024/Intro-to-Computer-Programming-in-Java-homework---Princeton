/* *****************************************************************************
 *  Name:    Alan Turing
 *  NetID:   aturing
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        long a = (long) Integer.parseInt(args[0]);
        long b = (long) Integer.parseInt(args[1]);
        long c = (long) Integer.parseInt(args[2]);


        System.out.println(
                ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c
                        == b * b)) && a > 0 && b > 0 && c > 0);

    }
}
