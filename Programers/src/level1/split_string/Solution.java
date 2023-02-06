package level1.split_string;

public class Solution {

    public int solution(String s) {
        int answer = 0, start = 0, sadi = 0;

        for (int i = 0; i < s.length(); i++) {
            if (sadi == 0) {
                answer++;
                start = i + 1;
                if (i + 1 == s.length())
                    break;
            }
            sadi += (s.charAt(start) == s.charAt(i)) ? 1 : -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("banana"));
        System.out.println(new Solution().solution("abracadabra"));
        System.out.println(new Solution().solution("aaabbaccccabba"));
    }
}
