package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsequencesHR {

    /**
     *
     * @Problem: Jigar got a sequence of n positive integers as his birthday present!
     * He likes consecutive subsequences whose sum is divisible by k.
     * He asks you to write a program to count them for him.
     * Input Format
     * The first line contains T, the number of testcases.
     * T testcases follow. Each testcase consists of 2 lines.
     * The first line contains n and k separated by a single space.
     * And the second line contains n space separated integers.
     *<p></p>
     * Output Format
     * For each test case, output the number of consecutive subsequenences whose sum is divisible by k in a newline.
     * <p></p>
     * https://www.hackerrank.com/challenges/consecutive-subsequences/problem?utm_campaign=challenge-
    recommendation&utm_medium=email&utm_source=24-hour-campaign&h_r=next-challenge&h_v=zen

     * @Discussions: https://www.hackerrank.com/challenges/consecutive-subsequences/forum
     *
     *<p></p>
     * Input Format
     * The first line contains T, the number of testcases.
     * T testcases follow. Each testcase consists of 2 lines.
     * The first line contains n and k separated by a single space.
     * And the second line contains n space separated integers.
     *<p></p>
     * in: {3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 5, 6};              {1, 2, 1, 2, 1, 2};
     * out:
     * [3, 4, 5, 6, 7]                                                        [1, 2]
     * [1, 2, 3, 4, 5, 6, 7, 8]                                               [1, 2]
     * [3, 4, 5, 6]                                                           [1, 2]
     * 14                                                                     3
     */

    /**
     * ? ...  1, 2, 3, 4, 1
     * ? ...  1, 2, 3, 4
     * ? ...  1, 2, 3
     * ? ...  1, 2
     */

    public static void main(String[] args) {

        int[] a2 = {1, 2, 3, 6, 7, 8};
        int[] a = {3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 6, 7};
        int[] a1 = {3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 5, 6};

        int[] a13 = {1, 2, 1, 2, 1, 2};    // k = 2
        int[] a3 = {1, 2, 3, 4, 1};         // k = 3

//        Scanner scanner = new Scanner(System.in);
//        String[] input = scanner.nextLine().split(" ");
//        String[] input1 = scanner.nextLine().split(" ");
//
//        int k = Integer.parseInt(input[1]);
//        int n = Integer.parseInt(input[0]);
//        int[] a = new int[n];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = Integer.parseInt(input1[i]);
//        }

        consecutiveSubsequences(a, 3);
        //  System.out.println(consecutiveSubsequences1(a, 3));;
    }

    private static int consecutiveSubsequences1(int[] a, int k) {
        List<Integer> ls1 = null;
        List<Integer> ls2 = new ArrayList<>();
        int sum, count = 0;

        for (int i = 0; i < a.length; i++) {
            ls1 = new ArrayList<>();
            int index = i + 1;

            sum = a[i];
            if (sum % k == 0) {
                ls2.add(a[i]);
                count++;
            }

            ls1.add(a[i]);
            while (index < a.length) {
                sum += a[index];
                ls1.add(a[index]);
                if (sum % k == 0) {
                    if (!ls2.isEmpty()) System.out.println(ls2);
                    System.out.println(ls1);
                    count++;
                }
                index++;
            }
        }
        return count;
    }


    private static void consecutiveSubsequences(int[] a, int k) {
        List<Integer> ls;
        List<Integer> maxLs = new ArrayList<>();
        int countConnectives = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length - 1; i++) {
            boolean PreviouslyAdded = false;

            ls = new ArrayList<>();
            int el1 = a[i], el2 = a[i + 1],
                    index = i + 1, endElIdx = a.length - 1, sum = 0;
            countConnectives++;


            while (compare(el1, el2) && index < endElIdx) {
                if (!PreviouslyAdded) ls.add(el1);
                PreviouslyAdded = true;
                ls.add(el2);
                System.out.println(ls);
                el1 = a[index];
                el2 = a[index + 1];
                i = index;                     // <-
                index++;
            }
            if ((index == endElIdx) && (el2 == el1 + 1)) {
                if (!PreviouslyAdded) ls.add(el1);
                ls.add(el2);
            }

            System.out.println(ls + " -> " + sumOfListEl(ls));
            System.out.println(sum);
            System.out.println("------------------------------- ");

            if (sumOfListEl(ls) > max) {
                max = sumOfListEl(ls);
                maxLs = ls;
            }
        }
        System.out.println(maxLs + " -> " + max);
    }

    private static boolean compare(int el1, int el2) {
        if ((el1 + 1) == el2) return true;
        return false;
    }

    private static boolean checkConditionFromSum(int sum, int k) {
        if (sum % k == 0) return true;
        return false;
    }

    private static int sumOfListEl(List<Integer> list) {
        int sum = 0;
        for (Integer el : list) sum += el;
        return sum;
    }
}
