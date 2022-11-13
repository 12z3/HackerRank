package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(-1, 2, 3, -4, 5, 10));

        System.out.println(maximumSubarray(arr));
    }

    private static List<Integer> maximumSubarray(List<Integer> arr){
        List<Integer> maxLs = new ArrayList<>();
        List<Integer> idx = null;
        List<Integer> idx1 = null;
        List<Integer> ls;
        int sum = 0, max = Integer.MIN_VALUE, index, sumIdx = 0;


        for (int i = 0; i < arr.size(); i++) {
            ls = new ArrayList<>();
            idx = new ArrayList<>();
            idx1 = new ArrayList<>();
            sum = 0;
            index = i + 1;
            sum = arr.get(i);

            idx.add(i);
            ls.add(arr.get(i));
            while (index < arr.size()){
                ls.add(arr.get(index));
                sum  += arr.get(index);


                idx.add(index);
                index++;
            }
            if (sum > max) {
                max = sum;
                maxLs = ls;
                idx1 = idx;
            }
        }

        for (int i = 0; i < idx1.size(); i++) {
            sumIdx += i;
        }
        System.out.println(maxLs + " = " + max + " / " + sumIdx);
        System.out.println(idx1);
        return maxLs;
    }
}
