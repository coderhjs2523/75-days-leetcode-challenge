class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] capital = new boolean[26];
        boolean[] small = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                capital[ch - 'A'] = true;
            else
                small[ch - 'a'] = true;
        }

        int count = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < 26) {
            if (capital[p1] == true && small[p2] == true)
                count++;
            p1++;
            p2++;
        }
        return count;
    }
}