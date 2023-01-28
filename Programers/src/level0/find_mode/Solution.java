package level0.find_mode;

import java.util.Arrays;

public class Solution {

    public int solution(int[] array) {

        int[] countArray = new int[Arrays.stream(array).max().orElseThrow() + 1];

        for (int i : array)
            countArray[i]++;

        int max = Arrays.stream(countArray).max().orElseThrow();
        int result = 0;

        int count = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] == max) {
                count++;
                result = i;
            }
        }

        return count > 1 ? -1 : result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[] {1, 2, 3, 3, 3, 4}));
        System.out.println(new Solution().solution(new int[] {1, 1, 2, 2}));
        System.out.println(new Solution().solution(new int[] {1}));
    }
}

