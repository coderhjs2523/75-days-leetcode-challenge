class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, count=0;
        for(int start=0;start<n;start++){
            int CurrSum=0;
            for(int end=start;end<n;end++){
                CurrSum += nums[end];
                if(CurrSum==k)count++;
            }
        }
        return count;
    }
}