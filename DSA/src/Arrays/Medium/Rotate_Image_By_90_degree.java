package Arrays.Medium;

public class Rotate_Image_By_90_degree {
    //leetcode 48
    public static void main(String[] args) {

    }
    static void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rotated[i][j];
            }
        }
    }
    static void rotate_Optimal(int[][] matrix) {
        // Optinmal Approach
        /*
         # .Approach
         Step 1: Transpose the matrix. (transposing means changing columns to rows and rows to columns)
         Step 2: Reverse each row of the matrix.
         # .Complexity
         * Time complexity:
             O(N*N) + O(N*N).One O(N*N) is for transposing the matrix and the other is for reversing the matrix.
         * Space complexity:
             O(1)
         */
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
