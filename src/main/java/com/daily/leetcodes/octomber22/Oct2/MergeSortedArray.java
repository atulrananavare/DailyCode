package com.daily.leetcodes.octomber22.Oct2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int len=nums1.length;
        List<Integer> list=new ArrayList<>();
        System.out.println(len);
        for (int i=0;i<len;i++){
            if(nums1[i]!=0 &&nums2[i]!=0){
                list.add(nums1[i]);
                list.add(nums2[i]);
            }
        }
        System.out.println(list);
        List<Integer> tempList = list.stream().sorted().collect(Collectors.toList());

        Object[] temp = tempList.toArray();
        for (int i=0;i<temp.length;i++){
           // System.out.print(temp[i]+",");
        }

       merge(nums1,3,nums2,3);
        for (int i=0;i<temp.length;i++){
         System.out.print(nums1[i]+",");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, x = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) nums1[x--] = nums1[i--];
            else nums1[x--] = nums2[j--];
        }

        while(i >= 0) {
            nums1[x--] = nums1[i--];
        }
        while(j >= 0) {
            nums1[x--] = nums2[j--];
        }
    }

}
