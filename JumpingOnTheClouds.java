package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {

    /**
     * @Problem: https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem?utm_campaign=challenge
     * -recommendation&utm_medium=email&utm_source=24-hour-campaign
     */
    public static void main(String[] args) {

        int[] c1 = {0, 0, 1, 0, 0, 1, 1, 0};
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0}; // 80 ?
        int[] c3 = {0, 0, 1, 0};

        System.out.println(extracted(c, 3));
    }

    private static int extracted(int[] c, int k) {
        List<Integer> lst = new ArrayList<>();
        List<Integer> lst1 = new ArrayList<>();
        int n = c.length;
        int health = 100;
        for (int i = 0; i < c.length; i += k) {
            if (c[i] == 0) {
                health -= 1;
            } else health -= 3;
            lst.add(i);
            lst1.add(c[i]);
        }
        System.out.println(lst);
        System.out.println(lst1);
        return health;
    }
}
