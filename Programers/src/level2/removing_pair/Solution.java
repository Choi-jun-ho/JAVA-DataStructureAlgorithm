package level2.removing_pair;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public int solution(String s)
    {
        char[] stack = new char[s.length()];
        int sp = -1;

        for (int i = 0; i < s.length(); i++)
            if (sp == -1 || stack[sp] != s.charAt(i))
                stack[++sp] = s.charAt(i);
            else if (stack[sp] == s.charAt(i))
                stack[sp--] = '\0';

        return sp < 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println("--------");
        System.out.println("baabaa");
        System.out.println(new Solution().solution("baabaa"));
        System.out.println("--------");
        System.out.println("cdcd");
        System.out.println(new Solution().solution("cdcd"));
        System.out.println("--------");
        System.out.println("aaa");
        System.out.println(new Solution().solution("aaa"));
        System.out.println("--------");
        System.out.println("aaaa");
        System.out.println(new Solution().solution("aaaa"));
        System.out.println("--------");
        System.out.println("aaca");
        System.out.println(new Solution().solution("aaca"));
    }
}
