package hackerRank;

import training.Methods;
import java.util.Scanner;

public class PangramsHRTask extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        /*

        https://www.hackerrank.com/challenges/pangrams/
        problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

         A pangram is a string that contains every letter of the alphabet.
         Given a sentence determine whether it is a pangram in the English alphabet.
         Ignore case. Return either pangram or not pangram as appropriate.
         */

        /*                                                                                 !!!
        Важното е построяването на обхождането с двата фор-цикъла.
        Първият обхожда ВСЕКИ елемент КОЙТО ЩЕ СЕ ТЪРСИ.
        Вторият обхожда ВСИЧКИ елементо В КОИТО ШЕ СЕ ТЪРСИ всеки един символ от първият фор-цикъл.

        Ако им размениш местата (на фор-циклите) резултата ще е коренно различен.
        */

        int countMatchChars = 0;
        boolean isMatch = false;
        StringBuilder stb = new StringBuilder();
        StringBuilder resultMissingChars = new StringBuilder();
        StringBuilder resultNoMatchCounts = new StringBuilder();

        // the quck brown fox jumps over the lazy dog
        // we promptly judged antique ivory buckles or the prize  ? x

        String[] str = scanner.nextLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            stb.append(str[i]);
        }

        for (int j = 97; j <= 122; j++) {     // Много е важно как са подредени фор-те. В случая търси дали
            countMatchChars = 0;              // ...j се среща в stb.
            for (int l = 0; l < stb.length(); l++) {
                if (stb.charAt(l) == (char) j) {
                    countMatchChars++;
                }
            }
            if (countMatchChars == 0) {
                resultMissingChars.append((char) j);
            }
        }
        if (stb.length() == 0) {
            System.out.println("True.");
        } else System.out.println("Not True !");

        System.out.print("Missing chars is: ");
        for (int i = 0; i < resultMissingChars.length(); i++) {
            if (resultMissingChars.charAt(i) != 0) {
                System.out.print("'" + resultMissingChars.charAt(i) + "'" );
            }
        }

    }
}
