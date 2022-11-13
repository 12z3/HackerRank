package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(-1, 2, 3, -4, 5, 10));

        Collections.sort(arr);
        System.out.println(arr);

        List<Integer> maxLs = new ArrayList<>();
        int sum = 0, max = Integer.MIN_VALUE, index;

        for (int i = 0; i < arr.size(); i++) {
            index = i + 1;
            sum = arr.get(i);
            while (index < arr.size()){
                sum  += arr.get(index);
               // System.out.println(sum);
                index++;
            }
            if (sum > max) max = sum;
        }


        System.out.println(arr + " = " + max);
    }
}
