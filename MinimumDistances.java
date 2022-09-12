package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MinimumDistances {
    /**
     * @Problem: The distance between two array values is the number of indices between them. Given,
     * find the minimum distance between any pair of equal elements in the array.
     * @Web: <a href="https://www.hackerrank.com/challenges/minimum-distances/">...
     * problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign </a>
     * @Discussions: <a href="https://www.hackerrank.com/challenges/minimum-distances/forum">...</a>
     */

    public static void main(String[] args) {

        List<Integer> input1 = new ArrayList<>(List.of(3, 2, 1, 2, 3));
        List<Integer> input2 = new ArrayList<>(List.of(1, 2, 3, 4, 10));
        List<Integer> input = new ArrayList<>(List.of(7, 1, 3, 4, 1, 7));

        System.out.println(minimumDistances(input));
    }

    private static int minimumDistances(List<Integer> a) {
        List<Integer> listOfDistance = new ArrayList<>();
        int distance = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < a.size(); i++) {
            distance = 0;
            for (int j = i + 1; j < a.size(); j++) {
                if (Objects.equals(a.get(i), a.get(j))) {
                    distance = Math.abs(j - i);
                    listOfDistance.add(distance);
                }
            }
        }
        for (int j = 0; j < listOfDistance.size(); j++) {
            if (listOfDistance.get(j) < min) min = listOfDistance.get(j);
        }
        if (listOfDistance.size() == 0) {
            return -1;
        } else return min;
    }
}
