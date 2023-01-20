package level0.saving_array_by_cutting;

import java.util.Arrays;

public class Solution {

    public String[] solution(String my_str, int n) {
        int answer_max = (int) Math.ceil((double) my_str.length()/n);
        String[] answer = new String[answer_max];

        for (int i = 0; i < answer_max ; i++)
            answer[i] = my_str.substring(i*n, (i == answer_max - 1) ? my_str.length() : i*n+n);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(new Solution().solution("abcdef123", 3)));
    }
}
