package level0.seven_num;

public class Solution {
    public int solution(int[] array) {

        int answer = 0;

        StringBuilder numberString = new StringBuilder();

        for (int num : array)
            numberString.append(Integer.toString(num));

        for (int i = 0; i < numberString.length(); i++)
            if (numberString.charAt(i) == '7')
                answer += 1;

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[] {7, 77, 17}));
        System.out.println(new Solution().solution(new int[] {10, 9}));
    }
}
