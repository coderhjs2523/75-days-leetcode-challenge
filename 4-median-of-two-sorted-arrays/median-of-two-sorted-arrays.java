class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always perform binary search on the smaller array
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length;
        int n = nums2.length;

        int start = 0;
        int end = m;
        int total = m + n;

        while (start <= end) {

            // Number of elements taken from nums1
            int mid = start + (end - start) / 2;

            // Remaining elements taken from nums2
            int idx2 = (total + 1) / 2 - mid;

            int nums1Left = (mid == 0) ? Integer.MIN_VALUE : nums1[mid - 1];
            int nums1Right = (mid == m) ? Integer.MAX_VALUE : nums1[mid];

            int nums2Left = (idx2 == 0) ? Integer.MIN_VALUE : nums2[idx2 - 1];
            int nums2Right = (idx2 == n) ? Integer.MAX_VALUE : nums2[idx2];

            // Correct partition found
            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {

                if (total % 2 == 1) {
                    return Math.max(nums1Left, nums2Left);
                }

                int leftMax = Math.max(nums1Left, nums2Left);
                int rightMin = Math.min(nums1Right, nums2Right);

                return (leftMax + rightMin) / 2.0;
            }

            // Move right
            else if (nums1Right < nums2Left) {
                start = mid + 1;
            }

            // Move left
            else {
                end = mid - 1;
            }
        }

        return 0.0;
        
        // int m = nums1.length;
        // int n = nums2.length;
        // int p1 = m - 1;
        // int p2 = n - 1;
        // int i = m + n - 1;
        // int[] arr = new int[m + n];
        // while (p1 >= 0 && p2 >= 0 ) {
        //     if (nums1[p1] > nums2[p2]) {
        //         arr[i] = nums1[p1];
        //         p1--;
        //     } else {
        //         arr[i] = nums2[p2];
        //         p2--;
        //     }
        //     i--;
        // }
        // while (p1 >= 0) {
        //     arr[i] = nums1[p1];
        //     p1--;
        //     i--;
        // }
        // while (p2 >= 0) {
        //     arr[i] = nums2[p2];
        //     p2--;
        //     i--;
        // }
        // int idx = (m + n) / 2;
        // if ((m + n) % 2 == 0) {
        //     double sum = arr[idx - 1] + arr[idx];
        //     return sum / 2;
        // }
        // return (double) arr[idx];
    }
}