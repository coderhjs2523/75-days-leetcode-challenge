class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max1 = Math.max(max1, nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != max1 && nums[i] > max2) {
                max2 = Math.max(max2, nums[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != max1 && nums[i] != max2 && nums[i] > max3) {
                max3 = Math.max(max3, nums[i]);
            }
        }

        if (max3 == Long.MIN_VALUE)
            return (int)max1;
        return (int)max3;

        // Long first = null;
        // Long second = null;
        // Long third = null;

        // for (int num : nums) {

        //     // Skip duplicate values
        //     if ((first != null && num == first) ||
        //         (second != null && num == second) ||
        //         (third != null && num == third)) {
        //         continue;
        //     }

        //     if (first == null || num > first) {
        //         third = second;
        //         second = first;
        //         first = (long) num;
        //     }
        //     else if (second == null || num > second) {
        //         third = second;
        //         second = (long) num;
        //     }
        //     else if (third == null || num > third) {
        //         third = (long) num;
        //     }
        // }

        // return (third == null) ? first.intValue() : third.intValue();
    }
}