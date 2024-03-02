package com.daily.leetcodes.july;

import java.util.HashSet;
import java.util.Set;

public class BuddyString {

    public static void main(String[] args) {
        BuddyString search = new BuddyString();
        System.out.println(search.buddyStrings("ab", "ba"));
    }


    public boolean buddyStrings(String s, String goal) {
        int length = s.length();
        if (s.equals(goal)) {
            Set<Character> temp = new HashSet<>();
            for (char c : s.toCharArray()) {
                temp.add(c);
            }
            return temp.size() < goal.length(); // Swapping same characters
        }

        int left = 0;
        int right = length - 1;

        while (left < right && s.charAt(left) == goal.charAt(left)) {
            left++;
        }

        while (right >= 0 && s.charAt(right) == goal.charAt(right)) {
            right--;
        }

        if (left < right) {
            char[] sArr = s.toCharArray();
            char temp = sArr[left];
            sArr[left] = sArr[right];
            sArr[right] = temp;
            s = new String(sArr);
        }

        return s.equals(goal);
    }


}
