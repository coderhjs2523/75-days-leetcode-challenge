class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length, l = 1, u = n - 2, mid = -1;
        while (l <= u) {
            mid = (l + u) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                break;
            else if ((arr[mid] > arr[mid - 1]) && (arr[mid] < arr[mid + 1]))
                l = mid + 1;
            else
                u = mid - 1;
        }
        return mid;
    }
}