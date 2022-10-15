package hackerRank;

public class HRFindDigits {
    /**
     * @Problem: An integer d is a divisor of an integer n if the remainder of n /d = 0.
     * Given an integer, for each digit that makes up the integer determine whether it is a divisor.
     * Count the number of divisors occurring within the integer.
     */
    public static void main(String[] args) {

       // System.out.println(findDigit(124));
        //System.out.println(findDigit(124));
        System.out.println(findDigit(1012));
    }

    private static int findDigit(int number) {
        int digitCount = 0, num1 = number;
        while (num1 > 0) {
            int digit = num1 % 10;
            if (digit != 0 && (number % digit) == 0) digitCount++;
            num1 = num1 / 10;
        }
        return digitCount;
    }
}
