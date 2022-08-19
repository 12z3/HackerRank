package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HRGridChallenge {
    /**
     * @Problem: Given a square grid of characters in the range ascii[a-z],
     * rearrange elements of each row alphabetically, ascending.
     * Determine if the columns are also in ascending alphabetical order,
     * top to bottom. Return YES if they are or NO if they are not.
     *
     * @Source: https://www.hackerrank.com/challenges/grid-challenge/
     * problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussins: https://www.hackerrank.com/challenges/grid-challenge/forum
     *
     * @Input: ebacd   grid = {"ebacd", "fghij", "olmkn", "trpqs", "xywuv"}
     * fghij
     * olmkn
     * trpqs
     * xywuv
     *
     * @Output:
     * YES
     * abcde
     * fghij
     * klmno
     * pqrst
     * uvwxy
     */

    public static void main(String[] args) {

        String[] input = {"ebacd", "fghij", "olmkn", "trpqs", "xywuv"};
        String[] input1 = {"mpxz", "abcd", "wlmf"};
        String[] input2 = {"abc", "lmp", "qrt"};

        List<String> str = new ArrayList<>();
        StringBuilder stb = new StringBuilder();
        int countYES = 0, countNO = 0, countEl = 0;
        char[] a = new char[0];
        char[][] b;

        for (int i = 0; i < input.length; i++) {
            a = null;
            a = new char[input[i].length()];                 // a[дължината на всяка една дума / ebacd...fghij]
            for (int j = 0; j < input[i].length(); j++) {    // input[i].length() = броя букви в тази дума.
                a[j] = input[i].charAt(j);                   // input[i].charAt(j) = всяка една буква "j" от думата "i".
            }
            Arrays.sort(a);
            stb.append(a).append(" ");
        }

        System.out.println(stb);

        b = new char[input.length + 1][input.length + 1];       // Трябвда да се измисли за по ЦИВИЛИЗОВАН начин за -
        for (int row = 0; row < input.length; row++) {          // - инициализиране на b[row][col]....???
            for (int col = 0; col < a.length; col++) {
                b[row][col] = stb.charAt(col);                  // b[row][col] = всяка една буква от дадената дума.
            }
            stb.delete(0, a.length + 1);                        // премахва думите от поз. 0 до a.length =  броя букви.
        }                                                       // "+1" заради " ".
        for (int col = 0; col < input.length; col++) {
            for (int row = 0; row < a.length - 1; row++) {
                if (b[row][col] <= b[row + 1][col]) {          // Сравнява буквите по колони.
                    countYES++;                                // Обхожда масива по колони, а не по-редове.
                } else countNO++;
            }
        }

        if (countNO != 0) {
            System.out.print("NO");
        } else System.out.print("YES");


        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i][j] != 0) System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


        // Write your code here
//        StringBuilder stb = new StringBuilder();
//        int countYES = 0, countNO = 0;
//        char[] a = new char[0];
//        char[][] b;

//        for (int i = 0; i < grid.size(); i++) {
//            a = new char[grid.size()];
//            for (int j = 0; j < grid.size(); j++) {
//                a[j] = grid.get(i).charAt(j);
//            }
//            Arrays.sort(a);
//            stb.append(a).append(" ");
//        }
//
//        System.out.println(stb);
//
//        b = new char[grid.size()][a.length];
//        for (int row = 0; row < grid.size(); row++) {
//            for (int col = 0; col < a.length; col++) {
//                b[row][col] = stb.charAt(col);
//            }
//            stb.delete(0, a.length + 1);
//        }
//        for (int col = 0; col < grid.size(); col++) {
//            for (int row = 0; row < a.length - 1; row++) {
//                if (b[row][col] <= b[row + 1][col]) {
//                    countYES++;
//                } else countNO++;
//            }
//        }
//        if (countNO != 0) {
//            return "NO";
//        } else  return "YES";

    }
}
