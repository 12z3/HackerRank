package hackerRank;

import training.Methods;

import java.util.Scanner;

public class Word extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        // Има ли я думата "word" в низа "text1"...?

        String text = "alabala opa opa";
        String text1 = "alavopa";                   // Има значение от броя на буквите.
        String[] input = text.split(" ");
        String[] input1 = text.split(" ");

        String word = "opa";
        int countMatches = 0, i = 0, k = 0, countChar = 0;
        StringBuilder stb = new StringBuilder();

//        for (int i = 0; i < input.length; i++) {
//            if (input[i].equals(word)) {
//                countMatches++;
//            }
//        }
//        if (countMatches > 0) {
//            System.out.print("''" + word + "''" + " matches is " + countMatches + " times.");
//        } else System.out.println("No Ok...");

        // -------------------------------------------------------------------------------------

//        while (i < text1.length()) {
//            stb.append(text1.charAt(k));
//            k++;
//
//            if ((k % word.length() == 0)) {
//                countChar = 0;
//                for (int j = 0; j < word.length(); j++) {
//                    if (stb.charAt(j) == word.charAt(j)) {
//                        countChar++;
//                    }
//                }
//                if (countChar == word.length()){
//                    System.out.print("Ok");
//                }
//                stb.delete(0, word.length());
//            }
//            i++;
//        }

        for (int j = 0; j < text1.length(); j++) {
            k = 0;
            stb.delete(0, word.length());
            stb.append(text1.charAt(j));
            k++;
            for (int l = j + 1; l < text1.length(); l++) {
                stb.append(text1.charAt(l));
                k++;                           //Ред 59: Дължината на създадения stb съвпада ли с дължината на думата ?
                if ((k % word.length() == 0) && l < text1.length() ) {
                    countChar = 0;
                    for (int t = 0; t < word.length(); t++) {
                        if (stb.charAt(t) == word.charAt(t)) {
                            countChar++;
                        }
                    }
                    if (countChar == word.length()) {
                        System.out.print("Ok ");
                    }
                    stb.delete(1, word.length());
                    k = k - (word.length() - 1);              // Маха в случая двете последно добавени букви.
                }
            }
        }

    }
}
