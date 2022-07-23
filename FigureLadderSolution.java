package hackerRank;

import training.Methods;

import java.util.Scanner;

public class FigureLadderSolution extends Methods {

    public static String line(String symbol, int count) {
        StringBuilder line = new StringBuilder(" ");
        for (int i = 0; i < count; i++) {
            line.append(symbol);
        }
        return line.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        for (int i = 0; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {                       // Това са КОЛОНИТЕ на i-я ред.   <--
                if (j < 5) {
                    System.out.print(" ");
                } else System.out.print(line("#", i + 1));
            }
            System.out.println();
        }
    }
}

