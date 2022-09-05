package hackerRank;
import java.util.ArrayList;
import java.util.List;

public class HRJumpingOnTheClouds {

    /**
     * @Problem: The player can jump on any cumulus cloud having a number
     * that is equal to the number of the current cloud plus  or .
     * The player must avoid the thunderheads.
     * Determine the minimum number of jumps it will take to jump from the starting position
     * to the last cloud. It is always possible to win the game.
     * <p>
     * For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.
     * <p>
     * @Web: <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds/
     * problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign">...</a>
     * @Discussions: <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds/forum">...</a>
     */


    public static void main(String[] args) {
        List<Integer> input1 = new ArrayList<>(List.of(0, 1, 0, 0, 0, 1, 0));
        List<Integer> input2 = new ArrayList<>(List.of(0, 0, 1, 0, 0, 1, 0));
        List<Integer> input = new ArrayList<>(List.of(0, 0, 0, 1, 0, 0));
        List<Integer> input3 = new ArrayList<>(List.of(0, 0, 0, 0, 1, 0));

        System.out.println(jumpingOnTheClouds(input));
    }

    private static int jumpingOnTheClouds(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        int jump = 0;
        for (int i = 0; i < input.size() - 1; ) {
            if (i == 0 && input.get(0) == 0) result.add(0);
            if (i + 2 < input.size() && input.get(i + 2) == 0) {
                i += 2;
                result.add(i);
                jump++;
            } else if (i < input.size()) {
                i++;
                result.add(i);
                jump++;
            }
        }

        for (int el : result) System.out.print(el + " ");
        System.out.println();
        return jump;
    }


}
