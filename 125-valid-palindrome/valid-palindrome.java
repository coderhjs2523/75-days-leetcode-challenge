class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().trim();
        int n = str.length();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }
            else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
            else{
                if (str.charAt(start) != str.charAt(end))
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}