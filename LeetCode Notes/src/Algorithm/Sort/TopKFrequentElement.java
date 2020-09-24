package Algorithm.Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}

class Solution{
    public List<Integer> topKFrequent(int[] nums, int k){
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for(int num : nums){
            //getOrDefault,Map中存在key则使用key的值，否则使用defaultValue
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);
            List<Integer>[] buckets = new ArrayList[nums.length + 1];
            for(int key : frequencyForNum.keySet()){
                int frequency = frequencyForNum.get(key);

            }
        }
    }
}