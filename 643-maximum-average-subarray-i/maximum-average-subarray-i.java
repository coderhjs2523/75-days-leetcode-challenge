class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double avg = 0, windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        avg = windowSum / k;
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            avg = Math.max(avg, windowSum / k);
        }
        return avg;
    }
}