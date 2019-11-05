/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        int x = 0;
        int y = 0;
        System.out.println(0 + ", " + 0);
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
            System.out.println(x + ", " + y);
        }
        System.out.println("steps = " + steps);
    }
}
