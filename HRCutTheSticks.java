package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class HRCutTheSticks {

    /**
     * @Problem: You are given a number of sticks of varying lengths.
     *           You will iteratively cut the sticks into smaller sticks,
     *           discarding the shortest pieces until there are none left.
     *           At each iteration you will determine the length of the shortest stick remaining,
     *           cut that length from each of the longer sticks and then discard all the pieces of that shortest length.
     *           When all the remaining sticks are the same length, they cannot be shortened so discard them.
     *
     * @Source: https://www.hackerrank.com/challenges/cut-the-sticks/
     * problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @Discussion: https://www.hackerrank.com/challenges/cut-the-sticks/forum
     */

    public static void main(String[] args) {

//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = Arrays.asList(5, 4, 4, 2, 2, 8);
        List<Integer> list = new ArrayList<>(List.of(5, 4, 4, 2, 2, 8));
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));

        List<Integer> newList = new ArrayList<>(List.of());
        List<Integer> countList = new ArrayList<>(List.of());


        int min = Integer.MAX_VALUE, pos = 0, count = list.size();
        countList.add(count);

        for (int i = 0; i <= list.size(); i++) {
            pos = 0;
            System.out.println("list = " + list);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    pos = j;
                }
            }

            System.out.println("min = " + min + " pos = " + pos);

            newList.add(list.get(pos));
            System.out.println("newList: " + newList);

            for (int k = 0; k < list.size(); k++) {
                int el = list.get(k) - min;
                list.set(k, el);
            }

            System.out.println("list - min: " + list);

            list.removeIf(el -> el == 0 || el < 0);
            count--;
            countList.add(list.size());
            System.out.println("modlist: " + list + "\n");
            System.out.println(countList);
        }


//        public static List<Integer> cutTheSticks(List<Integer> arr) {
//            // Write your code here
//            List<Integer> newList = new ArrayList<>();
//            List<Integer> countList = new ArrayList<>();
//
//            int min = Integer.MAX_VALUE, pos = 0, count = arr.size();
//            countList.add(count);
//
//            for (int i = 0; i <= arr.size(); i++) {
//                pos = 0;
//
//                for (int j = 0; j < arr.size(); j++) {
//                    if (arr.get(j) < min) {
//                        min = arr.get(j);
//                        pos = j;
//                    }
//                }
//
//                newList.add(arr.get(pos));
//
//                for (int k = 0; k < arr.size(); k++) {
//                    int el = arr.get(k) - min;
//                    arr.set(k, el);
//                }
//
//                arr.removeIf(el -> el == 0 || el < 0);
//                count--;
//                countList.add(arr.size());
//            }
//            return countList;
//        }


    }
}
