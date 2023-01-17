// https://school.programmers.co.kr/learn/courses/30/lessons/120956
// ¿Ë¾ËÀÌ(1)

package level0.babbling_1;

public class Solution {
	
	public String getBabyCanWord(String str) {
		for (String babyCanWord : new String[] {"aya", "ye", "woo", "ma"})
			if (str.startsWith(babyCanWord))
				return babyCanWord;
		
		return "";
	}
	
	public int getSayCount(String str) {
		StringBuilder babySay = new StringBuilder(str);
			
		String saveBabyWord = "";
		
		while (babySay.length() > 0) {
			
			String babyWord = getBabyCanWord(babySay.toString());
			
			if (saveBabyWord.equals(babyWord)) return 0;
			if (babyWord.length() == 0) return 0;
			
			babySay.delete(0, babyWord.length());
			saveBabyWord = babyWord;
		}
		
		return 1;
	}
	
	public int solution(String[] babbling) {
		int answer = 0;
		
		for (String b : babbling) 
			answer += getSayCount(b);
		
        return answer;
    }
	

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		
		System.out.println(solution.solution(babbling));
	}

}