package arrays;

/**
 * @author Xu Zheng
 * @description using 2 pointers, O(1) space and O(n) time
 */
public class RemoveDuplicatesfromSortedArray2 {
    public static int removeDuplicates(int[] nums) {
        return 0;
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
