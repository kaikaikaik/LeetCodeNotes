//package Algorithm.Sort;
//
//public class moreThanHalfPearl {
//
//}
//class Solution {
//    public:
//    int majorityElement(vector<int>& nums) {
//        int count = 1, cur = nums[0];
//        for(int i = 1; i < nums.size(); ++i) {
//            if(cur != nums[i]) {
//                --count;
//                if(count < 0) {
//                    cur = nums[i];
//                    count = 1;
//                }
//            }
//            else {
//                ++count;
//            }
//        }
//        if (count > 0) {
//            return exist;
//        }
//        else {
//            return unexist;
//        }
//    }
//    private:
//    bool exist = true;
//    bool unexist = false;
//};