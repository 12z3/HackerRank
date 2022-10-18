package hackerRank;

public class HRAppendAndDelete {
    /**
     * @Problem: https://www.hackerrank.com/challenges/append-and-delete/problem?utm_campaign=challenge
     * -recommendation&utm_medium=email&utm_source=24-hour-campaign&h_r=next-challenge&h_v=zen&h_r=next
     * -challenge&h_v=zen&h_r=next-challenge&h_v=zen
     */

    public static void main(String[] args) {
        System.out.println(appendAndDelete1("hackerhappy", "hackerrank", 9));
        // To convert S to T.
    }

    private static String appendAndDelete1(String s, String t, int k) {
        String result = "";
        int min = Math.min(s.length(), t.length());
        if (s.length() - t.length() >= 0 && (Math.abs(s.length() - t.length()) <= k)) {
            return "Yes";
        } else return "No";
    }
}
