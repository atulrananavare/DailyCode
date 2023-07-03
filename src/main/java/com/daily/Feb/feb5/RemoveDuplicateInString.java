package com.daily.Feb.feb5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInString {
    public static void main(String[] args) {
        String str = "zvvo";
        StringBuilder sb = new StringBuilder();

        //Method1
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

        System.out.println("+++++++++++++++++"+removeDup(str));
    }


    //Method2
    public static String removeDup(String S) {
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            String str = String.valueOf(S.charAt(i));
            if (!ans.contains(str)) {
                ans += S.charAt(i);
            }
        }

        return ans;
    }
}
