package hackerRank;

import training.Methods;

import java.util.Scanner;

public class Repetitive extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();


        String a = "zxcvbnm";
        String b = "zxcvvvz";

        int count1 = 0, count2 = 0;
        int[] indexes = new int[a.length()];
        int[] counter = new int[a.length()];
        char[] differences = new char[a.length()];

        for (int i = 0; i < a.length(); i++) {
            count1 = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    count1++;
                }
            }
            counter[i] = count1;               // В масива "counter" на позиция "i" запиши стойността на "count1"
        }                                      // "i" е позицията на сравнявания елемент "a.charAt(i)"
        for (int i = 0; i < a.length(); i++) {
            System.out.printf(
                    "char: %c, on index %d = %d times\n", a.charAt(i), i, counter[i]);
        }
    }
}
