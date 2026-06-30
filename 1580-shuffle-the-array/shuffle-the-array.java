class Solution {
    public int[] shuffle(int[] nums, int n) {
        int p1 = 0;
        int p2 = n;
        int i=0;
        int [] arr = new int [2*n];
        while (i<2*n) {
            arr[i]=nums[p1];
            p1++;
            i++;
            arr[i]=nums[p2];
            p2++;
            i++;
        }
        return arr;
    }
}