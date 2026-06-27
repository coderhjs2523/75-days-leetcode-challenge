class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;

        int rowStart = 0, rowEnd = row - 1;

        while (rowStart <= rowEnd) {
            int midRow = rowStart + (rowEnd - rowStart) / 2;

            if (target >= matrix[midRow][0] && target <= matrix[midRow][col - 1]) {

                int colStart = 0, colEnd = col - 1;

                while (colStart <= colEnd) {
                    int midCol = colStart + (colEnd - colStart) / 2;

                    if (matrix[midRow][midCol] < target)
                        colStart = midCol + 1;
                    else if (matrix[midRow][midCol] > target)
                        colEnd = midCol - 1;
                    else
                        return true;
                }
                return false; 
            }

            else if (matrix[midRow][0] < target)
                rowStart = midRow + 1;
            else
                rowEnd = midRow - 1;
        }

        return false;
    }
}