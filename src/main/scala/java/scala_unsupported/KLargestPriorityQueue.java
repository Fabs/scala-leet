package leet.java.scala_unsupported;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestPriorityQueue {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxK = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i < nums.length; i++) {
            maxK.add(nums[i]);
        }

        for(int i = 0; i < k - 1; i++) {
            maxK.poll();
        }

        return maxK.peek();
    }
}
