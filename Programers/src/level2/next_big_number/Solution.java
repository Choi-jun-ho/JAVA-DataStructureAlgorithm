package level2.next_big_number;

public class Solution {

    public int solution(int n) {
        int bitCount = Integer.bitCount(n);
        n = n + (n & -n); // 자르기
        int bitCount2 = Integer.bitCount(n); 
        n += Math.pow(2, bitCount - bitCount2) - 1; // 더하기
        return n;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(78));
        System.out.println(new Solution().solution(15));
    }

}
