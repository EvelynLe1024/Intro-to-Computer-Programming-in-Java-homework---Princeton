/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Clock {
    private int h;
    private int m;

    private static final int MAX_DEGREE_h = 23;
    private static final int MAX_DEGREE_m = 59;
    private static final int MIN_DEGREE = 0;

    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        this.h = h;
        this.m = m;
        if (h < MIN_DEGREE || h > MAX_DEGREE_h || m < MIN_DEGREE || m > MAX_DEGREE_m) {
            throw new IllegalArgumentException("The number must be within range");
        }
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        if (s.length() != 5) {
            throw new IllegalArgumentException("The number must be in the right format");
        }
        if (s.charAt(2) != ':') {
            throw new IllegalArgumentException("The number must be in the right format");
        }
        try {
            this.h = Integer.parseInt(s.substring(0, 2));
            this.m = Integer.parseInt(s.substring(3, 5));

        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }

        if (h < MIN_DEGREE || h > MAX_DEGREE_h || m < MIN_DEGREE || m > MAX_DEGREE_m) {
            throw new IllegalArgumentException("The number must be in the right format");
        }
    }


    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return convert2Digits(this.h) + ":" + convert2Digits(this.m);
    }
    // Helper methods for 2 digit conversion

    private String convert2Digits(int x) {
        if (x < 10) {
            return "0" + x;
        }
        return "" + x;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (this.h < that.h || (this.h == that.h && this.m < that.m)) {
            return true;
        }
        return false;
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        int dm = 1;
        m += dm;
        if (m == 59) {
            m = 0;
            h = (h + 1) % 24;
        }
    }

    // Adds Δ minutes to the time on this clock.
    public void toc(int delta) {
        if (delta < 0) {
            throw new IllegalArgumentException("Delta must be positive.");
        }
        int rm = delta % 60;
        m = (m + rm) % 60;
        h = (h + delta / 60) % 24;
    }


    public static void main(String[] args) {

        Clock clock1 = new Clock(1, 48);
        Clock clock2 = new Clock(12, 55);
        Clock clock3 = new Clock("01:48");
        StdOut.println(clock3.toString());
        StdOut.println(clock1.isEarlierThan(clock2));
        clock1.tic();
        StdOut.println(clock1);
        clock2.toc(120);
        StdOut.println(clock2);
    }

}
