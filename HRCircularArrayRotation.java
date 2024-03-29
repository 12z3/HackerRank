package task.hackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HRCircularArrayRotation {

    /**
     * @Source: https://www.hackerrank.com/challenges/circular-array-rotation/problem?utm_campaign=
     * challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussions: <a href="https://www.hackerrank.com/challenges/circular-array-rotation/forum">...</a>
     *
     * @Problem: John Watson knows of an operation called a right circular rotation on an array of integers.
     * One rotation operation moves the last array element to the first position
     * and shifts all remaining elements right one. To test Sherlock's abilities,
     * Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation
     * a number of times then determine the value of the element at a given position.
     * <p>
     * For each array, perform a number of right circular rotations
     * and return the values of the elements at the given indices.
     */

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(List.of(3, 4, 5));
        List<Integer> queries = new ArrayList<>(List.of(1, 2));

        System.out.println(reversRight(a, 2, queries));
        System.out.println(circularArrayRotation(a,2,queries));
    }

    private static List<Integer> reversRight(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();

        Collections.rotate(a, k);               // Завърта елементите в посочения списък на определеното разстояние = k

        for (Integer query : queries) {
            result.add(a.get(query));
        }
        System.out.println(a);
        return result;
    }


    /**
     * @Issue: Time limit exceeded.
     * Your code did not execute within the time limits. Please optimize your code.
     * For more information on execution time limits, refer to the environment page.
     */

    private static List<Integer> reversRightSlow(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        int count = 1;
        while (count <= k) {
            int tmp = a.get(a.size() - 1);                                 // Пази последният.
            for (int i = a.size() - 1; i > 0; i--) {
                a.set(i, a.get(i - 1));                                    // Размества елементите +1 на дясно.
            }
            a.set(0, tmp);                                                 // Последният го поставя на 0-индекс.
            count++;
        }

        for (int i = 0; i < queries.size(); i++) {
            result.add(a.get(queries.get(i)));
        }
        System.out.println(a);
        return result;
    }


    // flashCoder2001 - Solution:
    // Wrong result: [3, 4]
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        k = k % a.size();
        for (int i = 0; i < queries.size(); i++) {
            int ind = queries.get(i);
            int rem = ind - k;
            if (rem < 0)
                rem = a.size() + rem;
            queries.set(i, a.get(rem));
        }
        return queries;
    }
}
