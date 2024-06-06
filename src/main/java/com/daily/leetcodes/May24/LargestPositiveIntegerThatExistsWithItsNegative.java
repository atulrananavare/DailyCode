package com.daily.leetcodes.May24;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {

    public static void main(String[] args) {
        int[] arr = {-1,2,-3,3};
        System.out.println(findMaxK(arr));
    }

    //    Input: nums = [-1,2,-3,3]
//    Output: 3
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = n - 1;
        if (nums[left] >= 0 || nums[right] <= 0) {
            return -1;
        }
        while (left < right) {
            if (Math.abs(nums[left]) == nums[right]) {
                return nums[right];
            } else if (Math.abs(nums[left]) < nums[right]) {
                right--;
            } else {
                left++;
            }
        }
        return -1;
    }
}
