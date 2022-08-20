package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HRCutTheSticks1 {
    /**
     * @Problem: You are given a number of sticks of varying lengths.
     *           You will iteratively cut the sticks into smaller sticks,
     *           discarding the shortest pieces until there are none left.
     *           At each iteration you will determine the length of the shortest stick remaining,
     *           cut that length from each of the longer sticks and then discard all the pieces of that shortest length.
     *           When all the remaining sticks are the same length, they cannot be shortened so discard them.
     *
     * @Source: https://www.hackerrank.com/challenges/cut-the-sticks/
     * problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussion: https://www.hackerrank.com/challenges/cut-the-sticks/forum
     */

    private static void cutTheSticks(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        while (list.size() > 0) {
            result.add(list.size());
            int min = Collections.min(list);
            list.removeIf(el -> el == min);                                   

            for (int i = 0; i < list.size(); i++) {
                list.set(i, (list.get(i) - min));
            }
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(5, 4, 4, 2, 2, 8));
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));

        cutTheSticks(list);
    }
}

/**
 * [3, 2, 2, 6]
 * [1, 4]
 * [3]
 * []
 * [6, 4, 2, 1]
 */