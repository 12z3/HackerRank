package hackerRank;

public class HRAString {
    public static void main(String[] args) {
        String input = "hereiamstackerrank"; // индексите не са в правилната последователност.
        System.out.println(aString(input));

//        for (int el: indexes) {
//            if (el != 0) System.out.print(el + " ");
//        }
//        System.out.println();
//        for (char el: chars){
//            if (el != 0) System.out.print(el + " ");
//        }
//        System.out.println();
//        System.out.println(stbB);
    }

    private static String aString(String input) {
        String text = "hackerrank";
        int[] indexes = new int[text.length()];
        char[] chars = new char[input.length()];
        char[] tmp = new char[indexes.length];

        StringBuilder stbA = new StringBuilder(text);
        StringBuilder stbB = new StringBuilder();
        boolean isMatch = false;


        for (int i = 0, p = 0; i < text.length(); i++, p++) {
            for (int j = i, l = 0; j < input.length(); j++, l++) {

                    if (text.charAt(i) == input.charAt(j)) {
                        indexes[i] = j;                        // На коя позиция в "input" се намира всеки чар от "text"
                        chars[i] = input.charAt(j);
                        tmp[i] = text.charAt(i);
                        break;

                }
            }
        }

        for (int el : indexes) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (char el : chars) {
            if (el != 0) System.out.print(el + "");
        }
        System.out.println();
        System.out.println(stbB);

        if (stbA.toString().equals(stbB.toString())) {
            return "YES";
        } else return "NO";
    }
}
