class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int charCode = (int) s.charAt(i);
            int charCodePro = (123 - charCode) * (i+1);
            sum += charCodePro;
        }
        return sum;
    }
}