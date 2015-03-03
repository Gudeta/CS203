package W2D1.Lect.HM;

import java.util.*;

/**
 *
 * @author Gude
 */
public class LinkedListVersion {

    public static void main(String[] args) {
        List<Integer> ints;
        ints = new LinkedList<>();
        for (int i = 0; i <= 100; i++) {
            double x = Math.random() * 100;
            //System.out.println((int) x);
            ints.add((int) x);

        }
        double sum = 0.0;
        for (int i = 0; i < ints.size(); i++) {
            sum += ints.get(i);

        }
        System.out.println(sum);

        System.out.println("The average is: " + sum / 100);

    }

}
