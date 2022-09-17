package hackerRank;

public class HRNumberLineJumps {
    /**
     * @Problem: <a href="https://www.hackerrank.com/challenges/kangaroo/problem">...</a>
     * @Discussions: <a href="https://www.hackerrank.com/challenges/kangaroo/forum">...</a>
     */

    public static void main(String[] args) {

        //System.out.println( numberLineJumps(0,3,4,2));
        //System.out.println( numberLineJumps(0,2,5,3));
        System.out.println( numberLineJumps(4523, 8092, 9419, 8076));
    }

    private static String numberLineJumps(int x1, int v1, int x2, int v2) {
        int cont1 = 0, count2 = 0;
        int s1 = 0, s2 = 0;
        boolean isYes = false, isNo = false;

        while (x2 < 1000000000) {
            s1 = x1 + v1;
            x1 = s1;
            s2 = x2 + v2;
            x2 = s2;
            if (s1 == s2) {
                return "YES";
            }
        }
        return "NO";
    }
}
