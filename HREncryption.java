package hackerRank;

import training.Methods;

import java.util.Scanner;

public class HREncryption extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();


        // https://www.hackerrank.com/challenges/encryption/problem?utm_campaign=challenge-recommendation&utm_
        // medium=email&utm_source=24-hour-campaign

        // if man was meant to stay on the ground dog would have given os roots
        // have a nice day
        // feed the dog


        // encrypting
        String message = "have a nice day";
        String[] input = message.split(" ");
        StringBuilder stb = new StringBuilder();
        StringBuilder encrypt = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            if (!(input[i].equals(" "))) {
                stb.append(input[i]);
            }
        }
        System.out.println("Message: " + stb);
        System.out.println();

        double inputLength = Math.sqrt(stb.length());
        int col = (int) Math.ceil(inputLength);
        int row = (int) Math.floor(inputLength);

        char[][] result = new char[row][col];
        System.out.printf("row = %d, col = %d\n", row, col);

        int k = 0;
        boolean isBreak = false;
        for (int i = 0; i < row; i++) {                                    // ->> // [1][0]->[2][0]->[3][0]-> row.
            for (int j = 0; j < col; j++) {                                       // [0][1]->[0][2]->[0][3]-> col.
                if (k < stb.length()) {
                    System.out.print(stb.charAt(k) + " ");
                    result[i][j] = stb.charAt(k);
                    //System.out.print(result[i][j] + " ");
                    k++;
                } else {
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) break;
            System.out.println();
        }

        for (int j = 0; j < col; j++) {                  // <- Обхожда масива колона по колона, а не ред по ред.
            if (j != 0) encrypt.append(" ");             // Т.е: За всеки ред от дадена колона....
            for (int i = 0; i < row; i++) {              // <-
                if (result[i][j] != 0) encrypt.append(result[i][j]);                  // [1][0]->[2][0]->[3][0]-> row.
            }                                                                  // ->> // [0][1]->[0][2]->[0][3]-> col.
        }
        System.out.println();
        System.out.print("encrypt = " + encrypt + "\n");


        // decrypting
        int[] spceIndexes;
        StringBuilder decrypt = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (k < stb.length()) {
                    result[i][j] = encrypt.charAt(k);
                    k++;
                } else {
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) break;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (result[i][j] != 0) decrypt.append(result[i][j]);
            }
        }
        System.out.print("decrypt = " + decrypt + "\n");
    }
}
