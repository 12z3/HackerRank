package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class HREqualizetheArray {
    /**
     * @Problem: Given an array of integers,
     * determine the minimum number of elements to delete to leave only elements of equal value.
     * @Web: <a href="https://www.hackerrank.com/challenges/">...</a>
     * equality-in-a-array/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussions: <a href="https://www.hackerrank.com/challenges/equality-in-a-array/forum">...</a>
     */

    public static void main(String[] args) {
        List<Integer> input2 = new ArrayList<>(List.of(1, 2, 2, 3));
        List<Integer> input1 = new ArrayList<>(List.of(3, 3, 2, 1, 3));
        List<Integer> input4 = new ArrayList<>(List.of(1, 2, 3, 1, 2, 3, 3, 3));
        List<Integer> input3 = new ArrayList<>(List.of(1, 2, 3, 1, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4));
        List<Integer> input = new ArrayList<>(List.of(
                10, 27, 9, 10, 100, 38, 30, 32, 45, 29, 27, 29, 32, 38, 32, 38, 14, 38, 29, 30, 63, 29, 63, 91, 54, 10, 63));
        List<Integer> indexes = new ArrayList<>();
        int count = 0, counter = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < input.size(); i++) {
            count = 0;
            int a = input.get(i);
            for (int j = 0; j < input.size(); j++) {
                int b = input.get(j);
                if (a == b) count++;
            }
            indexes.add(count);
        }

        for (int i = 0; i < indexes.size(); i++) {
            if (indexes.get(i) > max) {
                max = indexes.get(i);
            }
        }

        for (int i = 0; i < indexes.size(); i++) {
            if (indexes.get(i) < max) counter++;
        }

        for (int el : indexes) System.out.print(el + " ");
        System.out.println();
        System.out.println(counter);

    }
}
