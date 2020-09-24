package Algorithm.DoublePointer;


/*
#345 反转字符串中的元音字母******Easy
编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
示例 1:
输入: "hello"
输出: "holle"

示例 2:
输入: "leetcode"
输出: "leotcede"

*/

import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        Solution sol  = new Solution();
        System.out.println(sol.reverseVowels("LeetCode"));
    }


    static class Solution {
        //将元音字母加入hashset中，注意hashset的定义方式和初始化方法
        private final static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        public String reverseVowels(String s){
            if(s == null) return null;
            int i = 0, j= s.length() - 1;
            //字符数组 存放结果集
            char[] result = new char[s.length()];
            while(i <= j){
                char ci = s.charAt(i);
                char cj = s.charAt(j);
                if(!vowels.contains(ci)){
                    result[i++] = ci;
                }else if(!vowels.contains(cj)){
                    result[j--] = cj;
                }else {
                    result[i++] = cj;
                    result[j--] = ci;
                }
            }
            return new String(result);
        }
    }
}
