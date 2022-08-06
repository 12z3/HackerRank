package hackerRank;

import training.Methods;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HRSherlockArrayNew extends Methods {
    public static void main(String[] args) throws FileNotFoundException {

        /**
         @source: https://www.hackerrank.com/challenges/sherlock-and-array/problem
         @Problem: Watson gives Sherlock an array of integers. His challenge is
         to find an element of the array such that the sum of all elements
         to the left is equal to the sum of all elements to the right.

         You will be given arrays of integers and must determine whether there is
         an element that meets the criterion. If there is, return YES. Otherwise, return NO.
         */

        ArrayList<Integer> arl = new ArrayList<>();
        int[] input1 = {1, 3, 4, 5, 6, 7};
        int[] input5 = {5, 6, 8, 11};
        int[] input4 = {2, 0, 0, 0};
        int[] input3 = {1, 3, 3, 3};
        int[] input = {1, 2, 3};

        int[] left = new int[input.length], right = new int[input.length];
        int sumL = 0, sumR = 0, sum = 0;

        System.out.println(  sherlock(input));
    }

    /**
       @Idea: Динамично разделя входният масив на две части и търси сумата от елементите им.
     * @param input
     * @return
     */

    private static String sherlock(int[] input) {
        int sumL = 0, sumR = 0;
        int[] right, left;
        boolean isMatch = false;

        for (int i = 0; i < input.length; i++) {
            sumL = sumR = 0;
            if (i == 0){
                sumL = input[i];
                for (int j = 1; j < input.length; j++) {
                    sumR += input[j];
                }
                if (sumL == sumR) {
                    return "Yes";
                } else continue;
            } else if (i == input.length - 1){
                sumR = input[input.length - 1];
                for (int j = input.length - 2; j >= 0 ; j--) {
                    sumL += input[j];
                }
                if (sumL == sumR) {
                    return "Yes";
                } else return "No";
            }else {
            sumL = sumR = 0;
            left = new int[i];
            for (int j = 0; j < i; j++) {
                left[j] = input[j];
                sumL += left[j];
            }
            right = new int[input.length - i - 1];
            for (int j = 0; j < input.length - i - 1; j++) {
                right[j] = input[j + i + 1];
                sumR += right[j];
            }
            if (sumL == sumR) {
                isMatch = true;
                break;
                }
            }
        }
        if (isMatch) return "Yes";
        else return "No";
    }

//    public static String balancedSums(List<Integer> arr) {
//        // Write your code here
//        int sumL = 0, sumR = 0;
//        int[] right, left;
//        boolean isMatch = false;
//
//        for (int i = 0; i < arr.size(); i++) {
//            sumL = sumR = 0;
//            left = new int[i];
//            for (int j = 0; j < i; j++) {
//                left[j] = arr.get(j);
//                sumL += left[j];
//            }
//            right = new int[arr.size() - i - 1];
//            for (int j = 0; j < arr.size() - i - 1; j++) {
//                right[j] = arr.get(j + i + 1);
//                sumR += right[j];
//            }
//            if (sumL == sumR) {
//                isMatch = true;
//                //break;
//            }
//        }
//        if (isMatch){
//            return "Yes";
//        }
//        else {
//            return "No";
//        }
//    }



//    private static String sherlock(int[] input) {
//        int sumL =0, sumR = 0;
//        int[] right, left;
//        boolean isMatch = false;
//
//        for (int i = 0; i < input.length; i++) {
//            sumL = sumR = 0;                                               //  int[] input = {5, 6, 8, 11};
//            left = new int[i];                     // Размера на лявата и дясната част се определя от стойността на "i".
//            for (int j = 0; j < i; j++) {                                  // В случая на i = 2 -> [1,3]
//                left[j] = input[j];
//                sumL += left[j];
//            }
//            right = new int[input.length - i - 1];
//            for (int j = 0; j < input.length - i - 1; j++) {
//                right[j] = input[j + i + 1];                               // В случая на i = 2 -> [5,6,7]
//                sumR += right[j];
//            }
//            if (sumL == sumR) {
//                isMatch = true;
//                //break;
//            }
//        }
//        if (isMatch) return "Yes";
//        else return "No";
//    }

//    private static void sherlock(int[] input) {
//        int sumL;
//        int[] right;
//        int sumR;
//        int[] left;
//        for (int i = 0; i < input.length; i++) {
//            sumL = sumR = 0;
//            left = new int[i];
//            for (int j = 0; j < i; j++) {
//                left[j] = input[j];
//                sumL += left[j];
//            }
//            right = new int[input.length - i - 1];
//            for (int j = 0; j < input.length - i - 1; j++) {
//                right[j] = input[j + i + 1];
//                sumR += right[j];
//            }
//            if (sumL == sumR) {
//                System.out.printf("%s", "done\n");
//                System.out.printf("%d = %d", sumL, sumR);
//            }
//        }
//    }
}