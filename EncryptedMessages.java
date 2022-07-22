package hackerRank;

import training.Methods;

public class EncryptedMessages extends Methods {

    private static String encrypt(String text) {
        char[] charMassive1 = stringToCharMassive(text);
        String encrypted = "";
        String encryptedAsTxt = "";
        int key = 5;
        for (char el: charMassive1) {
            el += key;
            encrypted += el;
        }

        encryptedAsTxt = encrypted.toString();
        return encryptedAsTxt;
    }

    private static String decrypt(String text, int key){
        String decrypt = "";
        char[] charS = text.toCharArray();
        for (char el: charS) {
            el -= key;
            decrypt += el;
        }
        return decrypt;
    }
    public static void main(String[] args) {

        String text = "Hello. Have a nice day.";
        String text1 = "Hello.Haveaniceday";
        char[] charMassive = text1.toCharArray();
        char[] charMassive1 = stringToCharMassive(text1);

        System.out.println("Original messages: " + text);
        System.out.println("Encrypted: " + encrypt(text));
        System.out.println("Decrypt messages: " + decrypt(encrypt(text),5));

    }
}
