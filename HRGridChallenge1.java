package hackerRank;

import java.util.*;

public class HRGridChallenge1 {

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

    private static String gridChallenge1(List<String> lists) {
        StringBuilder stb = new StringBuilder();
        int countLength = 0, countNumbersOfCharInThatWord = 0;
        int countNo = 0;
        char[] a;

        for (int i = 0; i < lists.size(); i++) {
            a = new char[lists.get(i).length()];
            int p = 0;
            while (p < lists.get(i).length()) {
                a[p] = lists.get(i).charAt(p);
                p++;
            }
            Arrays.sort(a);
            stb.append(a);
            stb.append(" ");
        }

        System.out.println(stb);

        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).length(); j++) {
                countLength++;
            }
        }

        char[][] b = new char[lists.size() + 1][lists.size() + 1];
        for (int row = 0; row < lists.size(); row++) {
            countNumbersOfCharInThatWord = 0;
            for (int col = 0, l = 0; col < lists.get(row).length(); col++, l++) {
                b[row][col] = stb.charAt(l);
                countNumbersOfCharInThatWord++;
            }
            stb.delete(0, countNumbersOfCharInThatWord + 1);
        }

        for (int col = 0; col < lists.size(); col++) {
            for (int row = 0; row < lists.size() - 1; row++) {
                if (b[row][col] > b[row + 1][col]) countNo++;
            }
        }

        System.out.println();
        for (int row = 0; row < lists.size(); row++) {
            for (int col = 0; col < lists.get(row).length(); col++) {
                System.out.print(b[row][col] + " ");
            }
            System.out.println();
        }

        if (countNo != 0) {
            return "NO";
        } else return "YES";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = {"mpxz", "abcd", "wlmf"};                                
        String[] input = {"ebacd", "fghij", "olmkn", "trpqs", "xywuv"};


        List<String> lists = Arrays.asList("mpxz", "abcd", "wlmf");
        List<String> lists1 = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");

        gridChallenge1(lists);
    }
}

/**
 * mpxz abcd flmw
 * NO
 * m p x z
 * a b c d
 * f l m w
 */