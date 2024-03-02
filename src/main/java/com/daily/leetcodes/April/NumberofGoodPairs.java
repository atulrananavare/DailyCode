package com.daily.leetcodes.April;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberofGoodPairs {

    public static void main(String[] args) {
        int[] arr= {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count = map.getOrDefault(nums[i],0);
            ans+=count;
            map.put(nums[i],count+1);
        }
        return ans;
    }
}
