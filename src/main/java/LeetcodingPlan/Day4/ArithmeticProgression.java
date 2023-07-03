package LeetcodingPlan.Day4;

import java.util.Arrays;

public class ArithmeticProgression {

    public static void main(String[] args) {
        int[] arr = {1,10,10,10,19};
        System.out.println(canMakeArithmeticProgression(arr));
    }

//    Given an array of numbers arr, return true if the array can be rearranged to form
//    an arithmetic progression. Otherwise, return false.

    /**
     * @param arr
     * @return
     */

    public static boolean canMakeArithmeticProgression1(int[] arr) {
        Arrays.sort(arr);
        int frddiff = 0;
        int bckDiff = 0;
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            frddiff = arr[i] - arr[i + 1];
        }
        for (int i = length - 1; i > 0; i--) {
            bckDiff = arr[i] - arr[i - 1];
        }

        if (Math.abs(frddiff)==Math.abs(bckDiff)) {
            return true;
        }

        return false;
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1]-arr[0]; //storing difference of 1st 2 element of the sorted array
        for(int i = 2; i< arr.length; i++){
            if((arr[i]-arr[i-1]) != diff){  //comparing diff. b/w each 2 element from diff.
                return false;
            }
        }
        return true;
    }
}
