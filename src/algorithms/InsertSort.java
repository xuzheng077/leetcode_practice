package algorithms;

/**
 * @author Xu Zheng
 * @description
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int j = i - 1;
                int temp = arr[i];
                arr[i] = arr[j];
                while (j>=0 && arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 2, 1, 6, 73, 3, 9};
        insertSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
