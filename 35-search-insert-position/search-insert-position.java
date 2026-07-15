class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length, start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //if(nums[mid]==target)return mid;
            if (nums[mid] >= target)
                end = mid - 1;
            else // nums[mid]<target
                start = mid + 1;
        }
        return start;
    }
}