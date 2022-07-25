package hackerRank;

import training.Methods;
import java.util.Arrays;
import java.util.Scanner;

public class Shifts extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        {
            int[] tmp = {1, 2, 3, 4, 5, 6};
            System.out.println("tmp = " + Arrays.toString(tmp));
            int index = 0;

            for (int i = tmp.length - 1; i > index; i--) {                  // Премества на Дясно -> от Края.
                                                                            // 0. {1, 2, 3, 4, 5, 6};
                tmp[i] = tmp[i - 1];                                        // 1. {1, 2, 3, 4, 5, 5}
            }                                                               // 2. {1, 2, 3, 4, 4, 5}
            tmp[0] = 0;                                                     // 3. {1, 2, 3, 3, 4, 5}
            System.out.println("tmp = " + Arrays.toString(tmp));            // 4. {1, 2, 2, 3, 4, 5}
        }                                                                   // 5. {0, 1, 2, 3, 4, 5}

        int[] tmp = {1, 2, 3, 4, 5, 6};
        int index = 1;
        for (int i = index; i < tmp.length; i++) {                          // Премества на Ляво <- от Началото.
                                                                            // 0. {1, 2, 3, 4, 5, 6};
            tmp[i - 1] = tmp[i];                                            // 1. {2, 2, 3, 4, 5, 6}
        }                                                                   // 2. {2, 3, 3, 4, 5, 6}
        tmp[5] = 0;                                                         // 3. {2, 3, 4, 4, 5, 6};
        System.out.println("tmp = " + Arrays.toString(tmp));                // 4. {2, 3, 4, 5, 5, 6};
                                                                            // 5. {2, 3, 4, 5, 6, 0};
    }
}
