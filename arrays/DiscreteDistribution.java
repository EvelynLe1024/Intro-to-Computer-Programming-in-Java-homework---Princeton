/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        System.out.print(m + " ");

        // Find the sum of n numbers
        int sum_nums = 0; // sum of all numbers in (n-1)
        for (int k = 1; k <= n; k++) {
            sum_nums += Integer.parseInt(args[k]);
        }


        // Find the cumulative probability of indices in (n -1)

        for (int j = 0; j < m; j++) {
            double sum_p = 0.0; // sum of cumulative probability in (n-1)
            double r = Math.random();

            for (int e = 1; e <= n; e++) {
                double p = Double.parseDouble(args[e])
                        / sum_nums; // probably of each index in (n-1)

                sum_p += p;
                if (r < sum_p) {
                    int index = e;

                    System.out.print(index + " ");
                    break;
                }

            }

        }

    }


}
