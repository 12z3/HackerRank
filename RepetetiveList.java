package hackerRank;

import training.Methods;
import java.util.Scanner;

public class RepetetiveList extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        // In:    {1, 1, 2, 3, 4, 4, 4, 4, 4, 5, 5, 6, 7, 9};
        // Out: = {1, 2, 3, 4, 5, 6, 7, 9};
        //        {1, 1, 1, 1, 1, 1};


       int[] arr = {1, 1, 2, 3, 4, 4, 4, 4, 4, 5, 5, 6, 7, 9};
       int[] tmp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {            // Ако намери съвпадение записва "0" в tmp na същата позиция "i".
                    tmp[i] = 0;
                    break;
                }
            }
        }

        printIntArray(arr);
        printIntArray(tmp);
        printNoZeroIntDArray(tmp);                // Печата tmp без нулите.





    }
}
