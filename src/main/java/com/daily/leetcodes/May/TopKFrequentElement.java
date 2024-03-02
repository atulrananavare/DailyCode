package com.daily.leetcodes.May;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElement {

    public static void main(String[] args) {

    }

    public static int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], count++);
            }

        }


        return null;
    }

}
