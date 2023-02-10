package com.daily.Feb.feb10;

public class ShuffleString {

    public static void main(String[] args) {
//        Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//        Output: "leetcode"
//        Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
        int[] arr={4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",arr));

    }

    public static String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] ans = new char[n];
        for (int i = 0; i < n; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }

}
