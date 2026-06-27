class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            int stCol = 0, endCol = matrix[0].length-1;
            while (stCol <= endCol) {
                int temp = matrix[i][stCol];
                matrix[i][stCol] = matrix[i][endCol];
                matrix[i][endCol] = temp;
                stCol++;
                endCol--;
            }
        }
    }
}