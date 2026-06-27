class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int start=i+1,end=n-1;
            while(start<end){
                int sum = nums[i]+nums[start]+ nums[end];
                if(sum<0)start++;
                else if(sum>0)end--;
                else {
                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;

                    // Skip duplicate second elements
                    while (start < end && nums[start] == nums[start - 1])
                        start++;

                    // Skip duplicate third elements
                    while (start < end && nums[end] == nums[end + 1])
                        end--;
                }
            }
        }
        return ans;
    }
}