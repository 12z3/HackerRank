package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HREqualizetheArrayNew {
    /**
     * @Problem: Given an array of integers,
     * determine the minimum number of elements to delete to leave only elements of equal value.
     * @Web: <a href="https://www.hackerrank.com/challenges/">...</a>
     * equality-in-a-array/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussions: <a href="https://www.hackerrank.com/challenges/equality-in-a-array/forum">...</a>
     */
    public static void main(String[] args) {

        List<Integer> input1 = new ArrayList<>(List.of(1, 2, 3, 1, 2, 2, 3, 3, 1, 3));
        List<Integer> input7 = new ArrayList<>(List.of(1, 5, 8, 8, 8, 1, 5));
        List<Integer> input8 = new ArrayList<>(List.of(1, 5, 8, 8, 8, 1, 5, 1));         //  5 != 2 - My

        List<Integer> input2 = new ArrayList<>(List.of(1, 2, 2, 3));
        List<Integer> input5 = new ArrayList<>(List.of(3, 3, 2, 1, 3));
        List<Integer> input6 = new ArrayList<>(List.of(1, 2, 3, 1, 2, 3, 3, 3));
        List<Integer> input3 = new ArrayList<>(List.of(1, 2, 3, 1, 2, 2, 3, 3, 1));
        List<Integer> input4 = new ArrayList<>(List.of(1, 2, 3, 1, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4));
        List<Integer> input = new ArrayList<>(List.of(
                10, 27, 9, 10, 100, 38, 30, 32, 45, 29, 27, 29,
                32, 38, 32, 38, 14, 38, 29, 30, 63, 29, 63, 91, 54, 10, 63));           // 23 != 19 - My
                                                                                        // (1, 5, 8, 8, 8, 1, 5, 1)
        System.out.println( equalizetheArray(input));

    }


    private static int equalizetheArray(List<Integer> input) {
        List<Integer> counter = new ArrayList<>();                              // (1, 5, 8, 8, 8, 1, 5, 1)
        int max = Integer.MIN_VALUE, countMax = 0;                              // 1 и 8 са с еднакви повторения, но
        int maxDigit = 0;
                                                                    // от резултата трябва да се премахне само или
        for (int i = 0; i < input.size(); i++) {                    // повторенията на 1-а или тези на 8-а.
            countMax = 0;
            for (int j = 0; j < input.size(); j++) {
                if (Objects.equals(input.get(i), input.get(j))) countMax++;
            }
            counter.add(countMax);
        }

        for (int i = 0; i < counter.size(); i++) {
            if (counter.get(i) > max) {
                max = counter.get(i);                          // Изтрия ли този ред резултата Ще се увеличи с 1
                maxDigit = input.get(i);
            }
        }

        int finalMaxDigit = maxDigit;
        input.removeIf(el -> el == finalMaxDigit);

        return input.size();
    }
}


