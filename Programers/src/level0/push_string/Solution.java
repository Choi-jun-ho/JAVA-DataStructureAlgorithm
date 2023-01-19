package level0.push_string;

class Solution {
    public int solution(String A, String B) {
        StringBuilder sbA = new StringBuilder(A);

        for (int index = 0; index < A.length()-1; index++) {
            if (B.equals(sbA.toString()))
                return index;
            char save = sbA.charAt(sbA.length()-1);
            sbA.deleteCharAt(sbA.length()-1);
            sbA.insert(0, save);
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello", "ohell"));
        System.out.println(new Solution().solution("apple", "elppa"));
        System.out.println(new Solution().solution("atat", "tata"));
        System.out.println(new Solution().solution("abc", "abc"));


    }
}