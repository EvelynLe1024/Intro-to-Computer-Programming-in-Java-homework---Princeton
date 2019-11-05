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

public class GreatCircle {
    public static void main(String[] args) {
        double r = 6371.0;
        double a = Double.parseDouble(args[0]);
        double x1 = Math.toRadians(a);
        double b = Double.parseDouble(args[1]);
        double y1 = Math.toRadians(b);
        double c = Double.parseDouble(args[2]);
        double x2 = Math.toRadians(c);
        double d = Double.parseDouble(args[3]);
        double y2 = Math.toRadians(d);
        double distance = 2 * r * Math
                .asin(Math.sqrt(
                        Math.pow((Math.sin((x2 - x1) / 2)), 2) + Math.cos(x1) * Math.cos(x2) * Math
                                .pow(Math.sin((y2 - y1) / 2), 2)));

        System.out.println(distance);
    }
}
