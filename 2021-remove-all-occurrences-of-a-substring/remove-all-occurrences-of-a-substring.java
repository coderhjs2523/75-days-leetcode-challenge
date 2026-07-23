class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            ans.append(s.charAt(i));

            if (ans.length() >= part.length()) {
                int start = ans.length() - part.length();
                if (ans.substring(start).equals(part)) {
                    ans.delete(start, ans.length());
                }
            }
        }
        return ans.toString();
    }
}