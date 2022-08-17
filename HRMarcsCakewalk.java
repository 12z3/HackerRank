package hackerRank;
public class HRMarcsCakewalk{
    private static long marcsCakewalk(int[] massive) {
        long result = 0;
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (massive[i] > massive[j]) {
                    int temp = massive[i];
                    massive[i] = massive[j];
                    massive[j] = temp;
                }
            }
        }

        for (int i = 0; i < massive.length; i++) {
            result += (long) Math.pow(2, i) * massive[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] massive = {7, 4, 9, 6};
        long result = 0;

        System.out.printf("%d ", marcsCakewalk(massive));

    }
}
