package everyday;

/**
 * @author Xu Zheng
 * @description
 */
public class generateMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int startx = 0, starty = 0;
        int loop = n / 2;
        int mid = n / 2;
        int count = 1;
        int offset = 1;
        int i, j;
        while (loop > 0) {
            i = startx;
            j = starty;

            // 模拟填充上行从左到右(左闭右开)
            for (j = starty; j < starty + n - offset; j++) {
                result[startx][j] = count++;
            }
            // 模拟填充右列从上到下(左闭右开)
            for (i = startx; i < startx + n - offset; i++) {
                result[i][j] = count++;
            }
            // 模拟填充下行从右到左(左闭右开)
            for (; j > starty; j--) {
                result[i][j] = count++;
            }
            // 模拟填充左列从下到上(左闭右开)
            for (; i > startx; i--) {
                result[i][j] = count++;
            }

            startx++;
            starty++;
            offset += 2;

            loop--;
        }
        if (n % 2 == 1) {
            result[mid][mid] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        /**
         * [1,2,3,4]
         * [12,13,14,5]
         * [11,16,15,6]
         * [10,9,8,7]
         */
        int n = 4;
        int[][] result = generateMatrix(n);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
