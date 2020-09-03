package everyday;

/**
 * @author Xu Zheng
 * @description
 */
public class minSubArrayLen {
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int subLength = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= s) {
                subLength = (end - start + 1);
                result = Math.min(result, subLength);
                sum -= nums[start];
                start++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2};
        int result = minSubArrayLen(7, nums);
        System.out.println(result);

    }
}
