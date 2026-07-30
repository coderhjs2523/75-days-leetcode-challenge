class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);
        int p1 =0, p2=0;
        if (str1.length() != str2.length())
            return false;
        while (p1 < str1.length()) {
            if (str1.charAt(p1) != str2.charAt(p2))
                return false;
            p1++;
            p2++;
        }
        return true;
    }
}