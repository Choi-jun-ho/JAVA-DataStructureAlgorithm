package level0_1.curse_number_three;

public class Solution {

    public int nextNotCurseNum(int num) {

        while (num % 3 == 0 || String.valueOf(num).contains("3"))
            num++;

        return num;
    }

    public int solution(int n) {

        int notCurseNum = 0;
        for (int i = 1; i <= n; i++)
            notCurseNum = nextNotCurseNum(notCurseNum + 1);

        return notCurseNum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(15));
        System.out.println(new Solution().solution(40));
    }
}
