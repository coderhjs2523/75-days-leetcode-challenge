class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        int[] arr = new int[m + n];
        while (p1 >= 0 && p2 >= 0 ) {
            if (nums1[p1] > nums2[p2]) {
                arr[i] = nums1[p1];
                p1--;
            } else {
                arr[i] = nums2[p2];
                p2--;
            }
            i--;
        }
        while (p1 >= 0) {
            arr[i] = nums1[p1];
            p1--;
            i--;
        }
        while (p2 >= 0) {
            arr[i] = nums2[p2];
            p2--;
            i--;
        }
        int idx = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            double sum = arr[idx - 1] + arr[idx];
            return sum / 2;
        }
        return (double) arr[idx];
    }
}