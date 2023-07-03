package com.daily.Feb.feb4;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    static int isPalindrome(String S) {
        int len=S.length();
        StringBuilder sb=new StringBuilder();

        if(len==0)
            return 0;

        for(int i=len-1;i>=0;i--){
            sb.append(S.charAt(i));
        }

        if(sb.toString().equals(S)){
            return 1;
        }

        return 0;
    }
}
