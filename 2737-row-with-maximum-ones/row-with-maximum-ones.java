class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] ans = new int [2]; 
        int maxCount=0,index=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)count++;
            }
            if(count>maxCount){
                maxCount=count;
                index=i;
            }
        }
        ans[0]=index;
        ans[1]=maxCount;
        return ans;
    }
}