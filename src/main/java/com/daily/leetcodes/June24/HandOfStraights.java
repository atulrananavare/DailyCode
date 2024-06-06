package com.daily.leetcodes.June24;

import java.util.Map;
import java.util.TreeMap;

public class HandOfStraights {

    public static void main(String[] args) {
        int[] arr ={1,2,3,3,4,4,5,6};
        int groupSize=4;

        //System.out.println(isNStraightHand(arr,groupSize));
        System.out.println(isPossibleDivide(arr,groupSize));
    }

    //846. Hand of Straights
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        // Check if the hand size is divisible by groupSize
        if (hand.length % groupSize != 0)
            return false;

        // Create a HashMap to count the occurrences of each card value
        Map<Integer, Integer> map = new TreeMap<>();
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        // Iterate through the hand to form groups
        for (int card : map.keySet()) {
            int count = map.get(card);
            if (count > 0) {
                // Start forming a group from the current card
                for (int i = 0; i < groupSize; i++) {
                    // Check if the consecutive cards are available
                    if (!map.containsKey(card + i) || map.get(card + i) < count)
                        return false;
                    // Decrease the count of cards in the group
                    map.put(card + i, map.get(card + i) - count);
                }
            }
        }
        return true; // All groups formed successfully
    }

    //1296. Divide Array in Sets of K Consecutive Numbers
    public static boolean isPossibleDivide(int[] nums, int k) {
        // Check if the hand size is divisible by groupSize
        if (nums.length % k != 0)
            return false;

        // Create a HashMap to count the occurrences of each card value
        Map<Integer, Integer> map = new TreeMap<>();
        for (int card : nums) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        // Iterate through the hand to form groups
        for (int card : map.keySet()) {
            int count = map.get(card);
            if (count > 0) {
                // Start forming a group from the current card
                for (int i = 0; i < k; i++) {
                    // Check if the consecutive cards are available
                    if (!map.containsKey(card + i) || map.get(card + i) < count)
                        return false;
                    // Decrease the count of cards in the group
                    map.put(card + i, map.get(card + i) - count);
                }
            }
        }
        return true; // All groups formed successfully
    }
}
