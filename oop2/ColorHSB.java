/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ColorHSB {
    private int h;
    private int s;
    private int b;

    private static final int MAX_DEGREE_h = 359;
    private static final int MAX_DEGREE_s = 100;
    private static final int MAX_DEGREE_b = 100;
    private static final int MIN_DEGREE = 0;

    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b) {
        if (h < MIN_DEGREE || h > MAX_DEGREE_h || s < MIN_DEGREE || s > MAX_DEGREE_s || b < 0
                || b > MAX_DEGREE_b) {
            throw new IllegalArgumentException("the hue must be within range");
        }
        this.h = h;
        this.s = s;
        this.b = b;
    }

    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        return "(" + h + ", " + s + ", " + b + ")";
    }

    // Is this color a shade of gray?
    public boolean isGrayscale() {
        if (s == 0 || b == 0) {
            return true;
        }
        return false;
    }

    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(ColorHSB that) {
        int dh = Math.abs(this.h - that.h);
        int ds = this.s - that.s;
        int db = this.b - that.b;
        int distance = Math.min(dh * dh, (360 - dh) * (360 - dh)) + ds * ds
                + db * db;
        return distance;
    }

    // Sample client (see below).
    public static void main(String[] args) {
        int h = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        int minDistance = Integer.MAX_VALUE;
        ColorHSB base = new ColorHSB(h, s, b);
        ColorHSB min = null;
        String minColor = "";
        while (!StdIn.isEmpty()) {
            String color = StdIn.readString();
            int h1 = StdIn.readInt();
            int s1 = StdIn.readInt();
            int b1 = StdIn.readInt();
            ColorHSB linecolor = new ColorHSB(h1, s1, b1);
            int dst = base.distanceSquaredTo(linecolor);

            //System.out.println(color + ":" + dst);
            if (dst < minDistance) {
                minDistance = dst;
                min = linecolor;
                minColor = color;
            }
        }
        StdOut.print(minColor + " " + min.toString());
    }
}
