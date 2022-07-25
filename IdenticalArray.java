package hackerRank;

import training.Methods;
import java.util.Scanner;

public class IdenticalArray extends Methods {
                                                                          // identicalArray -> Не работи...
    public static boolean identicalArray(int[] a, int[] b) {
        boolean[] isMacH = new boolean[a.length];
        boolean isIdentical = false;
        int count = 0;

        if (a.length != b.length) {
            System.out.print("Array is Not IDENTICAL \n");
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            isMacH[i] = false;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == b[j]) {
                    isMacH[i] = true;                     // Това ще запомни само ПОСЛЕДНОТО сравнение
                }
            }
        }

        for (boolean el : isMacH) {
            if (el) {
                count++;
            }
            if (count == 12) {
                isIdentical = true;
            } else {
                isIdentical = false;
            }
        }

        if (isIdentical) {
            System.out.print("Array is Identical \n");
        } else {
            System.out.print("Array is Not IDENTICAL \n");
        }
        return isIdentical;
    }

    public static void identicalMassive(int[] arr, int[] brr) {
        int countA = 0, countB = 0, count = 0;
        int[] resultAinA = new int[arr.length];                                  // {0, 0, 3, 0, 33, 3}
        int[] resultAinB = new int[brr.length];                                  // {0, 0, 3, 3, 33, 0}

        int countOfElementsInArray = arr.length;
        if (arr.length != brr.length)  {
            System.out.print("Array is Not IDENTICAL \n");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            countA = 0; countB = 0;                       // За всеки елемент брояча се нулира.
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    countA++;                             // Колко пъти даден елемент се съдържа в 1-я масив.
                    resultAinA[i] = countA;               // [4, 4, 1, 4, 1, 4]
                }
            }
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    countB++;                            // Колко пъти същият елемент се съдържа в 2-я масив.
                    resultAinB[i] = countB;              // [4, 4, 1, 4, 1, 4]
                }
            }
        }
//        if (countA == countB) {                         // count помни бройката съвпадения само за последният елемент.
//            System.out.print("Array is Identical \n");  // ... Не върши работа в този си вид.
//        } else {                                               // {0, 0, 3, 0, 133, 3}
//            System.out.print("Array is Not IDENTICAL \n");     // {0, 0, 3, 3, 33, 0}; -> Гърми
//        }
        for (int i = 0; i < countOfElementsInArray; i++) {
            if (resultAinA[i] == resultAinB[i]) count++;
        }
        if (count == countOfElementsInArray){
            System.out.print("Array is Identical \n");
        } else {
            System.out.print("Array is Not IDENTICAL \n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        int[] as = {0, 0, 3, 0, 133, 3};
        int[] az = {0, 0, 3, 3, 33, 0};
        identicalMassive(as, az);     // Не работи....


    }
}
