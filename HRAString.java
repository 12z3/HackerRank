package hackerRank;

public class HRAString {
    public static void main(String[] args) {
        String input = "hhaacckkekraraannk";
        String input1 = "hhaacckkekrararannk";                           // Ако махнеш 2-то 'r' резултата трябва да е NO.
        String input2 = "hereiamstackerrank";
        String input3 = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"; //Индексите не са в правилната последователност.
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
        String word = "hackerrank";
        int[] indexes = new int[word.length()];
        char[] chars = new char[input.length()];
        char[] tmp = new char[indexes.length];

        StringBuilder stbA = new StringBuilder(word);
        StringBuilder stbB = new StringBuilder();
        boolean isMatch = false;


        for (int i = 0, p = - 1; i < word.length(); i++, p++) {
            for (int j = i, l = 0; j < input.length(); j++, l++) {
                if (word.charAt(i) == input.charAt(j)) {
                    indexes[i] = j;
                    chars[i] = input.charAt(j);
                    stbB.append(chars[i]);
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


//        tmp[i] = text.charAt(i);
//            if (i != 0) {
//                if (tmp[p] == tmp[i]) continue;
//            }
    }
}
