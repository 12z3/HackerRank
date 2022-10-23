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
     *
     * For each array, perform a number of right circular rotations
     * and return the values of the elements at the given indices.
     */

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(List.of(3, 4, 5));
        List<Integer> queries = new ArrayList<>(List.of(1, 2));
        System.out.println(reversRight(a, 2, queries));
    }

    private static List<Integer> reversRight(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        //int count = 1;

        //while (count <= k) {

            List<Integer> temp = new ArrayList<>(a);
            int tmp = a.get(a.size() - 1);

            //a.set(a.size() - count, a.get(a.size() - count - 1));
            for (int i = a.size() - 1, count = 1; count <= k; i--, count ++) {
                a.set(i, a.get(i - 1));
            }
           a.set(0, tmp);
            //count++;
        //}


        for (int i = 0; i < queries.size(); i++) {
            result.add(a.get(queries.get(i)));
        }
        System.out.println(a);
        return result;
    }


    /**
     * @Issue: Time limit exceeded
     * Your code did not execute within the time limits. Please optimize your code.
     * For more information on execution time limits, refer to the environment page
     */

//    private static List<Integer> reversRight(List<Integer> a, int k, List<Integer> queries) {
//        List<Integer> result = new ArrayList<>();
//        int count = 1;
//        while (count <= k) {
//            int tmp = a.get(a.size() - 1);
//            for (int i = a.size() - 1; i > 0; i--) {
//                a.set(i, a.get(i - 1));
//            }
//            a.set(0, tmp);
//            count++;
//        }
//
//        for (int i = 0; i < queries.size(); i++) {
//            result.add(a.get(queries.get(i)));
//        }
//        System.out.println(a);
//        return result;
//    }
}
