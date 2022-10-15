package hackerRank;

public class HRAppendAndDelete {
    /**
     * @Problem: https://www.hackerrank.com/challenges/append-and-delete/problem?utm_campaign=challenge
     * -recommendation&utm_medium=email&utm_source=24-hour-campaign&h_r=next-challenge&h_v=zen&h_r=next
     * -challenge&h_v=zen&h_r=next-challenge&h_v=zen
     */

    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
    }

    private static String appendAndDelete(String s, String t, int k){
        String result = "";
        int min = Math.min(s.length(), t.length());

        if (s.length() % t.length() == 0 && min <= k){
            result = "YES";
        } else result = "NO";


        return result;
    }

    private static String appendAndDelete1(String s, String t, int k){
        String result = "";

        if (s.length() == t.length() && s.length() <= k){
            result = "YES";
        } else if (s.length() == t.length() && s.length() >= k) {
            result = "NO";
        } else if (s.length() != t.length() && t.length() <= k) {
            result = "YES";
        } else result = "NO";


        return result;
    }
}
