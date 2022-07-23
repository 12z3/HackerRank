package hackerRank;

public class HRStarTriangle {
    public static void main(String[] args) {

        int row = 10;
        for (int i = 1; i < row; i++) {                         // За есеки ред "i":
            for (int j = 1; j <= row - i; j++) {                // Начератай "row - i" " "-и
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {                    // След което начертай, на същия ред, "i" на брой "*"
                System.out.print("*");                        // ? " *" || " * " => триъгълник ;)
            }
            System.out.println();
        }
    }
}
