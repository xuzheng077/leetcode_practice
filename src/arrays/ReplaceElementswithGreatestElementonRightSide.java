package arrays;

/**
 * @author Xu Zheng
 * @description
 */
public class ReplaceElementswithGreatestElementonRightSide {

    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            max = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        replaceElements(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
