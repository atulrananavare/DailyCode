package com.daily.leetcodes.May;

public class ElementSumAndDigitSum {
    public static void main(String[] args) {

    }

    public static int differenceOfSum(int[] nums) {
        int length = nums.length;
        int sumOfElement = 0;
        int sumOfDigit = 0;
        for (int i = 0; i < length; i++) {
            sumOfElement += nums[i];
        }

        for (int i = 0; i < length; i++) {
            sumOfDigit += addDigit(nums[i]);
        }

        return Math.abs(sumOfDigit - sumOfElement);

    }

    private static int addDigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit += num % 10;
            num /= 10;
        }
        return digit;
    }
}
