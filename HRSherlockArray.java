package hackerRank;

import training.Methods;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HRSherlockArray extends Methods {
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
        int[] input = {5, 6, 8, 11};
        int[] input3 = {0, 2, 0, 0};

        int[] left = new int[input.length], right = new int[input.length];
        int sumL = 0, sumR = 0, sum = 0;

        System.out.println(  sherlock(input));
    }

    private static String sherlock(int[] input) {
        int sumL =0, sumR = 0;
        int[] right, left;
        boolean isMatch = false;

        for (int i = 0; i < input.length; i++) {
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
        if (isMatch) return "Yes";
        else return "No";
    }

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
