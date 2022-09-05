package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        List<Integer> input1 = new ArrayList<>(List.of(0, 1, 0, 0, 0, 1, 0));
        List<Integer> input2 = new ArrayList<>(List.of(0, 0, 1, 0, 0, 1, 0));
        List<Integer> input = new ArrayList<>(List.of(0, 0, 0, 1, 0, 0));                 // 0 2 4 5 6 - 4
        List<Integer> input3 = new ArrayList<>(List.of(0, 0, 0, 0, 1, 0));
        List<Integer> result = new ArrayList<>();
        int jump = 0;

        for (int i = 0; i < input.size();) {
            if (i == 0 && input.get(0) == 0) result.add(0);
            if (i + 2 < input.size() && input.get(i + 2) == 0) {
                i += 2;
                result.add(i);
                jump ++;
            } else if (i < input.size()){
                i++;
                result.add(i);
                jump ++;
            }
        }

        for (int el : result) System.out.print(el + " ");
        System.out.println();
        System.out.println(jump);
    }


}
