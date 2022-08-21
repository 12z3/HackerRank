package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSubset {
    /**
     * @Problem: https://www.hackerrank.com/challenges/non-divisible-subset/
     * problem?utm_campaign=challenge-recommendation&utm_medium=
     * email&utm_source=24-hour-campaign&h_r=next-challenge&h_v=zen
     * @Siscussions: https://www.hackerrank.com/challenges/non-divisible-subset/forum
     */
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>(List.of(1, 7, 2, 4));
        List<Integer> list = new ArrayList<>(List.of(19, 10, 12, 10, 24, 25, 22));
        List<Integer> result = new ArrayList<>();
        int k = 4;

        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                int b = list.get(j);
                int sum = a + b;
                if ((sum % k) != 0) {
                    result.add(a);
                    result.add(b);
                }
            }
        }
        System.out.println(result);

        for (int p = 0; p < result.size(); p++) {
            int el1 = result.get(p);
            for (int d = p + 1; d < result.size(); d++) {
                int el2 = result.get(d);
                if (el1 == el2) {
                    result.set(p, 0);
                }
            }
        }
        result.removeIf(el -> el == 0);
        System.out.println(result);

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        for (int i = 0; i < result.size(); i++) {
            if (i < 3){
                result1.add(result.get(i));
            } else result2.add(result.get(i));
        }

        System.out.println(result1);
        System.out.println(result2);
        
//        int len = 0;
//        len += ((k % 2) == 0) ? 1 : 0;
//        System.out.println(len);

    }
}
