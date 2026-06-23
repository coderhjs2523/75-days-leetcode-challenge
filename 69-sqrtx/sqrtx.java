class Solution {
    public int mySqrt(int x) {
        long num=0;
        for(long i=1;i<=x;i++){
            if(i*i>x)break;
            num=i;
        }
        return (int)num;
    }
}