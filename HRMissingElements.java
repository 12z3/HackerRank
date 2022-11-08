package hackerRank;


import training.Methods;
import java.util.Scanner;

public class HRMissingElements extends Methods {

    private static int [] removeDuplicateElements(int[] arr) {
        int countDuplicate = 0, index = 0;
        boolean isChecked = false;
        int[] checkedElements = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            isChecked = false;

            if (i != 0){
                for (int j = 0; j < checkedElements.length; j++) {
                    if (arr[i] == checkedElements[j]) {                            // Търси съвпадения
                        isChecked = true;
                        break;
                    }
                }
            }
            if (isChecked) continue;                    // arr = {1, 2, 1, 1, 2, 2, 3, 4}
            // checkedElements[i] = arr[i];              // checkedElements = {1, 2, 0, 0, 0, 0, 3, 4} = non-duplicated

            for (int j = i + 1; j < arr.length; j++) {             // Не стига до тук ако е проверяван елемента -
                if (arr[i] == arr[j]) {                    // и има съвпадение -> if (arr[i] == checkedElements[j])
                    countDuplicate++;
                }
            }
            checkedElements[i] = arr[i];                    // checkedElements = {1, 2, 0, 0, 0, 0, 3, 4}
        }
        int mach = 0;
        int[] tmp = new int[arr.length - countDuplicate];

        for (int i = 0; i < checkedElements.length; i++) {
            if (checkedElements[i] != 0) {
                tmp[index++] = checkedElements[i];

            }
//        for (int i = 0; i < arr.length; i++) {
//            mach = 1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    mach++;
//                }
//            }
//            if (mach == 1) {
//                tmp[index++] = arr[i];                 // Записва елементи с Индекси -> 1, 4, 5
//            }                                          // Първо добавя елемента в tmp[l], след това увеличава л с 1.
        }
        arr = tmp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        // Given two arrays of integers,
        // ind which elements in the second array are missing from the first array.

        /*
         https://www.hackerrank.com/challenges/missing-numbers/
         problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

         -> If a number occurs multiple times in the lists,
         you must ensure that the frequency of that number in both lists is the same.

         If that is not the case, then it is also a missing number.
         Return the missing numbers sorted ascending.

         Only include a missing number once, even if it is missing multiple times.
         The difference between the maximum and minimum numbers in the original list is less than or equal to .

         */

        int[] a = {7, 2, 5, 3, 5, 3};
        int[] b = {7, 2, 5, 4, 6, 3, 5, 3};

//        int[] a = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
//        int[] b = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        int toIndex = 0;
        int count1 = 0, count2 = 0, p = 0;

        if (a.length > b.length) {
            toIndex = a.length;
        } else toIndex = b.length;

        int[] result = new int[toIndex];
        boolean[] result1 = new boolean[toIndex];

        for (int i = 0; i < a.length; i++) {
            count1 = 0;
            count2 = 0;

            for (int j = 0; j < b.length; j++) {
                if (b[i] == b[j]) {
                    count1++;                                   // Колко пъти b[i] се среща в собствения масив b[]
                }
            }
            for (int k = 0; k < a.length; k++) {
                if (b[i] == a[k]) {
                    count2++;                                   // Колко пъти b[i] се среща в 1-ят масив a[]
                }
            }
            if ((count1 != count2)) {
                result[p++] = b[i];
            }
        }
        result = removeZeroElementsFromArray(result);
        result = removeDuplicateElements(result);
        printIntArray(result);
    }

    //    private static int @NotNull [] removeDuplicateElements(int[] arr) {
//        int number = 0, l = 0;
//        for (int i = 0; i < arr.length; i++) {                 // [204, 204, 205, 206, 205, 206]
//            for (int j = i + 1; j < arr.length; j++) {         // Да се премахнат дублиращите елементи от масива
//                if (arr[i] == arr[j]) number++;                // [204, 205, 206]
//            }
//        }
//        int consT = 0;
//        int[] tmp = new int[arr.length - number];
//
//        for (int i = 0; i < arr.length; i++) {
//            consT = 1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                   consT++;
//
//                }
//            }
//            if (consT <= 1 && l < tmp.length) {
//                tmp[l++] = arr[i];                             // Записва елементи с Индекси -> 1, 4, 5
//            }                                              //Първо добавя елемента в tmp[l], след това увеличава л с 1.
//        }
//        arr = tmp;
//        return arr;
//    }
}
