package task.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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
        System.out.println(sequencePermutationHR(p));

    }

    private static List<Integer> sequencePermutation(List<Integer> p) {
        List<Integer> result = new ArrayList<>();

        for (int x = 1; x <= p.size(); x++) {                           // За всяко i от x ...
            for (int i = 0; i < p.size(); i++) {
                if (p.get(i) == x) {                                    // Търси x в i.
                    int index = i + 1;
                    for (int j = 0; j < p.size(); j++) {                // ... и за всяко j от i...
                        int value = p.get(j);                           //... Провери дали е изпълнено "index = value"
                        if (index == value) result.add(j + 1);
                    }
                }
            }
        }

        return result;
    }
    private static List<Integer> sequencePermutationHR(List<Integer> p) {
        List<Integer> l1 = new ArrayList<>();
        int num =  0;
        for (int i = 0; i < p.size(); i++) {
            for (int j = 0; j < p.size(); j++) {
                if (p.get(j) == i + 1) {
                    num = j + 1;
                }
            }
            l1.add(num);
        }
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l1.size(); j++) {
                if (Objects.equals(p.get(j), l1.get(i))) {
                    num = j + 1;
                }
            }
            l2.add(num);
        }
        return l2;

    }
}
