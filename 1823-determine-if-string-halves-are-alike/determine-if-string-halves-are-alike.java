class Solution {
    public boolean halvesAreAlike(String s) {
        char[] characterArr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = characterArr.length - 1;
        int sCount = 0;
        int eCount = 0;
        while (start < end) {
            if (vowels.indexOf(characterArr[start]) != -1)
                sCount++;
            if (vowels.indexOf(characterArr[end]) != -1)
                eCount++;
            start++;
            end--;
        }
        if (sCount == eCount)
            return true;
        return false;
    }
}