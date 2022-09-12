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
    }

    private static int halloweenSale(int p, int d, int m, int s) {
        //int p = 20, d = 3, m = 6, s = 70;
        int money = p, price = s;

        List<Integer> list = new ArrayList<>();

        list.add(p);
        while (true) {
            if (money + m < price) {
                if (p - d >= m) {
                    list.add(p - d);
                    money += (p - d);
                    p -= d;
                    s -= (p - d);
                } else {
                    list.add(m);
                    money += m;
                }
            } else break;

        }
        System.out.println(list);
        return list.size();
    }
}

//    public static int howManyGames(int p, int d, int m, int s) {
//        // Return the number of games you can buy
//        int res=0;
//        while(p>m){
//            s-=p;
//            if(s>0){
//                res++;
//            }
//
//            p-=d;
//        }
//        return s/m>=0?res+s/m:res;
//    }



//    public static int howManyGames(int p, int d, int m, int s) {
//        int res=0;
//        while(s>=p){
//            s=s-p;
//            res++;
//            p=p-d;
//            if (p<m) {
//                p=m;
//            }
//        }
//        return res;
//    }