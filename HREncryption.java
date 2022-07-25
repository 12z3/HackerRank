package hackerRank;

import training.Methods;

import java.util.Scanner;

public class HREncryption extends Methods {

    private static StringBuilder encrypt(String message) {
        String[] input = message.split(" ");
        StringBuilder encrypt = new StringBuilder();
        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            if (!(input[i].equals(" "))) stb.append(input[i]);
        }
        System.out.println("Message: " + stb);

        double inputLength = Math.sqrt(stb.length());
        int col = (int) Math.ceil(inputLength);
        int row = (int) Math.floor(inputLength);

        char[][] key = new char[row][col];
        System.out.printf("row = %d, col = %d\n", row, col);

        int index = 0;
        boolean isBreak = false;
        for (int i = 0; i < row; i++) {                                    // ->> // [1][0]->[2][0]->[3][0]-> row.
            for (int j = 0; j < col; j++) {                                       // [0][1]->[0][2]->[0][3]-> col.
                if (index < stb.length()) {
                    System.out.print(stb.charAt(index) + " ");
                    key[i][j] = stb.charAt(index);
                    //System.out.print(result[i][j] + " ");
                    index++;
                } else {
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) break;
            System.out.println();
        }
        System.out.println();

        for (int j = 0; j < col; j++) {                  // <- Обхожда масива колона по колона, а не ред по ред.
            if (j != 0) encrypt.append(" ");             // Т.е: За всеки ред от дадена колона....
            for (int i = 0; i < row; i++) {              // <-
                if (key[i][j] != 0) encrypt.append(key[i][j]);                  // [1][0]->[2][0]->[3][0]-> row.
            }                                                                   // ->> // [0][1]->[0][2]->[0][3]-> col.
        }

        System.out.print("encrypted: " + encrypt + "\n");
        return encrypt;
    }

    public static StringBuilder decrypt(StringBuilder encrypt) {
        int row = 4, col = 3;                                                  // Как взимаш "row" и "col" ?
        System.out.printf("row = %d, col = %d\n", row, col);

        char[][] key = new char[row][col];
        StringBuilder decrypt = new StringBuilder();
        StringBuilder tmp = new StringBuilder();

        for (int i = 0; i < encrypt.length(); i++) {
            if (encrypt.charAt(i) != 32) tmp.append(encrypt.charAt(i));
        }

        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (index < tmp.length()) {
                    key[i][j] = tmp.charAt(index++);
                    System.out.print(key[i][j] + " ");
                }
            }
            System.out.println();
        }

        for (int j = 0; j < col; j++) {                 // key[][] - остава непроменен. Обхожда се по-различен начин.
            for (int i = 0; i < row; i++) {
                if (key[i][j] != 0) decrypt.append(key[i][j]);
            }
        }
        System.out.println("decrypted: " + decrypt);
        return decrypt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();


        /**
          @sourse:
         https://www.hackerrank.com/challenges/encryption/
         problem?utm_campaign=challenge-recommendation&utm_

          @messages:
         - if man was meant to stay on the ground dog would have given os roots
         - have a nice day
         - feed the dog
         */

        String message = "have a nice day";
        decrypt(encrypt(message));

    }
}
