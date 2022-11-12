package hackerRank;

import java.util.*;
import java.util.Collections;

public class HRMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split(" ");

        List<Integer> a = new ArrayList<>();

       for (String el: line){
           a.add(Integer.parseInt(el));
       }

        System.out.println(findMedian(a));;
    }

    private static int findMedian(List<Integer> a) {
        Collections.sort(a);

        int median = 0, index = 0;
        if (a.size() % 2 != 0) {
            index = (a.size() / 2);
            median = a.get(index);
        } else {
            index = (a.size() / 2) - 1;
            median = (a.get(index) + a.get(index + 1)) / 2;
        }
        return median;
    }

//    private static int findMedian(List<Integer> a) {
//        int median, index;
//
//        if (a.size() % 2 != 0) {
//            index = (a.size() / 2);
//            median = a.get(index);
//        } else {
//            index = (a.size() / 2) - 1;
//            median = (a.get(index) + a.get(index + 1)) / 2;
//        }
//        return median;
//    }
}
