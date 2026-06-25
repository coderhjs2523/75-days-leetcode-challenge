class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length,k=0,j=0;
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            nums[i]=arr[i];
        }
        
        return j;
    }
}