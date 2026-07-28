class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;
        int sCount = 0;
        int eCount = 0;
        while (start < end) {
            if (vowels.indexOf(s.charAt(start)) != -1)
                sCount++;
            if (vowels.indexOf(s.charAt(end)) != -1)
                eCount++;
            start++;
            end--;
        }
        return sCount == eCount;
    }
}