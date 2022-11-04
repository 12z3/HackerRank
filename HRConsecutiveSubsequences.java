package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class HRConsecutiveSubsequences {
    /**
     * @Problem: https://www.hackerrank.com/challenges/consecutive-subsequences/
                 problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussions: <a href="https://www.hackerrank.com/challenges/consecutive-subsequences/forum">...</a>
     * <p>
     * Jigar got a sequence of n positive integers as his birthday present!
     * He likes consecutive subsequences whose sum is divisible by k.
     * He asks you to write a program to count them for him.
     *
     */

    public static void main(String[] args) {

        int[] inp = {1, 2, 3, 4, 1};
        int num = 3;

        subsequences(inp, num);
    }

    private static void subsequences(int[] inp, int k){
        //List<Integer> result = new ArrayList<>();
        List<Integer> result = null;
        int sum = 0;

        for (int i = 0; i < inp.length - 1; i++) {
            result = new ArrayList<>();
            int index = i + 1;
            boolean condition = true, isBreak = false;

            if (inp[i] < inp[i + 1]) {
                sum = inp[i] + inp[i + 1];
                result.add(inp[i]);
                result.add(inp[i + 1]);
                if (sum == k) {
                    System.out.println(result);
                    continue;
                }
            } else continue;

            while (condition && index < inp.length - 1 && (sum < k)){
                if (inp[index] < inp[index + 1]){
                    result.add(inp[index] + 1);
                    sum += inp[index + 1];
                    if (sum == k) {
                        System.out.println(result);
                        break;
                    }
                    index++;
                } else {
                    condition = false;
                }
            }
            System.out.println(result);
        }

       // System.out.println(result);
    }
}
