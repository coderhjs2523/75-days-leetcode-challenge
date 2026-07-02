class Solution {
    public int gcdOfOddEvenSums(int n) {
        int i = 1;
        int EvenNum = 2;
        int OddNum = 1;
        int EvenSum = 2;
        int OddSum = 1;
        while (i < n) {
            EvenNum += 2;
            OddNum += 2;
            EvenSum += EvenNum;
            OddSum += OddNum;
            i++;
        }
        int num = Math.min(EvenSum, OddSum);
        for (int k = num; k >= 1; k--) {
            if (EvenSum % k == 0 && OddSum % k == 0)
                return k;
        }
        return 1;
    }
}