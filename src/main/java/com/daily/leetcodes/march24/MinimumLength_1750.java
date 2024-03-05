package com.daily.leetcodes.march24;

public class MinimumLength_1750 {
    public static void main(String[] args) {

        System.out.println(minimumLength("cabaabac"));
    }

//    Input: s = "cabaabac"
//    Output: 0
//    Explanation: An optimal sequence of operations is:
//            - Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
//            - Take prefix = "a" and suffix = "a" and remove them, s = "baab".
//            - Take prefix = "b" and suffix = "b" and remove them, s = "aa".
//            - Take prefix = "a" and suffix = "a" and remove them, s = "".
//

    public static int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char ch = s.charAt(left);
            while (left <= right && s.charAt(left) == ch) left++;
            while (left <= right && s.charAt(right) == ch) right--;
        }
        return (left > right) ? 0 : right - left + 1;
    }
}
