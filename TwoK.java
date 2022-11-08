package task.hackerRank;

import training.Methods;

import java.util.Scanner;

public class TwoK extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        int first = 0;
        int second = 0;

        for (int i = 0; i < 10; i++) {
            while (second < 2000){
                second = 2 * first + 1;
                first = second;
                System.out.print(second + " ");
            }
        }



    }
}
