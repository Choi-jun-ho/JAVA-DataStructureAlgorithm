package level0_1.determining_finite_decimal;

public class Solution {

    public int greatestCommonDivisor(int num1, int num2) {
        for (int num = Math.min(num1, num2); num >= 2; num--)
            if (num1 % num == 0 &&  num2 % num == 0)
                return num;
        return -1;
    }

    public int[] irreducible_fraction (int numer, int denom) {
        int division = greatestCommonDivisor(numer, denom);
        return (division != -1) ? new int[] {numer/division, denom/division} : new int[] {numer, denom};
    }

    public boolean isfIniteDecimal(int denom) {
        while (denom % 2 == 0)
            denom /= 2;
        while (denom % 5 == 0)
            denom /= 5;
        return denom == 1;
    }

    public int solution(int a, int b) {
        return isfIniteDecimal(irreducible_fraction(a, b)[1])? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(7, 20));
        System.out.println(new Solution().solution(11, 22));
        System.out.println(new Solution().solution(12, 21));
    }
}
