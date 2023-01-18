package level0.next_num;

public class Solution {

	public boolean isArithmeticSequence(int[] common) {		
		return common[1] - common[0] == common[2] - common[1];
	}
	
	public int solution(int[] common) {
		if (isArithmeticSequence(common)) 
			return common[common.length-1] + common[1] - common[0];
		else 
			return common[common.length-1] * (common[1]/common[0]);
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[] {1, 2, 3, 4}));
		System.out.println(new Solution().solution(new int[] {2, 4, 8}));
	}
}