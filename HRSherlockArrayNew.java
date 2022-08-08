package hackerRank;

import training.Methods;

import java.io.FileNotFoundException;

public class HRSherlockArrayNew extends Methods {
    public static void main(String[] args) throws FileNotFoundException {

        /**
         @Source: https://www.hackerrank.com/challenges/sherlock-and-array/problem
         @Web: https://www.youtube.com/watch?v=xPHJH8RL3mo
         @Discussions: https://www.hackerrank.com/challenges/sherlock-and-array/forum
         @Problem: Watson gives Sherlock an array of integers. His challenge is
         to find an element of the array such that the sum of all elements
         to the left is equal to the sum of all elements to the right.

         You will be given arrays of integers and must determine whether there is
         an element that meets the criterion. If there is, return YES. Otherwise, return NO.
         */

        int[] input = {1, 3, 4, 5, 6, 7};
        int[] input5 = {5, 6, 8, 11};
        int[] input4 = {2, 0, 0, 0};
        int[] input3 = {1, 3, 3, 3};
        int[] input1 = {1, 2, 3};

        System.out.println(sherlock(input));
        System.out.println(sherlockSum(input));
    }

    /**
     * @param  input
     * @return String: "YES" or "NO".
     * @Idea: Динамично разделя входният масив на две части и търси сумата от елементите им.
     * @Issue: На всяка итерация се създават по два Нови масива.
     */

    private static String sherlock(int[] input) {
        int sumL = 0, sumR = 0;
        int[] right, left;
        boolean isMatch = false;

        for (int i = 0; i < input.length; i++) {
            sumL = sumR = 0;                                    //  int[] input = {1, 3, 4, 5, 6, 7};
            if (i == 0) {                                       // Ако "i" = 0 -> Първи граничен случай
                sumL = input[i];                                // sumL = 1;
                for (int j = 1; j < input.length; j++) {
                    sumR += input[j];                           // sumR = 3+4+5+6+7
                }
                if (sumL == sumR) {
                    return "YES";
                } else continue;
            } else if (i == input.length - 1) {                  // Ако "i" = последното число -> Втори граничен случай
                sumR = input[input.length - 1];                  // sumR = 7
                for (int j = input.length - 2; j >= 0; j--) {
                    sumL += input[j];                            // sumL = 1+3+4+5+6;
                }
                if (sumL == sumR) {
                    return "YES";                          // Ако е изпълнено условието връща резултат и приключва...
                } else return "NO";                        // ... редовете от и след Ред: 61 не се изпълняват.
            } else {                                             // .. за всички останали "вътрешни" числа
                sumL = sumR = 0;                                 //  int[] input = {1, 3, 4, 5, 6, 7};
                left = new int[i];                 // Размера на лявата и дясната част се определя от стойността на "i".
                for (int j = 0; j < i; j++) {                    // В случая на i = 2 -> Лява част: -> [1,3]
                    left[j] = input[j];
                    sumL += left[j];
                }
                right = new int[input.length - i - 1];
                for (int j = 0; j < input.length - i - 1; j++) {
                    right[j] = input[j + i + 1];                 // В случая на i = 2 -> Дясна част: -> [5,6,7]
                    sumR += right[j];
                }
                if (sumL == sumR) {
                    isMatch = true;
                    break;
                }
            }
        }
        if (isMatch) {
            return "YES";
        }
        else return "NO";
    }

    static String sherlockSum(int[] arr) {                    // int[] arr = {1, 3, 4, 5, 6, 7};
        int sum = 0; int sumL = 0;

        for(int allDigit : arr){
            sum += allDigit;
        }
        for(int digit : arr){
            if(2 * sumL == sum - digit){
                return "YES";
            }else{
                sumL += digit;                                   // Добавя числата от дясно в ляво
            }                                                   // ... и ги сумира ако не е изпълнено равенството
        }
        return "NO";
    }

    // Официалният вариант:
//    public static String balancedSums(List<Integer> arr) {
//        // Write your code here
//        int sumL = 0, sumR = 0;
//        int[] right, left;
//        boolean isMatch = false;
//
//        for (int i = 0; i < arr.size(); i++) {
//            sumL = sumR = 0;
//            if (i == 0){
//                sumL = 0;
//                for (int j = 1; j < arr.size(); j++) {
//                    sumR += arr.get(j);
//                }
//                if (sumL == sumR) {
//                    return "YES";
//                } else continue;
//            } else if (i == arr.size() - 1){
//                sumR = 0;
//                for (int j = arr.size() - 2; j >= 0 ; j--) {
//                    sumL += arr.get(j);
//                }
//                if (sumL == sumR) {
//                    return "YES";
//                } else return "NO";
//            }else {
//                sumL = sumR = 0;
//                left = new int[i];
//                for (int j = 0; j < i; j++) {
//                    left[j] = arr.get(j);
//                    sumL += left[j];
//                }
//                right = new int[arr.size() - i - 1];
//                for (int j = 0; j < arr.size() - i - 1; j++) {
//                    right[j] = arr.get(j + i + 1);
//                    sumR += right[j];
//                }
//                if (sumL == sumR) {
//                    isMatch = true;
//                    break;
//                }
//            }
//        }
//        if (isMatch) {
//            return "YES";
//        }
//        else {
//            return "NO";
//        }
//    }
//

//    public static String balancedSums(List<Integer> arr) {
//        // Write your code here
//        int sumL = 0, sumR = 0;
//        int[] right, left;
//        boolean isMatch = false;
//
//        for (int i = 0; i < arr.size(); i++) {
//            sumL = sumR = 0;
//            //left = new int[i];
//            left = new int[0];                                     // За да излязат тестовете.
//            for (int j = 0; j < i; j++) {
//                left[j] = arr.get(j);
//                sumL += left[j];
//            }
//            //right = new int[arr.size() - i - 1];
//            right = new int[0];                                     // За да излязат тестовете.
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
