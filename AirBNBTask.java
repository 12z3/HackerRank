package DailyInterView;
import java.util.ArrayList;
import java.util.List;

public class AirBNBTask {
    /**
     * @problem: This problem was recently asked by AirBNB:
     * Given a list of words, group the words that are anagrams of each other.
     * (An anagram are words made up of the same letters).

     * Example:
     * Input: ['abc', 'bcd', 'cba', 'cbd', 'efg']
     * Output: [['abc', 'cba'], ['bcd', 'cbd'], ['efg']]
     */

    /**
     * list<String> input = new ArrayList<>();
     * StringBuilder stb = new StringBuilder("word");
     * input.add(stb); stb e указателя на new StringBuilder("word") в heap-a;
     * Промени ли се "word" указателя Ще "сочи" към друга стойност а от там и елемента в листа ще е различен.
     *
     */
    public static void main(String[] args) {
        List<String> input = new ArrayList<>(List.of("abc", "bcd", "cba", "cbd", "efg"));

//        StringBuilder word3 = new StringBuilder("abc");
//        StringBuilder word4 = new StringBuilder("cba");

        groupAnagramWords(input);
    }

    private static void groupAnagramWords(List<String> input) {

        StringBuilder word1 = new StringBuilder();
        StringBuilder word2 = new StringBuilder();
        StringBuilder result = new StringBuilder();
        StringBuilder negativeResult = new StringBuilder();

        for (int i = 0; i < input.size(); i++) {
            word1.delete(0, word1.length());
            word1.append(input.get(i));
            for (int j = i + 1; j < input.size(); j++) {
                word2.delete(0, word2.length());
                word2.append(input.get(j));
                if (wordComparator(word1, word2)) {
                    result.append(word1).append("-").append(word2).append(" ");
                } else {
                    negativeResult.append(word1).append("-").append(word2).append(" ");
                }
            }
        }
        System.out.printf("Result: %s %nNegative result: %s %n", result, negativeResult);
    }

    private static boolean wordComparator(StringBuilder stb1, StringBuilder stb2) {
        int countChars = 0;
        if (stb1.length() != stb2.length()) return false;
        for (int i = 0; i < stb1.length(); i++) {
            char a = stb1.charAt(i);
            for (int j = 0; j < stb2.length(); j++) {
                char b = stb2.charAt(j);
                if (a == b) countChars++;
            }
            if (countChars >= 3) return true;
        }
        return false;
    }
}
