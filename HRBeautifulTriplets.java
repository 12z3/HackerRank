package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class HRBeautifulTriplets {
    /**
     * @Problem: <a href="https://www.hackerrank.com/challenges/beautiful-triplets/">...</a>
     * problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     *
     * @Discussions: <a href="https://www.hackerrank.com/challenges/beautiful-triplets/forum">...</a>
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 4, 5, 7, 8, 10));

        System.out.println(beautifulTriplets(list, 3));
    }

    private static int beautifulTriplets(List<Integer> input, int d) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < input.size(); i++) {
            int a = input.get(i);
            int b = a + d;
            int c = b + d;
            if (input.contains(a) && input.contains(b) && input.contains(c)){
                result.append(a).append(b).append(c).append(" ");
                count++;
            }
        }
        return count;
    }
}

//    private static int beautifulTriplets(List<Integer> arr, int d) {
//        StringBuilder stb = new StringBuilder();
//        StringBuilder indexes = new StringBuilder();
//        int count = 0;
//
//        for (int i = 0; i < arr.size(); i++) {
//            int a = arr.get(i);
//            for (int j = i + 1; j < arr.size(); j++) {
//                int b = arr.get(j);
//                for (int k = j + 1; k < arr.size() ; k++) {
//                    int c = arr.get(k);
//
//                    if (b - a == c - b && c- b == d){
//                        stb.append(a).append(b).append(c).append(" ");
//                        indexes.append(i).append(j).append(k).append(" ");
//                        count++;
//
//                    }
//                }
//
//            }
//        }
//        System.out.println(stb);
//        System.out.println(indexes);
//        return count;
