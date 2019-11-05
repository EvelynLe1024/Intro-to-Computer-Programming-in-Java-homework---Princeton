/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {


        int m = Integer.parseInt(args[0]); // max number in sequence of integers

        int[] freq = new int[m + 1];
        int n = 0;

        while (!StdIn.isEmpty()) {
            int val = StdIn.readInt();
            //System.out.println(val);
            freq[val]++;
            n++;
        }


        //Compute Shannon entropy
        double entropy = 0.0;
        for (int j = 1; j <= m; j++) {
            double p = (double) freq[j] / (double) n;
            if (freq[j] > 0)
                entropy -= p * Math.log(p) / Math.log(2);
        }
        //System.out.println(entropy);
        StdOut.printf("%.4f\n", entropy);

    }
}
