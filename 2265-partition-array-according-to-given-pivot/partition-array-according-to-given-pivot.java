class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int p1 = 0;
        int p2 = n - 1;
        int[] result = new int[n];
        while (i < n && j >= 0) {
            if (nums[i] < pivot) {
                result[p1] = nums[i];
                p1++;
            }
            if (nums[j] > pivot) {
                result[p2] = nums[j];
                p2--;
            }
            i++;
            j--;
        }
        while (p1 <= p2) {
            result[p1] = pivot;
            p1++;
        }
        return result;
    }
}