package level0.ox_quiz;

import java.util.Arrays;

public class Solution {

    public boolean isMetodTrue(String metod) {
        String[] metodArr = metod.split(" ");
        int minusResult = Integer.parseInt(metodArr[0]) - Integer.parseInt(metodArr[2]);
        int flusResult = Integer.parseInt(metodArr[0])+ Integer.parseInt(metodArr[2]);
        return (metodArr[1].equals("-") ? minusResult : flusResult) == Integer.parseInt(metodArr[4]);
    }

    public String[] solution(String[] quiz) {

        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++)
            answer[i] = isMetodTrue(quiz[i]) ? "O" : "X";

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(new Solution().solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }
}
