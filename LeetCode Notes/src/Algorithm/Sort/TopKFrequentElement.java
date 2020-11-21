package Algorithm.Sort;

import java.util.*;

//Given a non-empty array of integers, return the k most frequent elements.
//
//Example 1:
//
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
//Example 2:
//
//Input: nums = [1], k = 1
//Output: [1]
//Note:
//
//You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
//Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
//It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
//You can return the answer in any order.

public class TopKFrequentElement {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[]{2,2,2,2,3,3,4,4,4};
        System.out.println(sol.topKFrequent(nums,2));
    }
}

class Solution{
    public List<Integer> topKFrequent(int[] nums, int k){
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for(int num : nums){
            //getOrDefault,Map中存在key则使用key的值，否则使用defaultValue
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int key : frequencyForNum.keySet()){
            int frequency = frequencyForNum.get(key);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        List<Integer> topK = new ArrayList<>();
        for(int i = buckets.length - 1; i >= 0 && topK.size() < k; i--){
            if(buckets[i] == null){
                continue;
            }
            if(buckets[i].size() <= (k - topK.size())){
                topK.addAll(buckets[i]);
            }else {
                topK.addAll(buckets[i].subList(0, k - topK.size()));
            }
        }
        return topK;
    }
}