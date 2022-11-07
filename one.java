package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class one {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();

        int[] a = {1, 2, 3, 6, 7, 8};

        for (int i = 0; i < a.length - 1; i++) {
            ls = new ArrayList<>();
            int el1 = a[i], el2 = a[i + 1], index = i + 1;
            boolean add = false;

            while (compare(el1, el2) && index < a.length - 1){
                if (add){
                    ls.add(el2);
                }else {
                    ls.add(el1);
                    ls.add(el2);
                }
                add = true;
                el1 = a[index];
                el2 = a[index + 1];
                index++;
            }
        }

        System.out.println(ls);                          // [1, 2, 2, 3, 3, 4, 6, 7, 2, 3, 3, 4, 6, 7, 6, 7]
    }

    private static boolean compare(int el1, int el2) {
        return el1 + 1 == el2;
    }
}
