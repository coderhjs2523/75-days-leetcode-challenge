class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num >= 10 && num <= 99) ||
                    (num >= 1000 && num <= 9999) ||
                    num == 100000) {
                count++;
            }
        }
        return count;

        // int result = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int count = 0;
        //     int n1 = nums[i];
        //     while (n1 != 0) {
        //         count++;
        //         n1 /= 10;
        //     }
        //     if (count % 2 == 0 && count != 0)
        //         result++;
        // }
        // return result;
    }
}