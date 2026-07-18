class Solution {
    public boolean check(int[] nums, int minSum, int arrayNum) {
        int numberOfArray = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > minSum) {
                numberOfArray++;
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }
        }
        return numberOfArray<=arrayNum;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        int end = 0;

        for(int i=0;i<n;i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while(start<=end){
            int mid = start+(end-start)/2;
            if(check(nums, mid, k)) end = mid -1;
            else start= mid + 1;
        }
        return start;
    }
}