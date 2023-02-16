package level2.english_word_chain_game;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public int[] solution(int n, String[] words) {
        HashSet<String> chainWords = new HashSet<>();
        char endWord = words[0].charAt(0);
        int[] answer = {1, 0};
        boolean isPass = true;

        for (int i = 0; i < words.length; i++) {
            answer[0] = (i) % n + 1;
            if (answer[0] == 1) answer[1]++;
            if (endWord != words[i].charAt(0) || chainWords.contains(words[i])) {
                isPass = false;
                break;
            }
            chainWords.add(words[i]);
            endWord = words[i].charAt(words[i].length()-1);
        }

        return isPass ? new int [] {0, 0} : answer;
    }

    public static void main(String[] args) {
        System.out.println("---------------------");
        int[] answer1 = new Solution().solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        System.out.println(Arrays.toString(answer1));
        System.out.println(Arrays.equals(answer1, new int[] {3, 3}));
        System.out.println("---------------------");
        int[] answer2 = new Solution().solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        System.out.println(Arrays.toString(answer2));
        System.out.println(Arrays.equals(answer2, new int[] {0, 0}));
        System.out.println("---------------------");
        int[] answer3 = new Solution().solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        System.out.println(Arrays.toString(answer3));
        System.out.println(Arrays.equals(answer3, new int[] {1, 3}));
        System.out.println("---------------------");
        int[] answer4 = new Solution().solution(4, new String[]{"aa", "aba"});
        System.out.println(Arrays.toString(answer4));
        System.out.println(Arrays.equals(answer4, new int[] {0, 0}));
    }
}
