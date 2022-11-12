package hackerRank;

import java.util.*;
import java.util.Collections;

public class HRMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a array size: ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter array elements separate by 'space' ");
        String[] line = scanner.nextLine().split(" ");

        List<Integer> a = new ArrayList<>();

        for (String el : line) {
            a.add(Integer.parseInt(el));
        }

        System.out.println(findMedian(a));
    }

    private static double findMedian(List<Integer> a) {
        Collections.sort(a);

        double median = 0;
        int index = 0;

        if (a.size() % 2 != 0) {
            index = (a.size() / 2);
            median = a.get(index);
        } else {
            index = (a.size() / 2) - 1;
            median = (double) (a.get(index) + a.get(index + 1)) / 2;
        }
        return median;
    }
}
