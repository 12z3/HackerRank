package hackerRank;

public class HRSherlockAndSquares {

    /**
     * @Problem: Watson likes to challenge Sherlock's math ability.
     * He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints.
     * Sherlock must determine the number of square integers within that range.
     *
     * Note: A square integer is an integer which is the square of an integer, e.g.
     *
     * @Source: https://www.hackerrank.com/challenges/sherlock-and-squares/problem?utm_campaign=challenge-
     * recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussions: <a href="https://www.hackerrank.com/challenges/sherlock-and-squares/forum">...</a>
     */


    public static void main(String[] args) {
//        System.out.println(sherlockAndSquares(3, 9));
//        System.out.println(sherlockAndSquares(17, 24));
//        System.out.println(sherlockAndSquares(35, 70));
        System.out.println(sherlockAndSquares(100, 1000));

        int count = 0;
        double num = 0;
        StringBuilder stb = new StringBuilder();
        StringBuilder stb1 = new StringBuilder();
        StringBuilder stb2 = new StringBuilder();
                                                                            // Не четни: 2n + 1; Четни: 2n;
        for (double i = 24; i <= 49; i++ ) {                                // ... четното + 1
            stb2.append((int) i).append(" ");
            num = Math.floor(Math.sqrt(i));
            if (num * num == i) {
                stb.append((int) i).append(" ");
                stb1.append((int) num).append(" ");
                count++;
                i += 2 * num;                                               // -> прескача 2 * num + 1 индекса
            }
        }
        System.out.println(count);
        System.out.println(stb);
        System.out.println(stb1);
        System.out.println(stb2);
    }

    private static int sherlockAndSquares(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            double x = Math.floor(Math.sqrt(i));


        }
        return count;
    }
}
