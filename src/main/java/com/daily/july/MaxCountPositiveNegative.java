package com.daily.july;

public class MaxCountPositiveNegative {

    public static void main(String[] args) {
        int[] arr={5,20,66,1314};
        System.out.println(maximumCount(arr));
    }

    //-2,-1,-1,1,2,3 ->3
    public static int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg++;
            } else if (nums[i] > 0) {
                pos++;
            }
        }

        return Math.max(pos, neg);
    }
}
