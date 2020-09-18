package algorithms;

/**
 * @author Xu Zheng
 * @description 选择排序
 * 第一轮从整个数组选择最小的数，与数组第一个元素交换
 * 第二轮从第二个数到最后这个区间选择最小的数，与数组第二个元素交换
 * 以此类推
 */
public class SelectSort {
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 6, 8, 9, 26, 43, 26, 7547, 3732, 22667, 0, -1};
        selectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
