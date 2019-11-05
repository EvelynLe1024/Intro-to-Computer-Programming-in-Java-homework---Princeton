/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] * alpha;
        }
        return res;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        int N = a.length;
        double[] res = new double[a.length];
        for (int i = 0; i < N; i++) {
            res[i] = a[N - i - 1];
        }
        return res;
        /* int sampling_rate = 44100;
        int n = sampling_rate;

        for (int i = n; i >= 0; i--)
            a[i] = Math.sin(2 * Math.PI * i / sampling_rate);
        return a;
        */
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        int n = a.length;
        int m = b.length;
        double[] res = new double[m + n];
        for (int i = 0; i < m; i++) {
            res[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            res[m + i] = b[i];
        }
        return a;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int n = a.length;
        int m = b.length;
        int len = Math.max(m, n);
        double[] res = new double[len];
        for (int i = 0; i < len; i++)
            if (i < m) res[i] += a[i];
        for (int i = 0; i < len; i++)
            if (i < n) res[i] += b[i];
        return res;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        return a;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        /*
        double amplify = Double.parseDouble(args[0]);
        double reverse = Double.parseDouble(args[0]);
        double merge = Double.parseDouble(args[0]);
        double mix = Double.parseDouble(args[0]);
        double changeSpeed = Double.parseDouble(args[0]);
        /*StdDraw.play(amplify);
        StdDraw.play(reverse);
        StdDraw.play(merge);
        StdDraw.play(mix);
        StdDraw.play(changeSpeed);*/


        int sps = 44100; // samples per second
        int hz = 440; // concert A
        double duration = 10.0; // ten seconds
        int N = (int) (sps * duration); // total number of samples
        double[] a = new double[N + 1];
        for (int i = 0; i <= N; i++)
            a[i] = Math.sin(2 * Math.PI * i * hz / sps);
        StdAudio.play(a);

    }
}
