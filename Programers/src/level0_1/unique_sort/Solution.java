package level0_1.unique_sort;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] numlist, int n) {

        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (o1, o2) -> {
            int a = Math.abs(o1 - n);
            int b = Math.abs(o2 - n);
            if (a == b )
                if (o1 < o2)
                    return 1;
                else if (o1 > o2) {
                    return -1;
                }

            return a - b;
        });

        return Arrays.stream(arr).mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[] {1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(new Solution().solution(new int[] {10000,20,36,47,40,6,10,7000}, 30)));
    }
}