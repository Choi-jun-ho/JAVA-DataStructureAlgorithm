package level0.bacterial_growth;

public class Solution {

    public int solution(int n, int t) {
        return (int) (n * Math.pow(2, t));
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 10));
        System.out.println(new Solution().solution(7, 15));
    }
}
