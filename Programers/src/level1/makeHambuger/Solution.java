package level1.makeHambuger;

import java.util.Arrays;

public class Solution {

    public boolean isHamburger(int[] stack, int i) {
        return stack[i - 1] == 1 && stack[i - 2] == 3 && stack[i - 3] == 2 && stack[i - 4] == 1;
    }

    public int solution(int[] ingredient) {

        int[] stack = new int[ingredient.length];

        int count = 0;
        int sp = 0;

        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && isHamburger(stack, sp)) {
                sp -= 4;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("2, 1, 1, 2, 3, 1, 2, 3, 1");
        System.out.println(new Solution().solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println("1, 3, 2, 1, 2, 1, 3, 1, 2");
        System.out.println(new Solution().solution(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2}));
        System.out.println("1, 2, 3, 1, 1, 2, 3, 1, 1, 2");
        System.out.println(new Solution().solution(new int[] {1, 2, 3, 1, 1, 2, 3, 1, 1, 2}));
    }
}
