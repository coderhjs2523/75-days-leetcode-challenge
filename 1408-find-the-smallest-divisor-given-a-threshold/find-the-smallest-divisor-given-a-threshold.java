class Solution {
    public int FindDivisorSum(int[] nums, int divisor) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.ceil((double)nums[i] / divisor);
        }
        return ans;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxNum = Math.max(nums[i], maxNum);
        }
        int start = 1;
        int end = maxNum;
        int finalAns = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sumAfterDivide = FindDivisorSum(nums, mid);
            if (sumAfterDivide <= threshold) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return start;
    }
}