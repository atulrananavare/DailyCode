package com.daily.leetcodes.May24;

public class FindTheDifference {

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }

//    Input: s = "abcd", t = "abcde"
//    Output: "e"
    public static char findTheDifference(String s, String t) {
        //CONVERT BOTH STRINGS TO CHAR ARRAYS
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        int i;
        //SUM UP ALL CHAR VALUES IN EACH ARRAY
        int sSum = 0;
        int tSum = 0;
        for (i = 0; i < tArray.length; i++){
            tSum += tArray[i];
        }
        for (i = 0; i < sArray.length; i++){
            sSum += sArray[i];
        }
        //RETURN THE DIFFERENCE BETWEEN BOTH NUMBERS
        return (char)((tSum-sSum));


    }
}
