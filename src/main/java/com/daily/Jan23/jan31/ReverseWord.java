package com.daily.Jan23.jan31;

public class ReverseWord {
    public static void main(String[] args) {
        String str="i.like.this.program.very.much";
        System.out.println(reverseWords(str));
    }

    //Function to reverse words in a given string.
    public static String reverseWords(String S)
    {
        String[] arr = S.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
