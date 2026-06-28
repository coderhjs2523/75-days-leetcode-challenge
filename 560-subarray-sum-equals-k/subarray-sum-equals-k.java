class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, count=0;
        for(int i=0;i<n;i++){
            int CurrSum=0;
            for(int j=i;j<n;j++){
                CurrSum += nums[j];
                if(CurrSum==k)count++;
            }
        }
        return count;
    }
}