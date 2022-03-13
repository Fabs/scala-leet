package leet.java.conversions;

import java.util.HashMap;

public class TwoSumCached {
    private HashMap<Integer,Integer> cache = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i ++) {
            cache.put(target - nums[i], i);
        }

        for(int i = 0; i < nums.length; i ++) {
            if(cache.containsKey(nums[i]) && i != cache.get(nums[i])) {
                return new int[]{i, cache.get(nums[i])};
            }
        }

        return null;
    }
}
