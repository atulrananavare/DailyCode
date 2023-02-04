package com.daily.Feb.feb4;
//Palindrome string: A string which reads the same backwards.
public class LongestPalindrome {
    //Longest Palindrome in a String
//    Input:
//    S = "aaaabbaa"
//    Output: aabbaa
//    Explanation: The longest Palindromic
//    substring is "aabbaa".
    public static void main(String[] args) {
        longestPalin("aaaabbaa");
    }
    static String longestPalin(String S){
        int len=S.length();
        char[] arr=new char[len];
        char[] temp=new char[len];
        for (int i=len-1;i>0;i--){
            arr[i]=S.charAt(i);
            for (int j=0;j>len-1;j++){
                temp[i]=S.charAt(i);
            }

        }

        return arr.toString();
    }
}
