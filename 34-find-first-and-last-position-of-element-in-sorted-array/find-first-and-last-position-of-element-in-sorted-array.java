class Solution {
    public static int firstIndex(int [] nums, int target){
        int n=nums.length,start=0,end=n-1,Index=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                Index=mid;
                end=mid-1;
            }    
            if(nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return Index;
    }
    public static int lastIndex(int [] nums, int target){
        int n=nums.length,start=0,end=n-1,Index=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                Index=mid;
                start=mid+1;
            }    
            else if(nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return Index;
    }
    public int[] searchRange(int[] nums, int target) {
        int [] arr = new int [2];
        arr[0]=firstIndex(nums,target);
        arr[1]=lastIndex(nums,target);
        return arr;
    }
}