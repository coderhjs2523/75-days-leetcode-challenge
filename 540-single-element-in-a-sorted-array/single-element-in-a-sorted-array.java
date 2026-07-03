class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == 0 && nums[0] != nums[1])
                return nums[0];
            if (mid == n - 1 && nums[n - 1] != nums[n - 2])
                return nums[n - 1];

            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1])
                return nums[mid];

            else if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1])
                    start = mid + 1;
                else // nums[mid]==nums[mid-1]
                    end = mid - 1;
            } 
            
            else { // mid % 2 == 1
                if (nums[mid] == nums[mid + 1])
                    end = mid - 1;
                else // nums[mid]==nums[mid-1]
                    start = mid + 1;
            }
        }
        return -1;

        //int i=0, n=nums.length;
        // if(n==1)return nums[0];
        // while(i<n-1){
        //     if(nums[i]==nums[i+1]){
        //         i=i+2;
        //     }
        //     else{
        //         return nums[i];
        //     }
        // }
        // return nums[n-1];

    }
}