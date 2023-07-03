package LeetcodingPlan.Day3;

import java.util.Arrays;

public class LargestPerimeterTriangle {

//    The sides of a triangle rule asserts that the sum of the lengths of any two sides of a triangle
//    has to be greater than the length of the third side.

    public static void main(String[] args) {

        int[] arr={2,1,2};
        System.out.println(largestPerimeter(arr));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =n-1; i>=2; i--) {
            if(nums[i] < nums[i-1] + nums[i-2]) {
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }
}
