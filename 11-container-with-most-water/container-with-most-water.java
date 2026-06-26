class Solution {
    public int maxArea(int[] height) {
        int n = height.length, l = 0, r = n - 1, length = 0, maxWater = 0;
        while (l < r) {
            int width = r - l;
            length = Math.min(height[l], height[r]);
            int calWater = width * length;
            maxWater = Math.max(maxWater, calWater);
            if (length == height[l])
                l++;
            else
                r--;
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