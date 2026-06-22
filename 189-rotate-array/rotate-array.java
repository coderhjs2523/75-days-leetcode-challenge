class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
            System.out.println(Arrays.toString(nums));
        }
        public static void reverse(int start, int last, int[]arr){
            while(start<last){
                int temp = arr[start];
                arr[start]=arr[last];
                arr[last]=temp;
                start++;
                last--;
            }
    }
}