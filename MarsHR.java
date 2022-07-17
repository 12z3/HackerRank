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
        String[] words = new String[input.length() / 3];

        int index = 0, wordCount = 0, p = 0, j = 0;

        while (j < input.length()) {
            stb.append(input.charAt(index));                           // Добавяй буквите на input в stb.
            literal += input.charAt(index);
            index++;

            if ((index % 3) == 0) {                                    // На всяка трета буква:
                for (int l = 0; l < literal.length(); l++) {
                    if (stb.charAt(l) != message.charAt(l)) {          // провери ... "stb.charAt(l) ?= SOS"
                        wordCount++;                                        // преброй различните букви
                        words[p++] = literal;                          // Запазва сгрешените думи в масив
                    }
                }
                // word[p++] = literal;                                // Запазва проверените думи в масив.
                // System.out.print(stb + " ");
                stb.delete(0, index);                                  // изтрий stb
                literal = "";
            }
            j++;
        }

        System.out.println("Text is: " + input + "; " + "Key: " + message + ";");
        System.out.print("Different word is: " + wordCount + " -> ");
        for (String el : words) {
            if (el != null) System.out.print(el + " ");
        }

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
