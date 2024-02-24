package com.daily.octomber23;

public class ReverseString2 {
    public static void main(String[] args) {
        String s = reverseStr("abcdefg", 2);
        System.out.println(s);
    }

    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        boolean reverFlag = true;
        for(int i=0;i< arr.length;i +=k){
            if(reverFlag)
                reverse(arr,i,Math.min(arr.length-1,i+k-1));
            reverFlag =!reverFlag;
        }
        return new String(arr);
    }

    public static void reverse(char[] arr, int i, int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}