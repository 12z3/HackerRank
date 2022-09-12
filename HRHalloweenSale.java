package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class HRHalloweenSale {
    /**
     * @Problem: You wish to buy video games from the famous online video game store Mist.
     * <p>
     * Usually, all games are sold at the same price, P dollars.
     * However, they are planning to have the seasonal Halloween Sale next month
     * in which you can buy games at a cheaper price. Specifically,
     * the first game will cost P dollars, and every subsequent game
     * will cost D dollars less than the previous one.
     * This continues until the cost becomes less than or equal to M dollars,
     * after which every game will cost M dollars. How many games can you buy during the Halloween Sale?
     * @Web: <a href="https://www.hackerrank.com/challenges/halloween-sale/problem?utm_campaign=challenge-">
     * recommendation&utm_medium=email&utm_source=24-hour-campaign&h_r=next-challenge&h_v=zen ...</a>
     * @Discussions: <a href="https://www.hackerrank.com/challenges/halloween-sale/forum">...</a>
     */

    public static void main(String[] args) {
        System.out.println(halloweenSale(20, 3, 6, 70));
        //int p = 20, d = 3, m = 6, s = 70;
    }

    private static int halloweenSale(int p, int d, int m, int s) {
        int money = p, count = 0, price = s;
        List<Integer> list = new ArrayList<>();

        while (money <= price) {
            if ((p - d) > m) {
                list.add(p - d);
                money += (p - d);
                p -= d;
                count++;
            } else {
                list.add(m);
                money += m;
                count++;
            }
        }
        System.out.println(list);
        return count;
    }
}
