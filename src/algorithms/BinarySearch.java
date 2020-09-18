package algorithms;

import java.util.Date;

/**
 * @author Xu Zheng
 * @description 二分查找
 * 使用条件：数组是有序的
 * 平均时间复杂度为O(logN)
 */
public class BinarySearch {

    //非递归实现
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        //当key小于最小值或大于最大值时，直接返回-1，因为此时key必然不存在于arr中
        if (key < arr[low] || key > arr[high]) {
            return -1;
        }
        while (low <= high) {
            int middle = (low + high) / 2;
            if (key == arr[middle]) {
                return middle;
            } else if (key < arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    //递归实现
    public static int recursiveBinarySearch(int[] arr, int key, int low, int high) {
        int middle = (low + high) / 2;
        if (key < arr[low] || key > arr[high]) {
            return -1;
        }
        if (key == arr[middle]) {
            return middle;
        } else if (key < arr[middle]) {
            return recursiveBinarySearch(arr, key, low, middle - 1);
        } else {
            return recursiveBinarySearch(arr, key, middle + 1, high);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 9, 9, 10, 16, 27, 48, 99, 474, 3262, 264642};
        int key = 9;

        int result1 = binarySearch(arr, key);
        int result2 = recursiveBinarySearch(arr, key, 0, arr.length - 1);
        System.out.println(result1);
        System.out.println(result2);
    }
}
