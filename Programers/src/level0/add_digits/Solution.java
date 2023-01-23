package level0.add_digits;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        String numbers = Integer.toString(n);

        for (char num : numbers.toCharArray())
            answer += Character.getNumericValue(num);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(1234));
        System.out.println(new Solution().solution(930211));
    }
}
