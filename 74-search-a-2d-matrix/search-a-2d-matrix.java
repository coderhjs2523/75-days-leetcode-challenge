class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            //row Number = mid / col
            // col Number = mid % col
            int value = matrix[mid / col][mid % col];

            if (value == target)
                return true;
            else if (value < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }
}













// class Solution {
//     public boolean findNum(int[][] matrix, int target,int rowIndex){
//         int colStart = 0, colEnd = matrix[0].length - 1;
//         while (colStart <= colEnd) {
//             int midCol = colStart + (colEnd - colStart) / 2;

//             if (matrix[rowIndex][midCol] < target) colStart = midCol + 1;
//             else if (matrix[rowIndex][midCol] > target) colEnd = midCol - 1;
//             else return true;

//             }
//         return false; 
//     }

//     public boolean searchMatrix(int[][] matrix, int target) {
//         int row = matrix.length, col = matrix[0].length;

//         int rowStart = 0, rowEnd = row - 1;

//         while (rowStart <= rowEnd) {
//             int midRow = rowStart + (rowEnd - rowStart) / 2;

//             if (target >= matrix[midRow][0] && target <= matrix[midRow][col - 1]) return findNum(matrix, target, midRow);
//             else if (matrix[midRow][0] < target) rowStart = midRow + 1;
//             else rowEnd = midRow - 1;
//         }
//         return false;
//     }
// }