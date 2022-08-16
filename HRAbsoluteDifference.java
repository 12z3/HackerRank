package hackerRank;

public class HRAbsoluteDifference {
    public static void main(String[] args) {


        /**
         @Problem: Given an array of integers,
         find the minimum absolute difference between any two elements in the array.

         @Web: https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/
         problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
         @Discussions: https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/forum
         */

        int[] input1 = {1, -3, 71, 68, 17};
        int[] input = {3, -7, 0};
        int[] input2 = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        int res = 0, k = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            k = 0;
            while (k < input.length) {
                if (i != k) {
                    res = input[i] - input[k];
                    if (res < 1) res  *= (-1);
                    if (res < min) min = res;
                }
                k++;
            }
        }
        System.out.println(min);


//        for (int i = 0; i < input.length; i++) {
//            while (k < input.length) {
//                int el = input[i];
//                int el1 = input[k];
//                if (el < 0) el *= (-1);
//                if (el1 < 0) el1 *= (-1);
//
//                if (i != k) {
//                    if (el > el1) {
//                        res = el - el1;
//                    } else res = el1 - el;
//                }
//                if (res < min) min = res;
//                k++;
//            }
//        }

    }
}
