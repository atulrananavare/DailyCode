package com.daily.leetcodes.May24;

import java.util.HashMap;
import java.util.Map;

public class StudentAttendenceReord {

    public static void main(String[] args) {
        String s = "PPALLL";
        boolean eligible = checkAttendanceAward(s);
        System.out.println(eligible);  // Output: true
    }

    public static boolean checkAttendanceAward(String s) {
        // Create a HashMap to store the count of 'A', 'L', and 'P'
        Map<Character, Integer> countMap = new HashMap<>();

        // Initialize the count of each character to 0
        countMap.put('A', 0);
        countMap.put('L', 0);
        countMap.put('P', 0);

        // Iterate through the string to count 'A's and check for consecutive 'L's
        int consecutiveLates = 0;

        for (char c : s.toCharArray()) {
            // Increment the count of the character in the map
            countMap.put(c, countMap.get(c) + 1);

            // Check for three consecutive 'L's
            if (c == 'L') {
                consecutiveLates++;
                if (consecutiveLates >= 3) {
                    return false;  // More than two consecutive 'L's found
                }
            } else {
                consecutiveLates = 0;  // Reset the counter if the character is not 'L'
            }
        }

        // Check if the number of 'A's is fewer than 2
        return countMap.get('A') < 2;
    }

    public static boolean checkAttendanceAwardWay2(String s) {
        int countA = 0;  // To count the number of 'A's
        int consecutiveLates = 0;  // To count consecutive 'L's

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check for 'A' and increment the count
            if (c == 'A') {
                countA++;
                if (countA >= 2) {
                    return false;  // More than one 'A' found
                }
            }

            // Check for consecutive 'L's
            if (c == 'L') {
                consecutiveLates++;
                if (consecutiveLates >= 3) {
                    return false;  // Three consecutive 'L's found
                }
            } else {
                consecutiveLates = 0;  // Reset the counter if the character is not 'L'
            }
        }

        return true;  // If the conditions are satisfied, return true
    }
}

