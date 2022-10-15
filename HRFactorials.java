package hackerRank;

import java.math.BigInteger;

public class HRFactorials {
    /**
     * @Problem: https://www.hackerrank.com/challenges/extra-long-factorials/problem?utm_
     * campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign&h_r=next
     * -challenge&h_v=zen&h_r=next-challenge&h_v=zen
     */

    public static void main(String[] args) {

        System.out.println(factorials(25));
    }

    private static BigInteger factorials(int number) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
