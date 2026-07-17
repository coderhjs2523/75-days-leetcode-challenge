class Solution {
    public int findCapacity(int[] nums, int maxCapacity) {
        int days = 0;
        int capacity = 0;
        for (int i = 0; i < nums.length; i++) {
            if (capacity + nums[i] <= maxCapacity) {
                capacity += nums[i];
            } else {
                days++;
                capacity = nums[i];
            }
        }
        if(capacity<=maxCapacity)days++;
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int maxNum = Integer.MIN_VALUE;
        int toatalCapacity = 0;
        for (int i = 0; i < weights.length; i++) {
            maxNum = Math.max(maxNum, weights[i]);
            toatalCapacity += weights[i];
        }
        int start = maxNum;
        int end = toatalCapacity;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int minDays = findCapacity(weights, mid);
            if (minDays <= days)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
}