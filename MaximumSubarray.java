package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(-1, 2, 3, -4, 5, 10));

       // Collections.sort(arr);
        System.out.println(arr);

        List<Integer> maxLs = new ArrayList<>();
        List<Integer> ls;
        int sum = 0, max = Integer.MIN_VALUE, index;

        for (int i = 0; i < arr.size(); i++) {
            ls = new ArrayList<>();
            sum = 0;
            index = i + 1;
            sum = arr.get(i);
            ls.add(arr.get(i));
            while (index < arr.size()){
                ls.add(arr.get(index));
                sum  += arr.get(index);
                System.out.println(sum);
                index++;
            }
            if (sum > max) {
                max = sum;
                maxLs = ls;
            }
            System.out.println("--------------------");
        }


        System.out.println(maxLs + " = " + max);
    }
}
