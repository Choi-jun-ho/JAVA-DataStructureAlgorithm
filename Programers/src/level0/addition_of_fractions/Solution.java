package level0.addition_of_fractions;

import java.util.Arrays;

public class Solution {

    public int greatestCommonDivisor(int num1, int num2) {
        for (int num = Math.min(num1, num2); num >= 2; num--)
            if (num1 % num == 0 &&  num2 % num == 0) {
                return num;
            }
        return -1;
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int resultNumer = numer1*denom2 + numer2*denom1;
        int resultDenom = denom1 * denom2;
        int division = greatestCommonDivisor(resultDenom, resultNumer);
        if (division != -1)
            return new int[] {resultNumer/division, resultDenom/division};
        return new int[] {resultNumer, resultDenom};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(new Solution().solution(9, 2, 1, 3)));
        System.out.println("--------");
        System.out.println(Arrays.toString(new Solution().solution(2, 8, 2, 8)));
    }
}
