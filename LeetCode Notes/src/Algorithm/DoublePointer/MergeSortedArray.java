package Algorithm.DoublePointer;

/*
#88合并两个有序数组*****Easy
* Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:
*
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
*
Output: [1,2,2,3,5,6]

* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> nums1 = new ArrayList<>();
//        ArrayList<Integer> nums2 = new ArrayList<>();
//        int m = sc.nextInt();
//        int n = sc.nextInt();
        int[] nums1 = new int[]{1,3,5,7,9,0,0,0,0,0};
        int[] nums2 = new int[]{2,4,6,8,10};
        merge(nums1,5,nums2,5);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;//4
        int index2 = n - 1;//4
        int indexMerge = m + n -1;//9
        while(index1 >= 0 || index2 >= 0){//T
            if(index1 < 0){//F
                nums1[indexMerge--] = nums2[index2--];
            }else if(index2 < 0){//F
                nums1[indexMerge--] = nums1[index1--];
            }else if(nums1[index1] > nums2[index2]){//F
                nums1[indexMerge--] = nums1[index1--];
            }else{
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }
}
/*
* 从数组尾部开始遍历
* */

/*
* java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
  at line 14, Solution.merge
  at line 54, __DriverSolution__.__helper__
  at line 93, __Driver__.main
* */