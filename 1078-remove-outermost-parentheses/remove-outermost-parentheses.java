class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0, counter = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ')')
                counter--;
            if (counter != 0)
                ans.append(s.charAt(i));
            if (s.charAt(i) == '(')
                counter++;
            i++;
        }
        return ans.toString();
    }
}