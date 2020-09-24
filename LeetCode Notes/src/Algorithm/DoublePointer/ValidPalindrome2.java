package Algorithm.DoublePointer;

/*
#680验证回文字符串*****Easy
* 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。

示例 1:
输入: "aba"
输出: True
*
示例 2:
输入: "abca"
输出: True
解释: 你可以删除c字符。
注意:

字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。

*
* */

public class ValidPalindrome2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String word = "abcdecba";
        System.out.println(s.validPalindrome(word));
    }

    static class Solution {
        //判断是否是回文字符
        public boolean validPalindrome(String s) {
            for (int i = 0, j = s.length() - 1;i < j; i++,j--) {
                if(s.charAt(i) != s.charAt(j)){
                    return isValidPalindrome(s, i + 1,j) || isValidPalindrome(s,i,j-1);
                }
            }
            return true;
        }

        //判断删除左边/右边字母后是否是回文字符
        private boolean isValidPalindrome(String s,int i,int j){
            while (i < j){
                if(s.charAt(i++) != s.charAt(j--)){
                    return false;
                }
            }
            return true;
        }
    }
}
