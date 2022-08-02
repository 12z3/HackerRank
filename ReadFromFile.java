package hackerRank;

import training.Methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile extends Methods {

    public static void openFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("1.txt"));
    }

    public static void readFile(){
        Scanner scanner = new Scanner(System.in);
        String[][] text = new String[5][3];

        while (scanner.hasNextLine()){
            for (int row = 0; row < text.length ; row++) {
                for (int col = 0; col < text.length; col++) {
                    text[row][col] = scanner.next();
                }
            }
        }
    }

    public static void out(){
        String[][] text = new String[5][3];
        for (int row = 0; row < text.length; row++) {
            for (int col = 0; col < text.length; col++) {
                System.out.print(text[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        openFile();
        readFile();
        out();
    }
}
