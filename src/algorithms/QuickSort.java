package algorithms;

/**
 * @author Xu Zheng
 * @description
 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 2, 1, 6, 73, 3, 9};
        quickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
