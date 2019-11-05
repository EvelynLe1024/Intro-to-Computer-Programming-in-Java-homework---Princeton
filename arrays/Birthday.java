/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] hits = new int[n + 1];
        for (int j = 0; j < trials; j++) {
            int[] birthdays = new int[365];
            for (int i = 0; i < n; i++) {
                int bday = (int) (Math.random() * 365);
                if (birthdays[bday] != 0) {
                    hits[i + 1]++;
                    break;
                }
                else birthdays[bday] = 1;
            }
        }

        int sum_hits = 0;
        for (int k = 1; k <= n; k++) {
            sum_hits += hits[k];
            double per = (double) sum_hits / (double) trials;

            System.out.println(k + "\t" + hits[k] + "\t" + per);
            if (per >= 0.5) break;

        }


    }
}
