package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class HRConsecutiveSubsequences {
    /**
     * @Problem: https://www.hackerrank.com/challenges/consecutive-subsequences/
     * problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussions: <a href="https://www.hackerrank.com/challenges/consecutive-subsequences/forum">...</a>
     * <p>
     * Jigar got a sequence of n positive integers as his birthday present!
     * He likes consecutive subsequences whose sum is divisible by k.
     * He asks you to write a program to count them for him.
     * </p>
     * 1, 2, 3, 4, 1};
     * 3
     * 1 2
     * 1 2 3
     * 2 3 4
     */

    public static void main(String[] args) {
        int[] inp1 = {1, 2, 3, 4, 1}; // num = 3;
        int[] inp = {1, 2, 1, 2, 1, 2};  // num = 2;
        int num = 2;

        subsequences(inp, num);
    }

    private static void subsequences(int[] inp, int k) {
        List<Integer> result = null;
        int sum, count = 0;

        for (int i = 0; i < inp.length - 1; i++) {
            sum = 0;
            result = new ArrayList<>();
            int index = i + 1;
            boolean condition = true, isBreak = false, add = false;

            if (inp[i] % k == 0) System.out.println(inp[i]);

            if (inp[i] + 1 == inp[i + 1]) {
                sum = inp[i] + inp[i + 1];
                if (((sum % 3) == 0)) {
                    result.add(inp[i]);
                    result.add(inp[i + 1]);
                    add = true;
                    count++;
                    System.out.println(result);
                }
            } else continue;

            while (condition && index < inp.length - 1) {
                if (inp[index] + 1 == inp[index + 1]) {              // i = 0(1), index = 1(2), index + 1 = 2(3)
                    sum += inp[index + 1];
                    if ((sum % k) == 0) {
                        if (!add) {
                            result.add(inp[i]);
                            result.add(inp[i + 1]);
                            count++;
                        }
                        result.add(inp[index] + 1);
                        count++;
                        System.out.println(result);
                    } else break;
                    index++;
                } else {
                    condition = false;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
