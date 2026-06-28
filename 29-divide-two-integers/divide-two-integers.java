class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)return Integer.MAX_VALUE;
        if(dividend==Integer.MIN_VALUE && divisor==1)return Integer.MIN_VALUE;

        long div = Math.abs((long)dividend);
        long dvi = Math.abs((long)divisor);

        int ans = 0;
        while(dvi<=div){
            long sum = dvi, count =1;
            while(sum<=(div-sum)){
                sum += sum;
                count += count;
            }
            ans += count;
            div -= sum;
        }
        if ((dividend <= 0 && divisor >= 0) || (dividend >= 0 && divisor <= 0))
            return -(ans);
        return ans;



        // if (dividend == Integer.MIN_VALUE && divisor == -1)
        //     return Integer.MAX_VALUE;
        // if (dividend == 0)
        //     return 0;
        // int count = 0;
        // long divideHonaWala = Math.abs((long)dividend);
        // long divideKarnaWala = Math.abs((long)divisor);
        // while (divideHonaWala > 0 && divideHonaWala >= divideKarnaWala) {
        //     divideHonaWala = divideHonaWala - divideKarnaWala;
        //     count++;
        // }
        // if ((dividend <= 0 && divisor >= 0) || (dividend >= 0 && divisor <= 0))
        //     return -(count);
        // return count;
    }
}