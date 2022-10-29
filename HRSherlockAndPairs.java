package hackerRank;

import java.util.List;
import java.util.Objects;

public class HRSherlockAndPairs {
    public static void main(String[] args) {

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
                if (i != j && (Objects.equals(a.get(i), a.get(j)))) count++;
            }
        }
        return count;
    }


}
