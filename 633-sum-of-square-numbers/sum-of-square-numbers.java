class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);
        while (a <= b) {
            long value = a * a + b * b;
            if (value == c)
                return true;
            else if (value < c)
                a++;
            else
                b--;
        }
        return false;
    }
}