package level0_1.ranking;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int[] solution(int[][] score) {

        int[] answer = new int[score.length];

        ArrayList<int[]> scoreList = new ArrayList<>();

        for (int i = 0; i < score.length; i++)
            scoreList.add(new int[] {score[i][0] + score[i][1], i});

        scoreList.sort((o1, o2) -> o2[0] - o1[0]);

        int rank = 1;
        int rank_range = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            int[] s = scoreList.get(i);
            int[] nextS = i == scoreList.size()-1 ? new int[] {-999, -999}: scoreList.get(i+1);
            if (s[0] == nextS[0])
                rank_range++;
            else {
                for (int j = i - rank_range; j <= i; j++)
                    answer[scoreList.get(j)[1]] = rank;
                rank += 1 + rank_range;
                rank_range = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(
                new int[][] {{80, 70}, {90, 50}, {40, 70}, {50, 80}}
        )));
        System.out.println(Arrays.toString(new Solution().solution(
                new int[][] {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}
        )));
    }
}
