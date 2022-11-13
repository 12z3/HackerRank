package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class HRTheMaximumSubarray {
    public static void main(String[] args) {

        List<Integer> a21 = new ArrayList<>(List.of(3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 6, 7));
        List<Integer> a22 = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> a = new ArrayList<>(List.of(-1, 2, 3, -4, 5, 10));

        consecutiveSubsequences(a);

    }

    /**
     * Time limit exceeded
     * Your code did not execute within the time limits.
     * Please optimize your code.
     */

    private static void consecutiveSubsequences(List<Integer> arr) {
        List<Integer> ls;
        List<Integer> maxLs = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
            boolean PreviouslyAdded = false;

            ls = new ArrayList<>();
            int el1 = arr.get(i), el2 = arr.get(i + 1),
                    index = i + 1, endElIdx = arr.size() - 1, sum = 0;

            while (index < endElIdx) { // compare(el1, el2) &&
                if (!PreviouslyAdded) ls.add(el1);
                PreviouslyAdded = true;
                ls.add(el2);
                System.out.println(ls + " = " + sumOfListEl(ls));
                el1 = arr.get(index);
                el2 = arr.get(index + 1);
                //i = index;                     // <-
                index++;
            }
            if ((index == endElIdx)) { // && (el2 == el1 + 1)
                if (!PreviouslyAdded) ls.add(el1);
                ls.add(el2);
            }

            System.out.println(ls + " -> sum = " + sumOfListEl(ls));
            System.out.println("------------------------------- ");

            if (sumOfListEl(ls) > max) {
                max = sumOfListEl(ls);
                maxLs = ls;
            }
        }
        System.out.println(maxLs + " -> sum = " + max);
    }

    private static boolean compare(int el1, int el2) {
        if ((Math.abs(el1) + 1) == Math.abs(el2)) return true;
        return false;
    }

    private static int sumOfListEl(List<Integer> list) {
        int sum = 0;
        for (Integer el : list) sum += el;
        return sum;
    }
}
