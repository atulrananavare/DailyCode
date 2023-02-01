package com.daily.Feb.feb1;

public class LongestCommonPrefixArray {

    public static void main(String[] args) {
        //Given a array of N strings, find the longest common prefix among all strings present in the array.
        String[] arr={"hello", "world"};
        System.out.println(longestCommonPrefix(arr,2));

    }

    static String  longestCommonPrefix(String arr[], int n){
        if (arr.length == 0) return "-1";
        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "-1";
            }
        }
        return prefix;
    }
}
