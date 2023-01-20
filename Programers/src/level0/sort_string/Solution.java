package level0.sort_string;

import java.util.Arrays;

public class Solution {

    public String solution(String my_string) {
        char[] sorting_str = my_string.toLowerCase().toCharArray();
        Arrays.sort(sorting_str);

        StringBuilder answer = new StringBuilder();

        for (char c : sorting_str)
            answer.append(c);

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("Bcad"));
        System.out.println(new Solution().solution("heLLo"));
        System.out.println(new Solution().solution("Python"));
    }
}
