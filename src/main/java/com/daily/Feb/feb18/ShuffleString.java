package com.daily.Feb.feb18;

public class ShuffleString {
    public static void main(String[] args) {
        String str="codeleet";
        int[] arr={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(str,arr));

    }
//    You are given a string s and an integer array indices of the same length.
//    The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
//    Input: s = "abc", indices = [0,1,2]
//    Output: "abc"
//    Explanation: After shuffling, each character remains in its position.
    public static String restoreString(String s, int[] indices) {
        char[] arr=new char[indices.length];

        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=s.charAt(i);
        }
        return String.valueOf(arr);
    }
}
