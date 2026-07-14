class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0];
        for (int i = 0; i < n; i++) {
            if(nums[i]==nums[i+1])return nums[i];
            
        }
        return 0;

        // int n = nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[j];
        //         }
        //     }
        // }
        // return 0;
    }
}