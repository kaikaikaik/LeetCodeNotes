package Algorithm.Offer;

import java.util.HashSet;

public class three {
    public int findRepeatNumber(int[] nums){
        //Method one:
        HashSet<Integer> num = new HashSet<>();
        for(int count = 0; count < nums.length; count++){
            if(!num.add(nums[count])){
                return nums[count];
            }
        }
        return 0;
    }
}

//Method two: