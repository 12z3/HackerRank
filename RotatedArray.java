package hackerRank;

import training.Methods;

public class RotatedArray extends Methods {
    public static void main(String[] args) {

        /**
         * Java Program to rotate array in Java
         * Problem : Rotate an integer array of n elements after kth index.
         * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7]
         * is rotated to [5,6,7,1,2,3,4]
         *
         * @author Javin Paul
         */

        int k = 2;
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] tmp = new int[a.length];

        for (int i = k + 1, j = 0; i <a.length ; i++, j++) {
            tmp[j] = a[i];
        }
        for (int i = a.length - 1 - k, j = 0; i < a.length ; i++, j++) {
            tmp[i] = a[j];
        }

//        for (int i = k + 1; i < a.length; i++) {
//            if (j <= k + 1) {
//                tmp[j] = a[i];
//                j++;
//            }
//        }
//        j = 0;
//        for (int i = a.length - k - 1; i < a.length; i++) {
//            if (j < tmp.length) {
//                tmp[i] = a[j];
//                j++;
//            }
//        }

        printIntArray(tmp);


    }
}
