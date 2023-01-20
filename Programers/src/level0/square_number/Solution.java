package level0.square_number;

public class Solution {

    public int solution(int n) {
        return n % Math.sqrt(n) == 0 ?  1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(144));
        System.out.println(new Solution().solution(976));
    }
}

