class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean contain1 = false;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1)
                contain1 = true;
            if (nums[i] <= 0 || nums[i] > n)
                nums[i] = 1;
        }
        if (contain1 == false)
            return 1;

        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            int idx = num - 1;
            if (nums[idx] < 0)
                continue;
            nums[idx] = nums[idx] * (-1);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                return (i + 1);
        }

        return n+1;
        //Brute force Approach   

        // int n = nums.length;
        // boolean [] arr = new boolean[n+1];
        // for(int i =0;i<n;i++){
        //     if(nums[i]>0 && nums[i]<=n){
        //         int idx = nums[i];
        //         arr[idx]=true;
        //     }
        // }
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]==false)return i;
        // }
        // return n+1;
    }
}