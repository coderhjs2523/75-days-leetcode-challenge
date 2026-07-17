class Solution {
// k is number of banana eating per hour
    public int calculateHr(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans += Math.ceil((double) nums[i] / k);
        }

        return ans;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int max = piles[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, piles[i]);
        }

        int start = 1;
        int end = max;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int totalhr = calculateHr(piles, mid);

            if (totalhr <= h) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}