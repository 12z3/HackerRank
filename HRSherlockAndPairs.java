package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HRSherlockAndPairs {
    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 33, 4, 4, 5, 6, 7, 8, 9));
        System.out.println(sherlockAndPairs(input));
    }

    /*
    Time limit exceeded:
         Your code did not execute within the time limits.
         Please optimize your code.
         For more information on execution time limits, refer to the environment page
     */

    public static int sherlockAndPairs(List<Integer> a) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (i != j && (Objects.equals(a.get(i), a.get(j)))) {
                    count++;
                    System.out.println("Number's: " + a.get(i) + " / " + a.get(j)
                            + "; " + "indexI = " + i + "; " + " indexJ = " + j + "; ");
                }
            }
        }
        return count;
    }


}
