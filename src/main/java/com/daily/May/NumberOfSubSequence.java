package com.daily.May;

import java.util.Arrays;

public class NumberOfSubSequence {

    public static void main(String[] args) {
        int[] arr={3,3,6,8};
        System.out.println(numSubseq(arr,9));
    }
    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums); //sort the array
        int result = 0, length = nums.length, left = 0, right = length - 1, mod = (int)1e9 + 7; // two pointer approach and initialize variables
        int[] pows = new int[length];// make the power of int array e.g.[1,2,4,8]
        pows[0] = 1; //initialize first element as 1

        for (int i = 1; i < length; ++i)
            pows[i] = pows[i - 1] * 2 % mod;
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                result = (result + pows[right - left++]) % mod;
            }
        }
        return result;
    }
}
