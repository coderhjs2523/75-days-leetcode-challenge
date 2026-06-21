class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length, MaxMul=Integer.MIN_VALUE;
        for(int start=0;start<n;start++){
            int CurrMul=1;
            for(int end=start;end<n;end++){
                CurrMul *= nums[end];
                MaxMul = Math.max(CurrMul, MaxMul);
            }
        }
        return MaxMul;
    }
}