package level0_1.chicken_cupon;

public class Solution {

    public int chicken_cupon(int cupon, int chicken) {
        if (cupon < 10)
            return 0;
        cupon = cupon/10 + cupon%10;
        return chicken + chicken_cupon(cupon, cupon/10);
    }

    public int solution(int chicken) {
        return chicken_cupon(chicken, chicken/10);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(100));
        System.out.println("---------------------");
        System.out.println(new Solution().solution(1081));
        System.out.println("---------------------");
        System.out.println(new Solution().solution(1999));
    }
}
