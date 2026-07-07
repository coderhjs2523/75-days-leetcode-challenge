class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        String s = String.valueOf(n);
        String num = "";
        long sum = 0;
        int idx=0;
        while (idx != s.length()) {
            char ch = s.charAt(idx);
            idx++;
            if(ch!= '0'){
                sum = sum + (ch-'0');
                num = num + ch;;
            }
        }
        return (Integer.parseInt(num) * sum);
    }
}