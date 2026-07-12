class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean [] arr = new boolean[n+1];
        for(int i =0;i<n;i++){
            if(nums[i]>0 && nums[i]<=n){
                int idx = nums[i];
                arr[idx]=true;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==false)return i;
        }
        return n+1;
    }
}