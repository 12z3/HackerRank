package task.hackerRank;

public class HRAppendAndDelete {

    /**
     * ... convert s to t.
     * -> 3/14 test cases failed :(
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

//        String s = "hackerhappy"; //  hackerhappy
//        String t = "hackerhappy";
//        int k = 9;

//        String s = "uoiauwrebgiwrhgiuawheirhwebvjforidkslweufgrhvjqasw"; //  Yes
//        String t = "vgftrheydkoslwezxcvdsqjkfhrydjwvogfheksockelsnbkeq";
//        int k = 100;

//        String s = "qwerasdf"; //  No
//        String t = "qwerbsdf";
//        int k = 6;

//        String s = "hackerhappy"; // hackerrank
//        String t = "hackerrank";
//        int k = 9;

//        String s = "aba"; // hackerhappy
//        String t = "abaaba";
//        int k = 3;

        String s = "ashley"; //
        String t = "ashp";
        int k = 3;


        System.out.println(compareString(s, t, k));
    }

    private static String compareString(String s, String t, int k) {
        int countS = 0, countT = 0, min = -1, max = 0, index = 0;
        boolean isDifference = false;
        StringBuilder stabS = new StringBuilder();
        StringBuilder stabT = new StringBuilder();
        String answear = "";

        if (s.length() > t.length()) {
            min = t.length();
            max = s.length();
        } else {
            min = s.length();
            max = t.length();
        }

        for (int i = 0; i < min; i++) {
            // isDifference = false;                               //... там му е мястото, но в случая е ненужно.
            if (s.charAt(i) != t.charAt(i)) {
                isDifference = true;
                index = i;
                break;
            }
        }

        if (isDifference) {
            for (int j = index; j < max; j++) {                     // countS = броя на различните символа в s
                countS++;
                stabS.append(s.charAt(j));
            }
            for (int j = index; j < min; j++) {
                countT++;                                           // countT = броя на различните символа в t
                stabT.append(t.charAt(j));
            }
        } else countS = (max / 2);                                  // ... не ми харесва това....

        if (k >= (max - min) && (countT + countS) <= k){
            answear += "Yes";
        } else answear += "No";

        System.out.println(stabS);
        System.out.println(stabT);
        System.out.println(countS + countT);

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

}
