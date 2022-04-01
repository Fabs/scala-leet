package leet.java.scala_unsupported;

import java.util.*;

public class KLargestQuickSelect {
    public int findKthLargest(int[] nums, int k) {
        if(k < 0 || k > nums.length) {
            return - 1;
        }

        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    public void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public int partition(int[] nums, int start, int end) {
        int size = end - start + 1;
        int pivot_index = start + (new Random()).nextInt(size - 1);
        int pivot = nums[pivot_index];

        swap(nums, pivot_index, end);
        int j = start;

        for(int i = start; i < end; i++) {
            if(nums[i] < pivot){
                swap(nums, j, i);
                j++;
            }
        }

        swap(nums, j, end);
        return j;
    }

    public int quickSelect(int[] nums, int start, int end, int k) {
        if(start == end) {
            return nums[start];
        }

        int p = partition(nums, start, end);

        if(k < p) {
            return quickSelect(nums, start, p - 1, k);
        } else if (k > p) {
            return quickSelect(nums, p + 1, end, k);
        } else {
            return nums[p];
        }
    }
}
