package arrays;

/**
 * @author Xu Zheng
 * @description
 */
public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int actual_length = nums.length;
        for (int i = 0; i < actual_length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < actual_length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                actual_length--;
                i--;
            }
        }
        return actual_length;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(nums);
        System.out.println(result);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
