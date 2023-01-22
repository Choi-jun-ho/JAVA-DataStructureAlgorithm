package level0.string_in_string;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Map<Character, Integer> createSkipTable (String keyword) {
        Map<Character, Integer> skipTable = new HashMap<>();

        int count = keyword.length() - 1;
        for (char ch : keyword.toCharArray())
            skipTable.put(ch, count--);

        return skipTable;
    }

    public int solution(String str1, String str2) {

        Map<Character, Integer> skipTable = createSkipTable(str2);

        int str1Index = str2.length() - 1;

        while (str1Index < str1.length()) {
            int str2Index = str2.length() - 1;
            System.out.print("index: " + str1.charAt(str1Index) + ", " + str1Index);
            while (str1.charAt(str1Index) == str2.charAt(str2Index)) {
                if (str2Index == 0) return 1;
                str1Index--; str2Index--;
                System.out.print("-");
            }
            System.out.println("/ str2 Index: "  + str2Index );
            int str1Distance = skipTable.get(str1.charAt(str1Index)) == null? str2.length() : skipTable.get(str1.charAt(str1Index));
            int str2SearchDistance = str2.length() - str2Index;
            System.out.print("index: " + str1.charAt(str1Index) + ", [" + str1Index + "], str1Distance: [" + str1Distance +"]/ str2Distance: [" + str2SearchDistance + "] -> + ");
            Math.max(str1Distance, str2SearchDistance);
            str1Index += str1Distance;
            System.out.println(Math.max(str1Distance, str2SearchDistance) + " = " + str1Index);

        }

        return 2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(new Solution().solution("ppprrrogrammers", "pppp"));
        System.out.println(new Solution().solution("AbcAbcA", "AAA"));
        System.out.println(new Solution().solution("ABCXDEZCABACABAC", "ABAC"));
        System.out.println("---------------");
        System.out.println(new Solution().solution("ABEFCDEF", "DEF"));
        System.out.println("---------------");
        System.out.println(new Solution().solution("ddddFF한FFFasDFFF", "FF한"));
    }
}
