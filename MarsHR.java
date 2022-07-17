package hackerRank;

import training.Methods;

import java.util.Scanner;

public class MarsHR extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        // https://www.hackerrank.com/challenges/mars-exploration/problem?utm_
        // campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

        // SOSSPSSQSSOR;
        // SOSTOT

        String input = "SOSSPSSQSSOR";
        String message = "SOS";
        String literal = "";
        StringBuilder stb = new StringBuilder();

        int k = 0, j = 0, r = 0;

        while (j < input.length()) {
            stb.append(input.charAt(k));
            literal += input.charAt(k);
            k++;

            if ((k % 3) == 0) {
                for (int l = 0; l < literal.length(); l++) {
                    if (stb.charAt(l) != message.charAt(l)) {
                        r++;
                    }
                }
                stb.delete(0, k);
                literal = "";
            }
            j++;
        }

        System.out.println(r);

        /* OLD
         while (j < input.length()) {
         if (k != 0) {
         while (((k % 3) != 0)) {
         stb.append(input.charAt(k));
         literal += input.charAt(k);
         k++;
         }
         for (int l = 0; l < literal.length(); l++) {          // Брои различните букви
         if (literal.charAt(i) != message.charAt(i)){
         r++;
         result[k] = r;
         }
         }
         //            if (!(literal.equals("SOS"))) {             // Ще го преброи като разлика ако Цялата дума е различна.
         //                r++;
         //                result[i++] = r;
         //            }
         }
         //System.out.println(literal);
         //System.out.println(stb);
         j = k;
         k = j + 1;                                   // Пропуска "P"
         stb.delete(0, stb.length());
         literal = "";
         if (k == 1) {
         stb.append(input.charAt(0));
         literal += input.charAt(0);
         result[0] = 0;
         }
         }

         System.out.println(r);
         printIntArray(result);

         */

    }
}
