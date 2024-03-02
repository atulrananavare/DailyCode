package com.daily.leetcodes.Feb2024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    //    Input: nums = [2,2,1,1,1,2,2]
//    Output: 2
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val > nums.length / 2)
                return entry.getKey();
        }
        return -1;
    }


}
