package level0.length_overlapping_line;

import java.util.Arrays;

public class Solution {

    public int solution(int[][] lines) {

        int left = lines[0][0];
        int right = lines[0][1];
        for (int i = 1; i < lines.length; i++) {
            left = Math.min(left, lines[i][0]);
            right = Math.max(right, lines[i][1]);
        }

        int[] lineMap = new int[right - left + 1];

        for (int[] line : lines)
            for (int i = line[0]; i < line[1]; i++)
                lineMap[i - left]++;

        return (int) Arrays.stream(lineMap).filter(i -> i >= 2).count();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][] {{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(new Solution().solution(new int[][] {{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(new Solution().solution(new int[][] {{0, 5}, {3, 9}, {1, 10}}));
    }
}
