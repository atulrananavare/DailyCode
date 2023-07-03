package LeetcodingPlan.Day4;

public class ArraySign {

    public static void main(String[] args) {
        int[] arr = {-1, 1, -1, 1, -1};
        System.out.println(arraySign(arr));
    }

    //    Input: nums = [-1,-2,-3,-4,3,2,1]
//    Output: 1
//    Explanation: The product of all values in the array is 144, and signFunc(144) = 1
    public static int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                count++;
            }
        }
        if (count % 2 == 0) return 1;

        return -1;
    }
}
