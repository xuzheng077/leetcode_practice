package arrays;

/**
 * @author Xu Zheng
 * @description
 */
public class ValidMountainArray {
    public static boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        if (A[0] > A[1]) {
            return false;
        }

        boolean flag = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1] && flag) {
                //do nothing
            } else {
                if (flag == true) {
                    flag = false;
                    if (A[i] == A[i + 1]) {
                        return false;
                    }
                } else {
                    if (A[i] <= A[i + 1]) {
                        return false;
                    }
                }
            }
        }
        if (flag) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {0, 3, 2, 1};
        System.out.println(validMountainArray(A));
    }
}
