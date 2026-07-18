class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1, i = 0;
        while (i < arr.length) {
            if (k == 0)
                return num-1;
            else if (arr[i] == num)
                i++;
            else
                k--;
            num++;
        }
        while (k > 0) {
            num++;
            k--;
        }
        return num-1;

        // int start = 0;
        // int end = arr.length - 1;
        // while (start <= end) {
        //     int mid = start + (end - start) / 2;
        //     int ans = arr[mid] - (mid + 1);
        //     if (ans < k)
        //         start = mid + 1;
        //     else
        //         end = mid - 1;
        // }
        // return start + k;
    }
}