class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length, start=0,last=n-1;
        while(start<=last){
            int mid = (start+last)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target)last = mid-1;
            else start = mid + 1;
        }
        return start;
    }
}