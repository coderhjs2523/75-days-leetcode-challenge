class Solution {
    public static int firstIndex(int [] nums, int target){
        int n=nums.length,s=0,l=n-1,Index=-1;
        while(s<=l){
            int mid = s+(l-s)/2;
            if(nums[mid]==target){
                Index=mid;
                l=mid-1;
            }    
            else if(nums[mid]<target) s=mid+1;
            else l=mid-1;
        }
        return Index;
    }
    public static int lastIndex(int [] nums, int target){
        int n=nums.length,s=0,l=n-1,Index=-1;
        while(s<=l){
            int mid = s+(l-s)/2;
            if(nums[mid]==target){
                Index=mid;
                s=mid+1;
            }    
            else if(nums[mid]<target) s=mid+1;
            else l=mid-1;
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