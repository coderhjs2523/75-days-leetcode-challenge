class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1, m = 0;
        while (m <= r) {
            if (nums[m] == 0) {
                swap(nums, l, m);
                l++;
                m++;
            }
            else if (nums[m] == 2) {
                swap(nums, r, m);
                r--;
            }
            else {
                m++;
            }
        }

        // int n = nums.length, Count_0 = 0, Count_1 = 0, Count_2 = 0;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == 0)
        //         Count_0++;
        //     else if (nums[i] == 1)
        //         Count_1++;
        //     else
        //         Count_2++;
        // }

        // for (int i = 0; i < n; i++) {
        //     if (Count_0 != 0) {
        //         nums[i] = 0;
        //         Count_0--;
        //     } else if (Count_1 != 0) {
        //         nums[i] = 1;
        //         Count_1--;
        //     } else {
        //         nums[i] = 2;
        //         Count_2--;
        //     }
        // }

        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-1-i;j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp = nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //         }
        //     }
        // }
    }
}