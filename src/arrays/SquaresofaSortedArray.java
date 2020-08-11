package arrays;

import java.util.Arrays;

/**
 * @author Xu Zheng
 * @description
 */
public class SquaresofaSortedArray {
    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] A = {-7, -3, 2, 3, 11};
        sortedSquares(A);
        for (int i : A) {
            System.out.println(i);
        }
    }
}
