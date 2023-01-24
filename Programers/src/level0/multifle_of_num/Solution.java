package level0.multifle_of_num;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int[] numlist) {

        ArrayList<Integer> numList = new ArrayList<>();

        for (int num : numlist)
            if (num % n == 0)
                numList.add(num);

        return numList.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(new Solution().solution(5, new int[] {1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(new Solution().solution(12, new int[] {2, 100, 120, 600, 12, 12})));

    }
}