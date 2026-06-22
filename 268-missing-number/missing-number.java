class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length+1, sum=0;
        int sumNatural = n*(n-1)/2;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        return sumNatural-sum;
    }
}