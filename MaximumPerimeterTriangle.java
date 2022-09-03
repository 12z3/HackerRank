package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {
    /**
     * @Problem: Given an array of stick lengths, use  of them to construct a non-degenerate triangle with
     * the maximum possible perimeter. Return an array of the lengths of
     * its sides as  integers in non-decreasing order.
     * <p>
     * If there are several valid triangles having the maximum perimeter:
     * Choose the one with the longest maximum side.
     * If more than one has that maximum, choose from them the one with the longest minimum side.
     * If more than one has that maximum as well, print any one them.
     * @Web: <a href="https://www.hackerrank.com/challenges/maximum-perimeter-triangle/">...</a>
     * problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussions: <a href="https://www.hackerrank.com/challenges/maximum-perimeter-triangle/forum">...</a>
     */

    public static void main(String[] args) {
        List<Integer> input1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 10));
        List<Integer> input = new ArrayList<>(List.of(1, 1, 1, 3, 3));
        maximumPerimeterTriangle(input);

    }

    private static void maximumPerimeterTriangle(List<Integer> input) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = null;
                                                      // (1, 2, 3, 4, 5, 10)
        int a = 0, b = 0, c = 0;                      // [[2, 3, 4], [2, 4, 5], [3, 4, 5]]
        for (int i = 0; i < input.size(); i++) {
            a = input.get(i);
            for (int j = i + 1; j < input.size(); j++) {
                if (i != j) b = input.get(j);
                if (b == 0) continue;
                for (int k = j + 1; k < input.size(); k++) {
                    if (j != k) c = input.get(k);
                    if (c == 0) continue;

                    if (isTriangle(a, b, c)) {
                        res = new ArrayList<>();
                        res.add(a);
                        res.add(b);
                        res.add(c);
                        Collections.sort(res);
                        result.add(res);
                    }
                }
            }
        }

        assert false;
        System.out.println(result.toString());
    }

    private static boolean isTriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) return true;
        else return false;
    }


}
