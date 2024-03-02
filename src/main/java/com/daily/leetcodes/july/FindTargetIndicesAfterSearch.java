package com.daily.leetcodes.july;

import java.util.*;

public class FindTargetIndicesAfterSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 3};
        FindTargetIndicesAfterSearch findTargetIndicesAfterSearch = new FindTargetIndicesAfterSearch();
        System.out.println(findTargetIndicesAfterSearch.targetIndices(arr, 5));
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arrayList = new ArrayList<>();
        Arrays.sort(nums);
        int high = nums.length - 1;
        for (int low = 0; low <= high; low++) {
            if (nums[low] == target) {
                arrayList.add(low);
            }
        }
        return arrayList;
    }
}
