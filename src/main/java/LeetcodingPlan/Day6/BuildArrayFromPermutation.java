package LeetcodingPlan.Day6;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }
    }

    /**
     * Input: nums = [0,2,1,5,3,4]
     * Output: [0,1,2,4,5,3]
     * Explanation: The array ans is built as follows:
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     * = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
     * = [0,1,2,4,5,3]
     *
     * @param nums
     * @return
     */
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
