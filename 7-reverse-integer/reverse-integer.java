class Solution {
    public int reverse(int x) {
        long newnum = 0;
        while (x != 0) {
            int r = x % 10;
            newnum = newnum * 10 + r;
            x = x / 10;
        }
        if (newnum > Integer.MAX_VALUE || newnum < Integer.MIN_VALUE)
            return 0;
        return (int)newnum;
    }
}