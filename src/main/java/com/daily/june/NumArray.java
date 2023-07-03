package com.daily.june;

class NumArray {
    private int[] prefixSums;

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);

        System.out.println(obj.sumRange(0, 2));  // Output: 1
        System.out.println(obj.sumRange(2, 5));  // Output: -1
        System.out.println(obj.sumRange(0, 5));  // Output: -3
    }

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSums = new int[n + 1]; // Initialize prefix sums with an extra element

        // Calculate prefix sums
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSums[right + 1] - prefixSums[left];
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
