class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int charCode1 = (int) s.charAt(i);
            int charCode2 = (int) s.charAt(i + 1);
            sum += Math.abs(charCode1 - charCode2);
        }
        return sum;
    }
}