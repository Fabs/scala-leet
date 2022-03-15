package leet.java.conversions;

public class TwoSumNaive {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i ++) {
            for(int j = 0; j < nums.length; j ++) {
                if(i != j) {
                    if(nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        return null;
    }
}