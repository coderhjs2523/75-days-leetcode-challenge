class Solution {
    public int maxArea(int[] height) {
        int n = height.length, lp = 0, rp = n - 1, length = 0, maxWater = 0;
        while (lp < rp) {
            int width = rp - lp;
            length = Math.min(height[lp], height[rp]);
            int calWater = width * length;
            maxWater = Math.max(maxWater, calWater);
            if (height[lp] < height[rp]) {
                 lp++;
            } else {
                 rp--;
            }
        }
        return maxWater;

        // int n = height.length, waterAmount = 0, length = 0;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (height[i] < height[j]) {
        //             length = height[i];
        //         } else {
        //             length = height[j];
        //         }
        //         int width = j - i;
        //         int calAmount = length * width;
        //         waterAmount = Math.max(waterAmount, calAmount);
        //     }
        // }
        // return waterAmount;
    }
}