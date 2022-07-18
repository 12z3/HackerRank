package hackerRank;

import training.Methods;
import java.util.Scanner;

public class GenerateNumber extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        int res = 0;
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            int tmp = scanner.nextInt();
            res = res * 10 + tmp;                     // Резултата = Старото стойност на "res" * 10 + новата.
        }
        System.out.println("res = " + res);
    }
}
