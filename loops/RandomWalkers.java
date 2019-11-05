/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int steps = 0;
        double sum_steps = 0.0;
        int x = 0;
        int y = 0;
        for (int i = 0; i <= trials; i++) {
            while ((Math.abs(x) + Math.abs(y)) != r) {
                int choice = (int) (Math.random() * 4);
                if (choice == 0) {
                    x++;
                }
                else if (choice == 1) {
                    x--;
                }
                else if (choice == 2) {
                    y++;
                }
                else {
                    y--;
                }
                steps++;
            }
        }
        double average = (double) steps / (double) trials;
        System.out.print("average number of steps = " + average);

    }
}
