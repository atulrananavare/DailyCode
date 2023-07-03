package LeetcodingPlan.Day1;

import java.util.ArrayList;
import java.util.List;

public class CountOdds {

    public static void main(String[] args) {

        System.out.println(countOdds(800445804,979430543));
    }

//    Input: low = 3, high = 7
//    Output: 3
//    Explanation: The odd numbers between 3 and 7 are [3,5,7].
//    Example 2:
//
//    Input: low = 8, high = 10
//    Output: 1
//    Explanation: The odd numbers between 8 and 10 are [9].

    public static int countOddss(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for (int temp = low; temp <= high; temp++) {
            if (temp % 2 != 0) {
                list.add(temp);
            }
        }
        return list.size();
    }

    //    Analysing the problem based on the whether high and low is even or odd and trying to reach into a solution.
//
//            CASE 1 :
//            3,7 ==> 3 odd and odd ==> high-low/2 +1
//
//    CASE 2 :
//            2,7 ==> 3 even and odd ==> high-low/2+1
//
//    CASE 3 :
//            4,7 ==> 2 even and odd ==>high-low/2+1
//
//    CASE 4 :
//            3,8 ==> 3 odd and even ==>high-low/2+1
//
//    CASE 5 :
//            3,6 ==>2 odd and even ==>high-low/2+1
//
//    CASE 6 :
//            2,8 ==>3 even and even ==>high-low/2+1
    public static int countOdds(int low, int high) {

        if ((low % 2 == 0 && high % 2 == 0)) return (high - low) / 2;
        return ((high - low) / 2 + 1);
    }
}
