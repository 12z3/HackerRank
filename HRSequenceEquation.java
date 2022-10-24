package task.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HRSequenceEquation {
    public static void main(String[] args) {

        /**
         * @Source: https://www.hackerrank.com/challenges/permutation-equation/problem?utm_campaign=challenge-
         * recommendation&utm_medium=email&utm_source=24-hour-campaign&h_r=next-challenge&h_v=zen
         * @Discussions: https://www.hackerrank.com/challenges/permutation-equation/forum
         */

        List<Integer> p = new ArrayList<>(List.of(5, 2, 1, 3, 4));
        int n = p.size();

        Integer[] pToArr = new Integer[p.size()];
        pToArr = p.toArray(new Integer[0]);

        System.out.println(sequencePermutation(p));

    }

    private static List<Integer> sequencePermutation(List<Integer> p) {
        List<Integer> result = new ArrayList<>();

        for (int x = 1; x <= p.size(); x++) {
            for (int i = 0; i < p.size(); i++) {
                if (p.get(i) == x) {
                    int index = i + 1;
                    for (int j = 0; j < p.size(); j++) {
                        int value = p.get(j);
                        if (index == value) result.add(j + 1);
                    }
                }
            }
        }

        return result;
    }
}
