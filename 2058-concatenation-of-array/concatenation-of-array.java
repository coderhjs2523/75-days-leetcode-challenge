class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length,j=0;
        int [] arr = new int[2*n];
        for(int i=0;i<arr.length;i++){
            if(j==n)j=0;
            arr[i]=nums[j];
            j++;
        }
        return arr;
    }
}