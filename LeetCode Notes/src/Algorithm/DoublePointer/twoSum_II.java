package Algorithm.DoublePointer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/*
#167 两数之和II--输入有序数组
给定一个已按照升序排列的有序数组，找到两个数使得它们相加之和等于目标数。
函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
说明:
返回的下标值（index1 和 index2）不是从零开始的。
你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
示例:
输入: numbers = [2, 7, 11, 15], target = 9
输出: [1,2]
解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
* */
/*
* 解题思路：
* 使用双指针，一个指针指向较小的元素，一个指针指向较大的元素。
* 指向较小元素的指针从头到尾遍历，指向较大元素的指针从尾到头遍历。
* 如果两个指针指向的元素的和 == target，返回所指的index
* 解题心得：
* 1.数组输出的三种方法：
*     a.for循环索引输出
*     b.for(int a:array) sout(a);
*     c.sout(Arrays.toString(array))
* 2.充分利用数组的有序的特性，通过首尾相结合和的方式进行遍历 大大提高效率
* */
public class twoSum_II {
    public static void main(String[] args) {
        //测试数据
        int[] numbers = new int[] {0,1,2,3,4,5};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.twoSum(numbers,6)));

    }

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            //判断是否为空
            if (numbers == null || numbers.length < 2) return null;
            //定义双指针
            int i = 0, j = numbers.length - 1;
            //双向遍历数组
            while (i < j) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[]{i + 1, j + 1};
                } else if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
            //找不到结果返回null;
            return null;
        }
    }
}