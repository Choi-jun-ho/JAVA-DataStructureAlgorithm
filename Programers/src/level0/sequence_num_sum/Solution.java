package level0.sequence_num_sum;

import java.util.Arrays;

public class Solution {

	public int[] solution(int num, int total) {
		int n = total/num - (num - 1)/2;
		
        int[] answer = new int[num];
        
        for (int i = 0; i < num; i++)
        	answer[i] = n + i;
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(new Solution().solution(3, 12)));
		System.out.println(Arrays.toString(new Solution().solution(5, 15)));
		System.out.println(Arrays.toString(new Solution().solution(4, 14)));
		System.out.println(Arrays.toString(new Solution().solution(5, 5)));
	}
}