package level0_1.add_polynomial;

import java.util.StringTokenizer;

public class Solution {

    public String solution(String polynomial) {
        StringTokenizer stk = new StringTokenizer(polynomial, " +");

        int[] polynomialIntArr = {0, 0};

        while(stk.hasMoreTokens()) {
            String target = stk.nextToken();
            if (target.charAt(target.length()-1) == 'x') {
                String add = target.substring(0, target.length() - 1).toString();
                polynomialIntArr[0] += add.length() == 0 ? 1 : Integer.parseInt(add);
            }
            else
                polynomialIntArr[1] += Integer.parseInt(target.toString());
        }

        StringBuilder result = new StringBuilder();
        if (polynomialIntArr[0] > 0)
            result.append(polynomialIntArr[0] == 1 ? "x" : polynomialIntArr[0] + "x");
        if (polynomialIntArr[1] > 0)
            result.append((polynomialIntArr[0] != 0 ? " + " : "") + polynomialIntArr[1]);
        else if (polynomialIntArr[0] == 0 && polynomialIntArr[1] == 0)
            result.append(0);

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("3x + 7 + x"));
        System.out.println(new Solution().solution("x + x + x"));
        System.out.println(new Solution().solution("1x + 0"));
        System.out.println(new Solution().solution("0"));
        System.out.println(new Solution().solution("0x + 0"));
    }
}
