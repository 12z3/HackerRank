package hackerRank;

import training.Methods;

public class EncryptedMessages extends Methods {

    private static String encrypt(String text) {
        char[] charMassive = text.toCharArray();
        String encrypted = "";
        int key = 5;
        for (char el: charMassive) {
            el += key;
            encrypted += el;
        }
        return encrypted;
    }

    private static String decrypt(String text, int key){
        char[] charS = text.toCharArray();
        String decrypted = "";
        for (char el: charS) {
            el -= key;
            decrypted += el;
        }
        return decrypted;
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
