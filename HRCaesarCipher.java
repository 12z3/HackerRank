package hackerRank;

import training.Methods;

import java.util.Scanner;

public class HRCaesarCipher extends Methods {

    private static String encrypt(String input, int key) {
        char[] ch = input.toCharArray();
        StringBuilder stb = new StringBuilder();
        String encrypt = "";
        key %= 26;                                             // Без това Тестовете не минават.

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 97 && ch[i] <= 122) {                  // Ако ch[i] = a и е между 'а' и 'z' то:
                ch[i] += key;                                   // - модифицирай a -> d
                if (ch[i] > 122) {                              // Ако ch[i] = z то:
                    ch[i] = (char) (ch[i] - (122 - 96));        // - модифицирай z -> c
                }
                stb.append(ch[i]);                              // Добави ch[i] към "stb"
            } else if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] += key;
                if (ch[i] > 90) {
                    ch[i] = (char) (ch[i] - (90 - 64));
                }
                stb.append(ch[i]);
            } else stb.append(ch[i]);           // Ако ch[i] не съвпада с никоя от буквите от 'a' до 'z' и от 'A' до 'Z'
        }                                       // - то добави я към "stb"
        encrypt = stb.toString();
        return encrypt;
    }

    private static String decrypt(String encrypt, int key) {
        char[] ch = encrypt.toCharArray();
        StringBuilder stb = new StringBuilder();
        String dencrypt = "";
        key %= 26;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 97 && ch[i] <= 122) {
                ch[i] -= key;
                if (ch[i] < 97) {
                    ch[i] = (char) (ch[i] + (122 - 96));
                }
                stb.append(ch[i]);
            } else if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] -= key;
                if (ch[i] < 65) {
                    ch[i] = (char) (ch[i] + (90 - 64));
                }
                stb.append(ch[i]);
            } else stb.append(ch[i]);
        }
        dencrypt = stb.toString();
        return dencrypt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        /**
         @source: https://www.hackerrank.com/challenges/caesar-cipher-1/
         problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

         Original alphabet:      abcdefghijklmnopqrstuvwxyz
         Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
         @input: "There's-a-starman-waiting-in-the-sky" key = 3 -> Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb
         "abc-defghijklmnop'qrstuvwxyz"
         "middle-Outz" -> "okffng-Qwvb"
         */

        String input = "There's-a-starman-waiting-in-the-sky";
        String input2 = "abcdefghijklmnopqrstuvwxyz";
        String input3 = "ab'uv-wxy-z";

        System.out.println("encrypted: " + encrypt(input, 3));
        System.out.println("decrypted: " + decrypt(encrypt(input, 3), 3));


        /** @issue: Друг Поглед върху нещата: Но, не работи добре....*/

//        char[] ch = stringToCharMassive(input);
//        char[] tmp = new char[ch.length];
//        for (int i = k, j = 0; i < ch.length; i++, j++) {
//            tmp[j] = ch[i];
//        }
//        for (int i = ch.length - 1 - k + 1, j = 0; i < ch.length; i++, j++) {
//            tmp[i] = ch[j];
//        }
//
//        for (char el : ch) System.out.print(el + " ");
//        System.out.println();
//        for (char el : tmp) System.out.print(el + " ");


//        for (int i = k, j = 0; i < ch.length; i++, j++) {
//            for (int l = 97; l <= 122 ; l++) {
//                if (ch[i] == l){
//                    tmp[j] = ch[i];
//                    count++;
//                    break;
//                } else continue;
//            }
//        }
//        for (int i = ch.length - 1 - k + 1, j = 0; i < ch.length; i++, j++) {
//            for (int p = 97; p <= 122 ; p++) {
//                if (ch[j] == p){
//                    tmp[i] = ch[j];
//                    break;
//                } else continue;
//            }
//        }
    }
}
