package com.daily.july;

//LeetCode:2305
public class FairDistributionOfCookies {
    int ans; // Variable to store the minimum unfairness
    int[] count; // Array to keep track of the number of cookies each child receives

    public static void main(String[] args) {
        FairDistributionOfCookies cookies=new FairDistributionOfCookies();
        int[] cookies1 = {8, 15, 10, 20, 8};
        int k = 2;
        System.out.println(cookies.distributeCookies(cookies1,k));
    }


    private void backTrack(int cookieNo, int[] cookies, int k) {
        if (cookieNo == cookies.length) {
            int max = 0;
            for (int i = 0; i < k; i++) {
                max = Math.max(max, count[i]); // Find the maximum number of cookies received by any child
            }
            ans = Math.min(ans, max); // Update the minimum unfairness
            return;
        }
        for (int i = 0; i < k; i++) {
            count[i] += cookies[cookieNo]; // Add the current bag of cookies to a child
            backTrack(cookieNo + 1, cookies, k); // Recursively explore the next bag of cookies
            count[i] -= cookies[cookieNo]; // Backtrack by removing the current bag from the child
            if (count[i] == 0) break; // Optimization: If a child has no cookies, no need to explore further
        }
    }

    public int distributeCookies(int[] cookies, int k) {
        ans = Integer.MAX_VALUE; // Initialize the minimum unfairness to maximum possible value
        count = new int[k]; // Initialize the count array to keep track of the cookies each child receives
        backTrack(0, cookies, k); // Start the backtracking algorithm
        return ans; // Return the minimum unfairness
    }
}
