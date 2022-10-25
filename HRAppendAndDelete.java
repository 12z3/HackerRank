package task.hackerRank;

public class HRAppendAndDelete {

    /**
     * ... convert s to t.
     *
     * @Problem: https://www.hackerrank.com/challenges/append-and-delete/problem?utm_campaign=challenge
     * -recommendation&utm_medium=email&utm_source=24-hour-campaign&h_r=next-challenge&h_v=zen&h_r=next
     * -challenge&h_v=zen&h_r=next-challenge&h_v=zen
     * @Discussions: <a href="https://www.hackerrank.com/challenges/append-and-delete/forum">...</a>
     */

    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder();
        StringBuilder stb1 = new StringBuilder();
        int count = 0, min = -1, max = 0;

//        String s = "hackerhappy"; // 1
//        String t = "hackerhappy";
//        int k = 3;

//        String s = "hackerrank"; // hackerhappy
//        String t = "hackerhappy";
//        int k = 9;

        String s = "aba"; // hackerhappy
        String t = "abaaba";
        int k = 3;

//        String s = "ashley"; // 3
//        String t = "ash";
//        int k = 2;


        System.out.println(compareString(s, t, k));
        System.out.println(appendAndDelete(s, t, k));

    }

    private static String compareString(String s, String t, int k) {
        int count = 0, min = -1, max = 0, index = 0;
        boolean isDifference = false;
        String answear = "";

//        if (s.length() <= t.length() && k > t.length()) {
//            answear += "Yes";
//        } else if (s.length() > t.length() && k > s.length()) {
//            answear += "Yes";
//        } else answear += "No";



        if (s.length() > t.length()) {
            min = t.length();
            max = s.length();
        } else {
            min = s.length();
            max = t.length();
        }

        for (int i = 0; i < min; i++) {
            // isDifference = false;
            if (s.charAt(i) != t.charAt(i)) {
                isDifference = true;
                index = i;
                break;
            }
        }

        if (isDifference) {
            for (int j = index; j < max; j++) {
                count++;
            }
        } else count = max - min;

        System.out.println(count);

        if (count <= k) {
            answear += "Yes";
        } else answear += "No";

        return answear;
    }

//    private static String compareString(String s, String t, int k) {
//        int count = 0, min = -1, max = 0, index = 0;
//        boolean isDifference = false;
//
//        if (s.length() == t.length() && k < s.length()) return "No";
//
//        if (s.length() > t.length()) {
//            min = t.length();
//            max = s.length();
//        } else {
//            min = s.length();
//            max = t.length();
//        }
//
//        for (int i = 0; i < min; i++) {
//            // isDifference = false;
//            if (s.charAt(i) != t.charAt(i)) {
//                isDifference = true;
//                index = i;
//                break;
//            }
//        }
//
//        if (isDifference) {
//            index = min - 1;
//        } else {
//            for (int j = index; j < max; j++) {
//                count++;
//            }
//        }
//
//        count = max - min;
//        System.out.println(count);
//
//        if (count <= k) {
//            return "Yes";
//        } else return "No";
//    }

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int cmp = s.compareTo(t);
        return cmp <= k ? "Yes" : "No";
    }
}
