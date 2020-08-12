package arrays;

/**
 * @author Xu Zheng
 * @description
 */
public class RemoveElementSolution {
    public static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                result++;
            }
        }
        int times = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
                times++;
                if (times == result) {
                    break;
                }
            } else {
                //do nothing
            }
        }
        return nums.length - result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int result = removeElement(nums, val);
        System.out.println(result);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
