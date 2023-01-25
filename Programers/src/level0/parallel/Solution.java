package level0.parallel;

public class Solution {

    public double getGrade(int[] dot1, int[] dot2) {
        return (dot2[1] - dot1[1]) / ((double) dot2[0] - dot1[0]);
    }

    public int solution(int[][] dots) {
        double[] caseGrades = {getGrade(dots[0], dots[1]), getGrade(dots[0], dots[2]), getGrade(dots[0], dots[3]),
                                getGrade(dots[1], dots[2]), getGrade(dots[1], dots[3]), getGrade(dots[2], dots[3])};

        for (int i = 0; i < 6; i++)
            for (int j = i + 1; j < 6; j++)
                if (caseGrades[i] == caseGrades[j])
                    return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][] {{1,4}, {9,2}, {3,8}, {11, 6}}));
        System.out.println(new Solution().solution(new int[][] {{3,5}, {4,1}, {2,4}, {5, 10}}));
    }
}
