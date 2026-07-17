class Solution {
    int check(int[] arr, int day, int flowerNum) {
        int bloomCount = 0;
        int BouquetNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day){
                bloomCount++;
            }
            else{
                BouquetNum += bloomCount/flowerNum;
                bloomCount=0;
            }
                
        }
        BouquetNum += bloomCount/flowerNum;
        return BouquetNum;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            minNum = Math.min(minNum, bloomDay[i]);
            maxNum = Math.max(maxNum, bloomDay[i]);
        }
        int start = minNum;
        int end = maxNum;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ans = check(bloomDay, mid, k);
            if (ans >= m)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start <= maxNum ? start : -1;
    }
}