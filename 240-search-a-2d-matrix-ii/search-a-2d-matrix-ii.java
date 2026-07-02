class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i=0,j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]<target)i++;
            else if(matrix[i][j]>target)j--;
            else return true;
        }

        // for(int i=0;i<m;i++){
        //     if(matrix[i][n-1]==target)return true;
        //     if(matrix[i][n-1]>target){
        //         int p1 = 0;
        //         int p2 = n-1;
        //         while(p1<=p2){
        //             int mid = p1+(p2-p1)/2;
        //             if(matrix[i][mid]==target)return true;
        //             else if(matrix[i][mid]<target) p1=mid+1;
        //             else p2=mid-1;
        //         }
        //     }
        // }
        return false;
    }
}