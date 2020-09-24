package Algorithm.DoublePointer;
/*
*#633 平方数之和*****Easy
*给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
示例1:
输入: 5
输出: True
* 
解释: 1 * 1 + 2 * 2 = 5
示例2:
输入: 3
输出: False
*
* */
/*
* 解题思路：
* 与两数之和的解题思路一致，采用双向指针遍历
* 左指针起始值仍为0，右指针为sqrt(c)
*循环条件变为:i <= j;(两数可以相同)
* tips:
* leetcode无法导包，使用sqrt要写Math.sqrt()，强制转换为int
* */

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.judgeSquareSum(2));
    }

    static class Solution {
        public boolean judgeSquareSum(int c) {
            int i = 0, j = (int)Math.sqrt(c);

            //双向指针循环，两数可以相同 i<=j
            while (i<=j){
                int target = i*i + j*j;
                if(c == target){
                    return true;
                }
                else if(c > target) {
                    i++;
                }
                else{
                    j--;
                }
            }
            return false;
        }
    }
}

