package hackerRank;

import training.Methods;
import java.util.Scanner;


public class StarsDiamond extends Methods {
    private static void printSpace(int countSpace) {
        StringBuilder stb = new StringBuilder();
        stb.append(" ");
        for (int i = 0; i < countSpace; i++) {
            System.out.printf("%s", stb);
        }
    }

    private static void printStars(int countStars) {
        String str = "";                                     // str+= "* " == stb.append("* ");
        StringBuilder stb = new StringBuilder();
        stb.append("* ");
        str += "* ";
        for (int i = 0; i < countStars; i++) {
            System.out.printf("%s", stb);
        }
    }
    private static void printOneSide(int count) {
        for (int i = count; i >= 0; i--) {                   // Обърне ли се логиката то Печата на "Обратно".
            printSpace(i);                                   // Всичко друго си остава така както Е.
            printStars(count - i + 1);
            System.out.println();
        }
    }

    private static void printOtherSide(int count) {
        for (int i = 1; i <= count; i++) {                   // Обърне ли се логиката то Печата на "Обратно".
            printSpace(i);                                   // Всичко друго си остава така както Е.
            printStars(count - i + 1);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();


        int count = 4, countStars = 0, countSpace = 0;
        StringBuilder strb = new StringBuilder();

        printOneSide(count);
        printOtherSide(count);
    }
}
