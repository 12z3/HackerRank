package hackerRank;

public class HRMarcsCakewalk{
    private static long marcsCakewalk(int[] massive) {
        long result = 0;
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (massive[i] > massive[j]) {
                    int temp = massive[i];
                    massive[i] = massive[j];
                    massive[j] = temp;
                }
            }
        }

        for (int i = 0; i < massive.length; i++) {
            result += (long) Math.pow(2, i) * massive[i];
        }
        return result;
    }

//    public static long marcsCakewalk(List<Integer> input) {
//        ArrayList<Integer> input = new ArrayList<>();
//        long res = 0;
//        for (int i = 0; i < input.size(); i++) {
//            for (int j = 0; j < input.size(); j++) {
//                if (input.get(i) > input.get(j)) {
//                    int temp = input.get(i);
//                    input.set(i, input.get(j));
//                    input.set(j, temp);
//                }
//            }
//        }
//
//        for (int i = 0; i < input.size(); i++) {
//            res += (long) Math.pow(2, i) * input.get(i);
//        }
//        return res;
//    }

    public static void main(String[] args) {

        /**
         @Problem: https://www.hackerrank.com/challenges/marcs-cakewalk/
         problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
         @Discussions: https://www.hackerrank.com/challenges/marcs-cakewalk/forum
         */


        int[] massive = {7, 4, 9, 6};
        System.out.printf("%d ", marcsCakewalk(massive));

    }
}
