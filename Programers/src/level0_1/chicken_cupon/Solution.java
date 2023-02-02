package level0_1.chicken_cupon;

public class Solution {

    public int solution(int chicken) {
        if (chicken < 10)
            return 0;

        return chicken/10 + solution(chicken/10 + chicken%10);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(100));
        System.out.println("---------------------");
        System.out.println(new Solution().solution(1081));
        System.out.println("---------------------");
        System.out.println(new Solution().solution(1999));
    }
}
