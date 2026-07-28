class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int charCode = (int) (s.charAt(i)) + 32;
                sb.append((char) charCode);
            } else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}