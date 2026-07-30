class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String temp = strs[i];
            int p1 = 0;
            int p2 = 0;
            while (p1 < prefix.length() && p2 < temp.length()) {
                if (prefix.charAt(p1) != temp.charAt(p2)) break;
                sb.append(prefix.charAt(p1));
                p1++;
                p2++;
            }
            prefix = sb.toString();
            sb.setLength(0);
        }
        return prefix;
    }
}