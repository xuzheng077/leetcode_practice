package algorithms;

/**
 * @author Xu Zheng
 * @description 冒泡排序
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false; //可以优化一下，用此变量表示本轮排序有无发生交换，如果没有，说明已经排好，break即可
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static int[] bubbleSortHazel(int[] nums){
        if( nums == null|| nums.length == 0)
            return null;

        int temp;
        int length = nums.length;

        while(length > 0) {
            for (int i = 0; i + 1 < length; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            length--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = null;
        bubbleSortHazel(arr);
//        for (int i : arr) {
//            System.out.println(i);
//        }
    }
}
