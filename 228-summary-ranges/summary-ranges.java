class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            while (i+1 < n && (nums[i + 1] == nums[i] + 1)) {
                i++;
            }
            int end = nums[i];
            if (start == end) {
                ans.add(String.valueOf(start));
            } else
                ans.add(start + "->" + end);
        }
        return ans;
    }
}