class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int j=0,k=0,size=(int)n/2;
        int [] Positive = new int[size];
        int [] Negative = new int[size];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                Positive[j]=nums[i];
                j++;
            }
            else{
                Negative[k]= nums[i];
                k++;
            }
        }
        int i=0,p1=0,p2=0;
        while(i<n){
            nums[i]=Positive[p1];
            p1++;
            i++;
            nums[i]=Negative[p2];
            p2++;
            i++;
        }
        return nums;
    }
}