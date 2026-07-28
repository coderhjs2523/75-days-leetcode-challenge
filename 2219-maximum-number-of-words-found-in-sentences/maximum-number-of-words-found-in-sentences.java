class Solution {
    public int mostWordsFound(String[] sentences) {
        int countlen = 0;
        for (int i = 0; i < sentences.length; i++) {
            String str = sentences[i];
            String[] temp = str.split(" ");
            countlen = Math.max(countlen, temp.length);
        }
        return countlen;
    }
}