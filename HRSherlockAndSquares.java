package hackerRank;

public class HRSherlockAndSquares {
    public static void main(String[] args) {
//        System.out.println(sherlockAndSquares(3, 9));
//        System.out.println(sherlockAndSquares(17, 24));
//        System.out.println(sherlockAndSquares(35, 70));
        System.out.println(sherlockAndSquares(100, 1000));

        int count = 0;
        for (double i = 0; i <= 1000; i++) {
            double num = Math.floor(Math.sqrt(i));
            if (num * num == i) {
                count++;
                i += 2 * num;
            }

        }
        System.out.println(count);
    }

    private static int sherlockAndSquares(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            int x = i;
            if (x * x == i) count++;
        }
        return count;
    }
}
