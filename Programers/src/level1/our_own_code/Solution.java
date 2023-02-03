package level1.our_own_code;

public class Solution {

    public char addChar(char c) {
        return (++c > 'z') ? 'a' : c;
    }

    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            for (int i = 0; i < index; i++) {
                c = addChar(c);
                while (skip.contains(String.valueOf(c)))
                    c = addChar(c);
            }
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("aukks",	"wbqd", 5));
    }
}
