package arrays;

/**
 * @author Xu Zheng
 * @description
 */
public class FindNumberswithEvenNumberofDigits {
    public static int findNumbers(int[] nums) {
        int result = 0;
        String temp = null;
        for (int i : nums) {
            temp = String.valueOf(i);
            if (temp.length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }
}
