package level1.personality_test;

import java.util.LinkedHashMap;

public class Solution {

    public LinkedHashMap<String, int[]> kakaoPersonality = new LinkedHashMap<>();

    public String solution(String[] survey, int[] choices) {

        String[] personality = {"RT", "CF", "JM", "AN"};
        for (String key : personality)
            kakaoPersonality.put(key, new int[] {0, 0});

        for (int i = 0; i < survey.length; i++) {
            StringBuilder key = new StringBuilder(survey[i]);
            int personalIndex = choices[i] / 4;
            int personalValue = Math.abs(choices[i] - 4);
            if (key.charAt(0) > key.charAt(1)) {
                personalIndex = 1 - personalIndex;
                key.reverse();
            }
            kakaoPersonality.get(key.toString())[personalIndex] += personalValue;
        }

        StringBuilder answer = new StringBuilder() ;
        for (String key : kakaoPersonality.keySet()) {
            int[] values = kakaoPersonality.get(key);
            int index = 0;
            if (values[0] < values[1])
                index = 1;
            answer.append(key.charAt(index));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s1 = new Solution().solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5});
        String s2 = new Solution().solution(new String[] {"TR", "RT", "TR"}, new int[] {7, 1, 3});
        System.out.println(s1 + " : " + s1.equals("TCMA"));
        System.out.println(s2 + " : " + s2.equals("RCJA"));
    }
}
