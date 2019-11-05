/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Pole {

    public Stack<Integer> stack = new Stack();
    public String name;

    Pole(String n, int size) {
        name = n;
        for (int i = size; i >= 1; i--) {
            stack.push(i);
        }
    }

    public String toString() {
        String res = "";
        res += name + " : ";

        res += stack.toString();
        return res;
    }

    public static void main(String[] args) {
        Pole source = new Pole("A", 3);
        Pole destination = new Pole("B", 0);
        Pole a = new Pole("C", 0);
        haoni(source, destination, a, 3);
    }

    public static void haoni(Pole from, Pole to, Pole aux, int size) {
        if (size == 1) {
            int disc = from.stack.pop();
            to.stack.push(disc);
            System.out.println("moving " + disc + " from " + from.name + " to " + to.name);
            return;
        }
        haoni(from, aux, to, size - 1);
        haoni(from, to, aux, 1);
        haoni(aux, to, from, size - 1);
    }
}
