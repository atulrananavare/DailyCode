package com.daily.leetcodes.march24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresofaSortedArray_977 {

    public static void main(String[] args) {

        int[] arr = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(arr);
        for (int x : result)
            System.out.print(x + " ");

        System.out.println("");
        System.out.println("=========Way2=============");
        int[] result2 =sortedSquaresWay2(arr);
        for (int y: result2) {
            System.out.print(y + " ");
        }
    }

    /**
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     *
     * @param nums
     * @return
     */
    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] output = new int[len];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= len - 1; i++) {
            list.add(nums[i] * nums[i]);
        }
        int[] sortedIntArray = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < sortedIntArray.length; i++)
            output[i] = list.get(i);
        Arrays.sort(output);
        return output;
    }

    public static int[] sortedSquaresWay2(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }
}
