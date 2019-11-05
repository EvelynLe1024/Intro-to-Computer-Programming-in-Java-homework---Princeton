/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x))
            return Double.NaN;
        double heaviside = 0.0;
        if (x < 0) heaviside = 0.0;
        if (x == 0) heaviside = 0.5;
        if (x > 0) heaviside = 1.0;
        return heaviside;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        double sigmoid;
        sigmoid = 1 / (1 + Math.exp(-x));
        return sigmoid;
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (Double.isInfinite(x) && x < 0)
            return -1.0d;
        if (Double.isInfinite(x) && x > 0)
            return 1.0d;
        if (x == Double.MAX_VALUE)
            return 1.0d;
        if (x == -Double.MAX_VALUE)
            return -1.0d;

        double tanh;
        tanh = (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
        return tanh;
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        double softsign;
        softsign = x / (1 + Math.abs(x));
        return softsign;
    }        // Returns the square nonlinearity function of x.

    public static double sqnl(double x) {
        double sqnl = 0.0;
        if (x < -2) sqnl = -1;
        if (x > -2 && x < 0) sqnl = x + (Math.pow(x, 2) / 4);
        if (x >= 0 && x < 2) sqnl = x - (Math.pow(x, 2) / 4);
        if (x > 2) sqnl = 1.0;
        return sqnl;
    }


    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.printf("heaviside(" + args[0] + ")" + " = " + heaviside(x) + "\n");
        StdOut.printf("  sigmoid(" + args[0] + ")" + " = " + sigmoid(x) + "\n");
        StdOut.printf("     tanh(" + args[0] + ")" + " = " + tanh(x) + "\n");
        StdOut.printf(" softsign(" + args[0] + ")" + " = " + softsign(x) + "\n");
        StdOut.printf("     sqnl(" + args[0] + ")" + " = " + sqnl(x) + "\n");
    }

}

