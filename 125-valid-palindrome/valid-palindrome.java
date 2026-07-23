class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char chStart = s.charAt(start);
            char chEnd = s.charAt(end);

            if (!Character.isLetterOrDigit(chStart)) {
                start++;
                continue;
            }

            if (!Character.isLetterOrDigit(chEnd)) {
                end--;
                continue;
            }

            if (Character.toLowerCase(chStart) != Character.toLowerCase(chEnd)) return false;

            start++;
            end--;
        }

        return true;
    }
}