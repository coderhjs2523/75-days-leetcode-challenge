class Solution {
    public boolean validMountainArray(int[] arr) {
        int n= arr.length;
        int i=1;
        if(n<3)return false;
        while(i<n && arr[i]>arr[i-1])i++;
        if(i==1 || i==n)return false;
        while(i<n && arr[i-1]>arr[i])i++;
        return i==n;
    }
}