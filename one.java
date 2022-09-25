package hackerRank;

import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        int[] arr = {4, 9, 3, 6, 2};
        int minIndex = Integer.MAX_VALUE;

        System.out.println(min(arr));

        for (int j = 0; j < arr.length ; j++) {
            if (arr[j] > min(arr)){
                int tmp = arr[j];
                arr[j] = arr[minIndex(arr)];
                arr[minIndex(arr)] = tmp;
                //minIndex = j;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            minIndex = i;
        }
        return min;
    }
    public static int minIndex(int[] arr){
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            minIndex = i;
        }
        return minIndex;
    }

}
