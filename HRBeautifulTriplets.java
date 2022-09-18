package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class HRBeautifulTriplets {
    /**
     * @Problem: <a href="https://www.hackerrank.com/challenges/beautiful-triplets/">...</a>
     * problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
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
            int b = a + d, c = b + d;
            if (isResultContains(input, a, b, c)) {
                count++;
                result.append(a).append(b).append(c).append(" ");
            }
        }
        System.out.println(result);
        return count;
    }

    public static boolean isResultContains(List<Integer> list, int a, int b, int c) {
        boolean A = false, B = false, C = false;
        A = is(list, a);
        B = is(list, b);
        C = is(list, c);

        if (A && B && C) return true;
        return false;
    }

    private static boolean is(List<Integer> list, int el) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == el) return true;
        }
        return false;
    }
}

//    private static int beautifulTriplets(List<Integer> input, int d) {
//        StringBuilder result = new StringBuilder();
//        int count = 0;
//
//        for (int i = 0; i < input.size(); i++) {
//            int a = input.get(i);
//            int b = a + d, c = b + d;
//
//            if (input.contains(a) && input.contains(b) && input.contains(c)){
//                result.append(a).append(b).append(c).append(" ");
//                count++;
//            }
//        }
//        System.out.println(result);
//        return count;
//    }


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
//                    }
//                }
//            }
//        }
//        System.out.println(stb);
//        System.out.println(indexes);
//        return count;
