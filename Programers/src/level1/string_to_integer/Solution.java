package level1.string_to_integer;

public class Solution {

    public int solution(String s) {

        boolean isAsign = s.charAt(0) == '-' || s.charAt(0) == '+';
        int asign = s.charAt(0) == '-' ? -1 : 1;

        if (isAsign)
            s = s.substring(1);

        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();

        int carry = 1;
        int answer = 0;
        for (char c : s.toCharArray()) {
            if (c != '0')
                answer += carry * (c - '0');
            carry *= 10;
        }
        return asign * answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("1234"));
        String s = "-12345";
        int asgin = -1;
        for (int i = s.length()-1; i >= (asgin < 0? 1 : 0 ); i--) {
            System.out.print(s.charAt(i));
        }
    }
}
